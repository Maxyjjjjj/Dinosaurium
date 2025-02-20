
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dinosaurium.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import com.dinosaurium.DinosauriumMod;

public class DinosauriumModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, DinosauriumMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_TYRANNOSAURUS_ROAR = REGISTRY.register("entity.tyrannosaurus.roar",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("dinosaurium", "entity.tyrannosaurus.roar")));
}
