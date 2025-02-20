package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.IchthyosaurusEntity;

public class IchthyosaurusModel extends GeoModel<IchthyosaurusEntity> {
	@Override
	public ResourceLocation getAnimationResource(IchthyosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/ichthyosaurus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IchthyosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/ichthyosaurus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IchthyosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

}
