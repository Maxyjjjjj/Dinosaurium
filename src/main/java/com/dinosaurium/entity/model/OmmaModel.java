package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.OmmaEntity;

public class OmmaModel extends GeoModel<OmmaEntity> {
	@Override
	public ResourceLocation getAnimationResource(OmmaEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/omma.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OmmaEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/omma.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OmmaEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

}
