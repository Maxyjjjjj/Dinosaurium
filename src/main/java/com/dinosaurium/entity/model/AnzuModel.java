package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.AnzuEntity;

public class AnzuModel extends GeoModel<AnzuEntity> {
	@Override
	public ResourceLocation getAnimationResource(AnzuEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/anzu.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AnzuEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/anzu.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AnzuEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(AnzuEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("nack");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
