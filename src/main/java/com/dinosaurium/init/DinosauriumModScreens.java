
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.dinosaurium.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import com.dinosaurium.client.gui.PaleontologyGUIScreen;
import com.dinosaurium.client.gui.DNARecreatorGUIScreen;
import com.dinosaurium.client.gui.DNAAnalyzerGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DinosauriumModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(DinosauriumModMenus.PALEONTOLOGY_GUI.get(), PaleontologyGUIScreen::new);
		event.register(DinosauriumModMenus.DNA_ANALYZER_GUI.get(), DNAAnalyzerGUIScreen::new);
		event.register(DinosauriumModMenus.DNA_RECREATOR_GUI.get(), DNARecreatorGUIScreen::new);
	}
}
