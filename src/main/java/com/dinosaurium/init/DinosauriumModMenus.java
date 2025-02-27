
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
import com.dinosaurium.DinosauriumMod;

public class DinosauriumModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, DinosauriumMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<PaleontologyGUIMenu>> PALEONTOLOGY_GUI = REGISTRY.register("paleontology_gui", () -> IMenuTypeExtension.create(PaleontologyGUIMenu::new));
}
