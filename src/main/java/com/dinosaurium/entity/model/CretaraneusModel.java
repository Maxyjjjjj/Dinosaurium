package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.CretaraneusEntity;

public class CretaraneusModel extends GeoModel<CretaraneusEntity> {
	@Override
	public ResourceLocation getAnimationResource(CretaraneusEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/cretaraneus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CretaraneusEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/cretaraneus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CretaraneusEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

}
