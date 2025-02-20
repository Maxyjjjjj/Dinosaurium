package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.AnkylosaurusEntity;

public class AnkylosaurusModel extends GeoModel<AnkylosaurusEntity> {
	@Override
	public ResourceLocation getAnimationResource(AnkylosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/ankylosaurus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AnkylosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/ankylosaurus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AnkylosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(AnkylosaurusEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
