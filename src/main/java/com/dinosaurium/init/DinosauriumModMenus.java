
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.dinosaurium.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import com.dinosaurium.world.inventory.PaleontologyGUIMenu;
import com.dinosaurium.world.inventory.DNARecreatorGUIMenu;
import com.dinosaurium.world.inventory.DNAAnalyzerGUIMenu;
import com.dinosaurium.DinosauriumMod;

public class DinosauriumModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, DinosauriumMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<PaleontologyGUIMenu>> PALEONTOLOGY_GUI = REGISTRY.register("paleontology_gui", () -> IMenuTypeExtension.create(PaleontologyGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DNAAnalyzerGUIMenu>> DNA_ANALYZER_GUI = REGISTRY.register("dna_analyzer_gui", () -> IMenuTypeExtension.create(DNAAnalyzerGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DNARecreatorGUIMenu>> DNA_RECREATOR_GUI = REGISTRY.register("dna_recreator_gui", () -> IMenuTypeExtension.create(DNARecreatorGUIMenu::new));
}
