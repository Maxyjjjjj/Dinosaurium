
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

import com.dinosaurium.procedures.DiplodocusBabyScaleProcedure;
import com.dinosaurium.entity.model.BruhathkayosaurusModel;
import com.dinosaurium.entity.BruhathkayosaurusEntity;

public class BruhathkayosaurusRenderer extends GeoEntityRenderer<BruhathkayosaurusEntity> {
	public BruhathkayosaurusRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BruhathkayosaurusModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(BruhathkayosaurusEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, BruhathkayosaurusEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) DiplodocusBabyScaleProcedure.execute(entity);
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}
}
