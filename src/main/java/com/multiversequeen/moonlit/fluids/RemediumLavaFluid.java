package com.multiversequeen.moonlit.fluids;

import com.multiversequeen.moonlit.Moonlit;
import com.multiversequeen.moonlit.blocks.CustomBlocks;
import com.multiversequeen.moonlit.items.CustomItems;
import com.multiversequeen.moonlit.particles.CustomParticleTypes;
import com.multiversequeen.moonlit.util.CustomTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.client.audio.Sound;
import net.minecraft.fluid.*;
import net.minecraft.item.Item;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.StateContainer;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fluids.FluidAttributes;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class RemediumLavaFluid extends FlowingFluid {
    private static final ResourceLocation STILL_RL = new ResourceLocation(Moonlit.MOD_ID, "blocks/remedium_lava_still");
    private static final ResourceLocation FLOW_RL = new ResourceLocation(Moonlit.MOD_ID, "blocks/remedium_lava_flow");

    public Fluid getFlowingFluid() {
        return CustomFluids.FLOWING_REMEDIUM_LAVA.get();
    }

    public Fluid getStillFluid() {
        return CustomFluids.REMEDIUM_LAVA.get();
    }

    public Item getFilledBucket() {
        return CustomItems.REMEDIUM_LAVA_BUCKET.get();
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(World worldIn, BlockPos pos, IFluidState state, Random random) {
        spawnSmokeParticles(worldIn, pos, random);
        BlockPos blockpos = pos.up();

        if (worldIn.getBlockState(blockpos).isAir() && !worldIn.getBlockState(blockpos).isOpaqueCube(worldIn, blockpos)) {
            if (random.nextInt(100) == 0) {
                double d0 = (double)((float)pos.getX() + random.nextFloat());
                double d1 = (double)(pos.getY() + 1);
                double d2 = (double)((float)pos.getZ() + random.nextFloat());
                worldIn.playSound(d0, d1, d2, SoundEvents.BLOCK_LAVA_POP, SoundCategory.BLOCKS, 0.2F + random.nextFloat() * 0.2F, 0.9F + random.nextFloat() * 0.15F, false);
            }

            if (random.nextInt(200) == 0) {
                worldIn.playSound((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), SoundEvents.BLOCK_LAVA_AMBIENT, SoundCategory.BLOCKS, 0.2F + random.nextFloat() * 0.2F, 0.9F + random.nextFloat() * 0.15F, false);
            }
        }

    }

    public static void spawnSmokeParticles(World worldIn, BlockPos pos, Random random) {
        worldIn.addParticle(CustomParticleTypes.REMEDIUM_LAVA_SMOKE.get(), (double)pos.getX() + 0.25D + random.nextDouble() / 2.0D * (double)(random.nextBoolean() ? 1 : -1),
                (double)pos.getY() + 0.4D, (double)pos.getZ() + 0.25D + random.nextDouble() / 2.0D * (double)(random.nextBoolean() ? 1 : -1),
                0.0D, 0.005D, 0.0D);
    }

    public void randomTick(World p_207186_1_, BlockPos pos, IFluidState state, Random random) {
        if (p_207186_1_.getGameRules().getBoolean(GameRules.DO_FIRE_TICK)) {
            int i = random.nextInt(3);
            if (i > 0) {
                BlockPos blockpos = pos;

                for(int j = 0; j < i; ++j) {
                    blockpos = blockpos.add(random.nextInt(3) - 1, 1, random.nextInt(3) - 1);
                    if (!p_207186_1_.isBlockPresent(blockpos)) {
                        return;
                    }

                }
            } else {
                for(int k = 0; k < 3; ++k) {
                    BlockPos blockpos1 = pos.add(random.nextInt(3) - 1, 0, random.nextInt(3) - 1);
                    if (!p_207186_1_.isBlockPresent(blockpos1)) {
                        return;
                    }
                }
            }

        }
    }

    @Nullable
    @OnlyIn(Dist.CLIENT)
    public IParticleData getDripParticleData() {
        return CustomParticleTypes.DRIPPING_REMEDIUM_LAVA.get();
    }

    @Override
    protected boolean canDisplace(IFluidState state, IBlockReader reader, BlockPos pos, Fluid fluid, Direction direction)
    {
        return direction == Direction.DOWN && !fluid.isIn(CustomTags.Fluids.REMEDIUM_LAVA);
    }

    @Override
    public int getTickRate(IWorldReader reader)
    {
        return reader.getDimension().doesWaterVaporize() ? 10 : 30;
    }

    @Override
    protected float getExplosionResistance()
    {
        return 100.0f;
    }

    @Override
    protected BlockState getBlockState(IFluidState state)
    {
        return CustomBlocks.REMEDIUM_LAVA.get().getDefaultState().with(FlowingFluidBlock.LEVEL, Integer.valueOf(getLevelFromState(state)));
    }

    public boolean canSourcesMultiply() { return false; }

    @Override
    protected void beforeReplacingBlock(IWorld worldIn, BlockPos pos, BlockState state)
    {
        this.triggerEffects(worldIn, pos);
    }

    public int func_215667_a(World p_215667_1_, BlockPos p_215667_2_, IFluidState p_215667_3_, IFluidState p_215667_4_) {
        int i = this.getTickRate(p_215667_1_);
        if (!p_215667_3_.isEmpty() && !p_215667_4_.isEmpty() && !p_215667_3_.get(FALLING) && !p_215667_4_.get(FALLING) && p_215667_4_.getActualHeight(p_215667_1_, p_215667_2_) > p_215667_3_.getActualHeight(p_215667_1_, p_215667_2_) && p_215667_1_.getRandom().nextInt(4) != 0) {
            i *= 4;
        }

        return i;
    }

    @Override
    protected int getSlopeFindDistance(IWorldReader worldIn)
    {
        return worldIn.getDimension().doesWaterVaporize() ? 4 : 2;
    }

    private void triggerEffects(IWorld world, BlockPos pos) {
        world.playEvent(1501, pos, 0);
    }

    @Override
    protected int getLevelDecreasePerBlock(IWorldReader worldIn)
    {
        return worldIn.getDimension().doesWaterVaporize() ? 1 : 2;
    }

    @Override
    public boolean isEquivalentTo(Fluid fluidIn)
    {
        return fluidIn == CustomFluids.REMEDIUM_LAVA.get() || fluidIn == CustomFluids.FLOWING_REMEDIUM_LAVA.get();
    }

    @Override
    protected FluidAttributes createAttributes()
    {
        return FluidAttributes.builder(STILL_RL, FLOW_RL)
                .translationKey("block.moonlit.remedium_lava")
                .density(3)
                .viscosity(3)
                .temperature(90)
                .build(this);
    }

    public static class Flowing extends RemediumLavaFluid
    {
        protected void fillStateContainer(StateContainer.Builder<Fluid, IFluidState> builder)
        {
            super.fillStateContainer(builder);
            builder.add(LEVEL_1_8);
        }

        public int getLevel(IFluidState state)
        {
            return state.get(LEVEL_1_8);
        }

        public boolean isSource(IFluidState state)
        {
            return false;
        }
    }

    public static class Source extends RemediumLavaFluid
    {
        public int getLevel(IFluidState p_207192_1_)
        {
            return 8;
        }

        public boolean isSource(IFluidState state)
        {
            return true;
        }
    }
}
