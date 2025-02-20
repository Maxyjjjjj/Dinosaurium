package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.BeipiaosaurusEntity;

public class BeipiaosaurusModel extends GeoModel<BeipiaosaurusEntity> {
	@Override
	public ResourceLocation getAnimationResource(BeipiaosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/beipiaosaurus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BeipiaosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/beipiaosaurus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BeipiaosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

}
