package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.OviraptorEntity;

public class OviraptorModel extends GeoModel<OviraptorEntity> {
	@Override
	public ResourceLocation getAnimationResource(OviraptorEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/oviraptor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OviraptorEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/oviraptor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OviraptorEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(OviraptorEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
