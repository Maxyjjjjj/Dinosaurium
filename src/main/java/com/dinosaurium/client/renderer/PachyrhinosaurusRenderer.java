
package com.dinosaurium.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

import com.dinosaurium.procedures.BabyScaleProcedure;
import com.dinosaurium.entity.model.PachyrhinosaurusModel;
import com.dinosaurium.entity.PachyrhinosaurusEntity;

public class PachyrhinosaurusRenderer extends GeoEntityRenderer<PachyrhinosaurusEntity> {
	public PachyrhinosaurusRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PachyrhinosaurusModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(PachyrhinosaurusEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, PachyrhinosaurusEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) BabyScaleProcedure.execute(entity);
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}
}
