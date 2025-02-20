
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.dinosaurium.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import com.dinosaurium.client.gui.PaleontologyGUIScreen;
import com.dinosaurium.client.gui.AltarGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DinosauriumModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(DinosauriumModMenus.ALTAR_GUI.get(), AltarGUIScreen::new);
		event.register(DinosauriumModMenus.PALEONTOLOGY_GUI.get(), PaleontologyGUIScreen::new);
	}
}
