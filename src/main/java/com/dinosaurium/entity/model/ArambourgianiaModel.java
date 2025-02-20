package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.ArambourgianiaEntity;

public class ArambourgianiaModel extends GeoModel<ArambourgianiaEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArambourgianiaEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/arambourgiania.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArambourgianiaEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/arambourgiania.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArambourgianiaEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ArambourgianiaEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("neck2");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
