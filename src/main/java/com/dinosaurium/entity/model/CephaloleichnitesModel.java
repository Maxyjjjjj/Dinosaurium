package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.CephaloleichnitesEntity;

public class CephaloleichnitesModel extends GeoModel<CephaloleichnitesEntity> {
	@Override
	public ResourceLocation getAnimationResource(CephaloleichnitesEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/cephaloleichnites.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CephaloleichnitesEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/cephaloleichnites.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CephaloleichnitesEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

}
