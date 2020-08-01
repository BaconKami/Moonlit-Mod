package com.multiversequeen.moonlit.particles;

import net.minecraft.client.particle.*;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RemediumLavaSmoke extends SpriteTexturedParticle
{
    protected RemediumLavaSmoke(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn)
    {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, zSpeedIn);

        float f = this.rand.nextFloat() * 1.0F;
        this.particleRed = f;
        this.particleGreen = f;
        this.particleBlue  = f;

        this.setSize(5F, 5F);
        this.particleScale *= this.rand.nextFloat() * 1.1F;
        this.motionX *= (double)0.04F;
        this.motionY *= (double)0.4F;
        this.motionZ *= (double)0.04F;
        this.maxAge = 40 - (int)(Math.random() * 10D);
    }

    @Override
    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    @Override
    public void tick()
    {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.maxAge-- <= 0)
        {
            this.setExpired();
        }
        else
        {
            this.move (this.motionX, this.motionY, this.motionZ);
            this.motionX *= 1.0D;
            this.motionY *= 1.0D;
            this.motionZ *= 1.0D;
        }
    }

    @OnlyIn(Dist.CLIENT)
    public static class Factory implements IParticleFactory<BasicParticleType>
    {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite sprite)
        {
            this.spriteSet = sprite;
        }

        @Override
        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
        {
            RemediumLavaSmoke particle = new RemediumLavaSmoke(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
            particle.setColor(1.0F, 1.0F, 1.0F);
            particle.selectSpriteRandomly(this.spriteSet);
            return particle;
        }
    }
}
