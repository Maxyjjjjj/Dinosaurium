package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.MongolarachneEntity;

public class MongolarachneModel extends GeoModel<MongolarachneEntity> {
	@Override
	public ResourceLocation getAnimationResource(MongolarachneEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/cretaraneus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MongolarachneEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/cretaraneus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MongolarachneEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

}
