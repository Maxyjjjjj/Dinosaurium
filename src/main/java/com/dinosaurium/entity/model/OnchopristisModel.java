package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.OnchopristisEntity;

public class OnchopristisModel extends GeoModel<OnchopristisEntity> {
	@Override
	public ResourceLocation getAnimationResource(OnchopristisEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/onchopristis.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OnchopristisEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/onchopristis.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OnchopristisEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

}
