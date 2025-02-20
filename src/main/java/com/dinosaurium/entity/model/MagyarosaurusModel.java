package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.MagyarosaurusEntity;

public class MagyarosaurusModel extends GeoModel<MagyarosaurusEntity> {
	@Override
	public ResourceLocation getAnimationResource(MagyarosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/magyarosaurus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MagyarosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/magyarosaurus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MagyarosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(MagyarosaurusEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
