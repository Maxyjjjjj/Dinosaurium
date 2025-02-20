
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dinosaurium.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import com.dinosaurium.DinosauriumMod;

public class DinosauriumModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, DinosauriumMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> PORTAL_PARTICLE = REGISTRY.register("portal_particle", () -> new SimpleParticleType(false));
}
