package com.multiversequeen.moonlit.entities;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;
import software.bernie.geckolib.animation.builder.AnimationBuilder;
import software.bernie.geckolib.animation.controller.EntityAnimationController;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.event.AnimationTestEvent;
import software.bernie.geckolib.manager.EntityAnimationManager;

import javax.annotation.Nullable;

public class MoonlitEntity extends AnimalEntity implements IAnimatedEntity {
    EntityAnimationManager manager = new EntityAnimationManager();
    EntityAnimationController<MoonlitEntity> tailAnimator = new EntityAnimationController<MoonlitEntity>(this, "tailController", 20, this::animationPredicate);

    private <E extends Entity> boolean animationPredicate(AnimationTestEvent<E> eAnimationTestEvent) {
        return true;
    }


    protected MoonlitEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
        super(type, worldIn);
        registerControllers();

    }

    private void registerControllers() {
        if(world.isRemote) {
            tailAnimator.setAnimation(new AnimationBuilder().addAnimation("tail_wagging"));
            manager.addAnimationController(tailAnimator);
        }
    }


    @Nullable
    @Override
    public AgeableEntity createChild(AgeableEntity ageable) {
        return null;
    }

    @Override
    public EntityAnimationManager getAnimationManager() {
        return manager;
    }
}
