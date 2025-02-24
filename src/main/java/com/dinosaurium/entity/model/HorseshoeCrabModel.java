package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.HorseshoeCrabEntity;

public class HorseshoeCrabModel extends GeoModel<HorseshoeCrabEntity> {
	@Override
	public ResourceLocation getAnimationResource(HorseshoeCrabEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/horseshoe_crab.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HorseshoeCrabEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/horseshoe_crab.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HorseshoeCrabEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

}
