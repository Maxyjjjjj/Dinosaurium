package com.dinosaurium.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class BabiesTargetsConditionProcedure {
	public static boolean execute(Entity sourceentity) {
		if (sourceentity == null)
			return false;
		return sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.isBaby();
	}
}
