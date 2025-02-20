package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.ParapuzosiaEntity;

public class ParapuzosiaModel extends GeoModel<ParapuzosiaEntity> {
	@Override
	public ResourceLocation getAnimationResource(ParapuzosiaEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/parapuzosia.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ParapuzosiaEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/parapuzosia.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ParapuzosiaEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

}
