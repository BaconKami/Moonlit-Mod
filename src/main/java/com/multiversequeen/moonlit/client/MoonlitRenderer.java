package com.multiversequeen.moonlit.client;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.multiversequeen.moonlit.entities.MoonlitEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class MoonlitRenderer extends MobRenderer<MoonlitEntity, MoonlitModel> {
    public MoonlitRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new MoonlitModel(), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(MoonlitEntity entity) {
        return new ResourceLocation("moonlit" + ":textures/model/entity/moonlit.png");
    }

    @Override
    protected void applyRotations(MoonlitEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
    }
}
