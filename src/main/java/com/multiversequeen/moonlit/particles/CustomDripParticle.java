package com.multiversequeen.moonlit.particles;

import com.multiversequeen.moonlit.fluids.CustomFluids;
import com.multiversequeen.moonlit.util.CustomTags;
import net.minecraft.client.particle.*;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.IFluidState;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CustomDripParticle extends SpriteTexturedParticle
{
    private final Fluid fluid;

    private CustomDripParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, Fluid fluid)
    {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn);
        this.setSize(0.01F, 0.01F);
        this.particleGravity = 0.06F;
        this.fluid = fluid;
    }

    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public int getBrightnessForRender(float partialTick)
    {
        return this.fluid.isIn(CustomTags.Fluids.REMEDIUM_LAVA) ? 240 : super.getBrightnessForRender(partialTick);
    }

    public void tick()
    {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.checkExpiration();
        if (!this.isExpired)
        {
            this.motionY -= (double)this.particleGravity;
            this.move(this.motionX, this.motionY, this.motionZ);
            this.changeMotion();
            if (!this.isExpired)
            {
                this.motionX *= (double)0.98F;
                this.motionY *= (double)0.98F;
                this.motionZ *= (double)0.98F;
                BlockPos blockpos = new BlockPos(this.posX, this.posY, this.posZ);
                IFluidState ifluidstate = this.world.getFluidState(blockpos);
                if (ifluidstate.getFluid() == this.fluid && this.posY < (double)((float)blockpos.getY() + ifluidstate.getActualHeight(this.world, blockpos)))
                {
                    this.setExpired();
                }

            }
        }
    }

    protected void checkExpiration()
    {
        if (this.maxAge-- <= 0) {
            this.setExpired();
        }
    }

    protected void changeMotion()
    {
    }

    @OnlyIn(Dist.CLIENT)
    static class Dripping extends CustomDripParticle
    {
        private final IParticleData particleData;

        private Dripping(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, Fluid fluid, IParticleData particleData)
        {
            super(worldIn, xCoordIn, yCoordIn, zCoordIn, fluid);
            this.particleData = particleData;
            this.particleGravity *= 0.02F;
            this.maxAge = 40;
        }

        protected void checkExpiration()
        {
            if (this.maxAge-- <= 0)
            {
                this.setExpired();
                this.world.addParticle(this.particleData, this.posX, this.posY, this.posZ, this.motionX, this.motionY, this.motionZ);
            }
        }

        protected void changeMotion()
        {
            this.motionX *= 0.02D;
            this.motionY *= 0.02D;
            this.motionZ *= 0.02D;
        }
    }

    @OnlyIn(Dist.CLIENT)
    static class DrippingRemediumLava extends CustomDripParticle.Dripping
    {
        private DrippingRemediumLava(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, Fluid fluid, IParticleData particleData)
        {
            super(worldIn, xCoordIn, yCoordIn, zCoordIn, fluid, particleData);
        }

        protected void checkExpiration()
        {
            this.particleRed = 1.0F;
            this.particleGreen = 1.0F;
            this.particleBlue = 1.0F;
            super.checkExpiration();
        }
    }

    @OnlyIn(Dist.CLIENT)
    public static class DrippingRemediumLavaFactory implements IParticleFactory<BasicParticleType>
    {
        protected final IAnimatedSprite spriteSet;

        public DrippingRemediumLavaFactory(IAnimatedSprite sprite) {
            this.spriteSet = sprite;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            CustomDripParticle.DrippingRemediumLava dripparticle$drippinglava =
                    new CustomDripParticle.DrippingRemediumLava(worldIn, x, y, z, CustomFluids.REMEDIUM_LAVA.get(), CustomParticleTypes.FALLING_REMEDIUM_LAVA.get());
            dripparticle$drippinglava.selectSpriteRandomly(this.spriteSet);
            return dripparticle$drippinglava;
        }
    }

    @OnlyIn(Dist.CLIENT)
    public static class FallingRemediumLavaFactory implements IParticleFactory<BasicParticleType>
    {
        protected final IAnimatedSprite spriteSet;

        public FallingRemediumLavaFactory(IAnimatedSprite sprite)
        {
            this.spriteSet = sprite;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            CustomDripParticle dripparticle =
                    new CustomDripParticle.FallingLiquidParticle(worldIn, x, y, z, CustomFluids.REMEDIUM_LAVA.get(), CustomParticleTypes.LANDING_REMEDIUM_LAVA.get());
            dripparticle.setColor(1.0F, 1.0F, 1.0F);
            dripparticle.selectSpriteRandomly(this.spriteSet);
            return dripparticle;
        }
    }

    @OnlyIn(Dist.CLIENT)
    static class FallingLiquidParticle extends CustomDripParticle.FallingNectarParticle
    {
        protected final IParticleData particleData;

        private FallingLiquidParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, Fluid fluid, IParticleData particleData)
        {
            super(worldIn, xCoordIn, yCoordIn, zCoordIn, fluid);
            this.particleData = particleData;
        }

        protected void changeMotion()
        {
            if (this.onGround)
            {
                this.setExpired();
                this.world.addParticle(this.particleData, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
            }

        }
    }

    @OnlyIn(Dist.CLIENT)
    static class FallingNectarParticle extends CustomDripParticle
    {
        private FallingNectarParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, Fluid fluid)
        {
            super(worldIn, xCoordIn, yCoordIn, zCoordIn, fluid);
            this.maxAge = (int)(64.0D / (Math.random() * 0.8D + 0.2D));
        }

        protected void changeMotion()
        {
            if (this.onGround)
            {
                this.setExpired();
            }

        }
    }

    @OnlyIn(Dist.CLIENT)
    static class Landing extends CustomDripParticle
    {
        private Landing(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, Fluid fluid)
        {
            super(worldIn, xCoordIn, yCoordIn, zCoordIn, fluid);
            this.maxAge = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
        }
    }

    @OnlyIn(Dist.CLIENT)
    public static class LandingRemediumLavaFactory implements IParticleFactory<BasicParticleType>
    {
        protected final IAnimatedSprite spriteSet;

        public LandingRemediumLavaFactory(IAnimatedSprite sprite)
        {
            this.spriteSet = sprite;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            CustomDripParticle dripparticle = new CustomDripParticle.Landing(worldIn, x, y, z, CustomFluids.REMEDIUM_LAVA.get());
            dripparticle.setColor(1.0F, 1.0F, 1.0F);
            dripparticle.selectSpriteRandomly(this.spriteSet);
            return dripparticle;
        }
    }
}
