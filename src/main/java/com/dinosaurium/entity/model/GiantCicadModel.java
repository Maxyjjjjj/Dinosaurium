package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.GiantCicadEntity;

public class GiantCicadModel extends GeoModel<GiantCicadEntity> {
	@Override
	public ResourceLocation getAnimationResource(GiantCicadEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/giant_cicad.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GiantCicadEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/giant_cicad.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GiantCicadEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

}
