package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.DilophosaurusEntity;

public class DilophosaurusModel extends GeoModel<DilophosaurusEntity> {
	@Override
	public ResourceLocation getAnimationResource(DilophosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/dilophosaurus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DilophosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/dilophosaurus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DilophosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

}
