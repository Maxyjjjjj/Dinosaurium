package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.NemegtosaurusEntity;

public class NemegtosaurusModel extends GeoModel<NemegtosaurusEntity> {
	@Override
	public ResourceLocation getAnimationResource(NemegtosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/nemegtosaurus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NemegtosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/nemegtosaurus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NemegtosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

}
