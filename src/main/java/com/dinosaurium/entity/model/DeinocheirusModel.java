package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.DeinocheirusEntity;

public class DeinocheirusModel extends GeoModel<DeinocheirusEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeinocheirusEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/deinocherius.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeinocheirusEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/deinocherius.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeinocheirusEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(DeinocheirusEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
