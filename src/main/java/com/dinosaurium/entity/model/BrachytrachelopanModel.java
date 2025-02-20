package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.BrachytrachelopanEntity;

public class BrachytrachelopanModel extends GeoModel<BrachytrachelopanEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrachytrachelopanEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/brachytrachelopan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrachytrachelopanEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/brachytrachelopan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrachytrachelopanEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BrachytrachelopanEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
