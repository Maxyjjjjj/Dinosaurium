package com.dinosaurium.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import com.dinosaurium.entity.TherizinosaurusEntity;

public class TherizinosaurusModel extends GeoModel<TherizinosaurusEntity> {
	@Override
	public ResourceLocation getAnimationResource(TherizinosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:animations/therizinosaurus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TherizinosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:geo/therizinosaurus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TherizinosaurusEntity entity) {
		return ResourceLocation.parse("dinosaurium:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(TherizinosaurusEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
