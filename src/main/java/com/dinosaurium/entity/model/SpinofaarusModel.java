package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.SpinofaarusEntity;

public class SpinofaarusModel extends GeoModel<SpinofaarusEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpinofaarusEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/spinofaarus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpinofaarusEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/spinofaarus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpinofaarusEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

}
