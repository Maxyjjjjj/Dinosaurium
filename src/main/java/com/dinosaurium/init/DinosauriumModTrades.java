
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package com.dinosaurium.init;

import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@EventBusSubscriber
public class DinosauriumModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(DinosauriumModItems.SINEW.get(), 10), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(DinosauriumModBlocks.EPHEDRA.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(DinosauriumModBlocks.WELWITSCHIA.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(DinosauriumModBlocks.HORSETAIL.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(DinosauriumModBlocks.OSMUNDA.get()), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.MASON) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(DinosauriumModItems.UNIDENTIFIED_FOSSIL.get(), 5), 25, 100, 0f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 50), new ItemStack(Items.TOTEM_OF_UNDYING), 3, 100, 0.05f));
		}
		if (event.getType() == DinosauriumModVillagerProfessions.PALAEONTOLOGIST.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Items.STICK), new ItemStack(Items.BRUSH), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(Items.COPPER_INGOT, 2), new ItemStack(Items.SPYGLASS), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(Items.STICK, 3), new ItemStack(DinosauriumModItems.BUG_NET.get()), 10, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(DinosauriumModBlocks.OSMUNDA.get()), new ItemStack(Items.EMERALD, 6), new ItemStack(DinosauriumModItems.OSMUNDA_ROOT.get(), 3), 10, 15, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(DinosauriumModItems.UNIDENTIFIED_FOSSIL.get()), new ItemStack(Items.EMERALD, 10), new ItemStack(DinosauriumModItems.VELOCIRAPTOR_FOSSIL.get()), 10, 50, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(DinosauriumModItems.UNIDENTIFIED_FOSSIL.get()), new ItemStack(Items.EMERALD, 10), new ItemStack(DinosauriumModItems.SHUVUUIA_FOSSIL.get()), 10, 50, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(DinosauriumModItems.UNBOILED_LAUROZAMITES_TEA.get()), new ItemStack(Items.EMERALD, 6), new ItemStack(DinosauriumModItems.LAUROZAMITES_TEA.get()), 10, 100, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.LAPIS_LAZULI), new ItemStack(Items.EMERALD, 16), new ItemStack(DinosauriumModItems.BRUHATHKAYOSAURUS_FOSSIL.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(DinosauriumModItems.UNIDENTIFIED_FOSSIL.get()), new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(DinosauriumModItems.UNIDENTIFIED_FOSSIL.get(), 2), new ItemStack(Items.EMERALD, 3), 10, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(DinosauriumModItems.UNIDENTIFIED_FOSSIL.get(), 5), new ItemStack(Items.EMERALD, 10), 10, 15, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(DinosauriumModItems.UNIDENTIFIED_FOSSIL.get(), 10), new ItemStack(Items.EMERALD, 25), 10, 50, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(DinosauriumModItems.UNIDENTIFIED_FOSSIL.get(), 21), new ItemStack(Items.EMERALD, 64), 10, 100, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(DinosauriumModItems.AMBER.get()), new ItemStack(DinosauriumModItems.AMBER_FOSSIL.get()), 10, 10, 0.05f));
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(DinosauriumModItems.RAW_ORNITHOMIMOSAUR.get()), new ItemStack(DinosauriumModItems.COOKED_ORNITHOMIMOSAUR.get()), 10, 50, 0.05f));
		}
	}
}
