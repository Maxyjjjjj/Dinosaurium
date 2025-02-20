package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.EdmontosaurusEntity;

public class EdmontosaurusModel extends GeoModel<EdmontosaurusEntity> {
	@Override
	public ResourceLocation getAnimationResource(EdmontosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/edmontosaurus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EdmontosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/edmontosaurus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EdmontosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(EdmontosaurusEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
