package com.dinosaurium.init;

import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.bus.api.SubscribeEvent;

import com.dinosaurium.configuration.CommonConfigConfiguration;
import com.dinosaurium.DinosauriumMod;

@EventBusSubscriber(modid = DinosauriumMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DinosauriumModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModList.get().getModContainerById("dinosaurium").get().registerConfig(ModConfig.Type.COMMON, CommonConfigConfiguration.SPEC, "Common.toml");
		});
	}
}
