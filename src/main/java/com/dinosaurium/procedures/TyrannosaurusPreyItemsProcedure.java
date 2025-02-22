package com.dinosaurium.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TyrannosaurusPreyItemsProcedure {
	public static boolean execute(Entity sourceentity) {
		if (sourceentity == null)
			return false;
		return sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("dinosaurium:tyrannosaurus_prey")));
	}
}
