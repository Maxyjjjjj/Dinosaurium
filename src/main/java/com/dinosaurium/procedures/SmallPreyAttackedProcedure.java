package com.dinosaurium.procedures;

import net.neoforged.neoforge.event.entity.living.LivingChangeTargetEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SmallPreyAttackedProcedure {
	@SubscribeEvent
	public static void onEntitySetsAttackTarget(LivingChangeTargetEvent event) {
		execute(event, event.getEntity());
	}

	public static boolean execute(Entity sourceentity) {
		return execute(null, sourceentity);
	}

	private static boolean execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return false;
		return sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("dinosaurium:small_prey")));
	}
}
