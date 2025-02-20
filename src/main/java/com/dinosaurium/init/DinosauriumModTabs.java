
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dinosaurium.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.dinosaurium.DinosauriumMod;

public class DinosauriumModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DinosauriumMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DINOSAURIUM_TAB = REGISTRY.register("dinosaurium_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dinosaurium.dinosaurium_tab")).icon(() -> new ItemStack(Items.BRUSH)).displayItems((parameters, tabData) -> {
				tabData.accept(DinosauriumModItems.VELOCIRAPTOR_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.SHUVUUIA_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.AUSTRORAPTOR_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.DIPLODOCUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.QUETZALCOATLUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.MICRORAPTOR_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.HATZEGOPTERYX_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.ARAMBOURGIANIA_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.ICHTHYOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.ANKYLOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.GALLIMIMUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.DEINOCHEIRUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.STEGOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.TRICERATOPS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.TYRANNOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.ONCHOPRISTIS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.SPINOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.AMARGASAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.THERIZINOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.PARASAUROLOPHUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.SINOSAUROPTERYX_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.NIGERSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.IGUANODON_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.COMPSOGNATHUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.OVIRAPTOR_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.PTERANODON_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.BRUHATHKAYOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.NYCTOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.BRACHYTRACHELOPAN_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.MIRAGAIA_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.TUOJIANGOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.PROTOCERATOPS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.ARCHAEOPTERYX_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.OLOROTITAN_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.MAGYAROSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.NEMEGTOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.PACHYRHINOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.NANUQSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.PARAPUZOSIA_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.ORODROMEUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.CEPHALOLEICHNITES_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.KOL_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.ANZU_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.BEIPIAOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.ZHENYUANLONG_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.DILOPHOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.EDMONTOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.PACHYCEPHALOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.CRETARANEUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.MONGOLARACHNE_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.COELOPHYSIS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.JEHOLOPTERUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.HALSZKARAPTOR_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.PSITTACOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.YUTYRANNUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.REPENOMAMUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.MAMENCHISAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.OMMA_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.NANNOGOMPHUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModBlocks.MESOZOIC_PORTAL_FRAME_BLOCK.get().asItem());
				tabData.accept(DinosauriumModItems.MESOZOIC.get());
				tabData.accept(DinosauriumModItems.SAWFISH_SWORD.get());
				tabData.accept(DinosauriumModBlocks.DEEPSLATE_AMBER_ORE.get().asItem());
				tabData.accept(DinosauriumModBlocks.AMBER_ORE.get().asItem());
				tabData.accept(DinosauriumModBlocks.AMBER_BLOCK.get().asItem());
				tabData.accept(DinosauriumModBlocks.ASPHALT.get().asItem());
				tabData.accept(DinosauriumModItems.AMBER.get());
				tabData.accept(DinosauriumModBlocks.PALAEONTOLOGY_TABLE.get().asItem());
				tabData.accept(DinosauriumModBlocks.DEEPSLATE_FOSSIL_BLOCK.get().asItem());
				tabData.accept(DinosauriumModBlocks.FOSSIL_BLOCK.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_WOOD.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_LOG.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_PLANKS.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_STAIRS.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_SLAB.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_FENCE.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_FENCE_GATE.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_PRESSURE_PLATE.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_BUTTON.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_DOOR.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_TRAPDOOR.get().asItem());
				tabData.accept(DinosauriumModBlocks.STRIPPED_ZAMITES_LOG.get().asItem());
				tabData.accept(DinosauriumModBlocks.STRIPPED_ZAMITES_WOOD.get().asItem());
				tabData.accept(DinosauriumModItems.BUG_NET.get());
				tabData.accept(DinosauriumModItems.SINEW.get());
				tabData.accept(DinosauriumModItems.PYCNOFIBER.get());
				tabData.accept(DinosauriumModItems.GIANT_CICADA_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.LAMBEOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.OURANOSAURUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.DSUNGARIPTERUS_SPAWN_EGG.get());
				tabData.accept(DinosauriumModBlocks.CRASSOSTREA_OYSTER_BLOCK.get().asItem());
				tabData.accept(DinosauriumModItems.PTERODAUSTRO_SPAWN_EGG.get());
				tabData.accept(DinosauriumModItems.LISOWICIA_SPAWN_EGG.get());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DINOSAURIUM_FOSSILS = REGISTRY.register("dinosaurium_fossils",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dinosaurium.dinosaurium_fossils")).icon(() -> new ItemStack(DinosauriumModItems.VELOCIRAPTOR_FOSSIL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DinosauriumModItems.UNIDENTIFIED_FOSSIL.get());
				tabData.accept(DinosauriumModBlocks.DEEPSLATE_FOSSIL_BLOCK.get().asItem());
				tabData.accept(DinosauriumModBlocks.FOSSIL_BLOCK.get().asItem());
				tabData.accept(DinosauriumModItems.VELOCIRAPTOR_FOSSIL.get());
				tabData.accept(DinosauriumModItems.SHUVUUIA_FOSSIL.get());
				tabData.accept(DinosauriumModItems.AUSTRORAPTOR_FOSSIL.get());
				tabData.accept(DinosauriumModItems.DIPLODOCUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.QUETZALCOATLUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.MICRORAPTOR_FOSSIL.get());
				tabData.accept(DinosauriumModItems.HATZEGOPTERYX_FOSSIL.get());
				tabData.accept(DinosauriumModItems.ARAMOURGIANIA_FOSSIL.get());
				tabData.accept(DinosauriumModItems.ICHTHYOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.ANKYLOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.GALLIMIMUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.DEINOCHEIRUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.STEGOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.TRICEPATOPS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.TYRANNOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.SPINOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.AMARGASAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.THERIZINOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.PARASAUROLOPHUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.SINOSAUROPTERYX_FOSSIL.get());
				tabData.accept(DinosauriumModItems.NIGERSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.IGUANODON_FOSSIL.get());
				tabData.accept(DinosauriumModItems.COMPSOGNATHUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.OVIRAPTOR_FOSSIL.get());
				tabData.accept(DinosauriumModItems.PTERANODON_FOSSIL.get());
				tabData.accept(DinosauriumModItems.PACHYCEPHALOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.BRUHATHKAYOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.NYCTOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.BRACHYTRACHELOPAN_FOSSIL.get());
				tabData.accept(DinosauriumModItems.MIRAGAIA_FOSSIL.get());
				tabData.accept(DinosauriumModItems.TUOJIANGOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.PROTOCERATOPS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.ARCHAEOPTERYX_FOSSIL.get());
				tabData.accept(DinosauriumModItems.OLOROTITAN_FOSSIL.get());
				tabData.accept(DinosauriumModItems.MAGYAROSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.NEMEGTOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.PACHYRHINOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.NANUQSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.PARAPUZOSIA_FOSSIL.get());
				tabData.accept(DinosauriumModItems.ORODROMEUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.KOL_FOSSIL.get());
				tabData.accept(DinosauriumModItems.ANZU_FOSSIL.get());
				tabData.accept(DinosauriumModItems.BEIPIAOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.ZHENYUANLONG_FOSSIL.get());
				tabData.accept(DinosauriumModItems.DILOPHOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.EDMONTOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.COELOPHYSIS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.HALSZKARAPTOR_FOSSIL.get());
				tabData.accept(DinosauriumModItems.JEHOLOPTERUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.PSITTACOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.YUTYRANNUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.REPENOMAMUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.MAMENCHISAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.LAMBEOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.OURANOSAURUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.PTERODAUSTRO_FOSSIL.get());
				tabData.accept(DinosauriumModItems.DSUNGARIPTERUS_FOSSIL.get());
				tabData.accept(DinosauriumModItems.LISOWICIA_FOSSIL.get());
			}).withSearchBar().withTabsBefore(DINOSAURIUM_TAB.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DINOSAURIUM_GENETICS = REGISTRY.register("dinosaurium_genetics",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dinosaurium.dinosaurium_genetics")).icon(() -> new ItemStack(DinosauriumModItems.EMPTY_VIAL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DinosauriumModItems.EMPTY_VIAL.get());
				tabData.accept(DinosauriumModItems.VELOCIRAPTOR_DNA.get());
				tabData.accept(DinosauriumModItems.SHUVUUIA_DNA.get());
				tabData.accept(DinosauriumModItems.AUSTRORAPTOR_DNA.get());
				tabData.accept(DinosauriumModItems.DIPLODOCUS_DNA.get());
				tabData.accept(DinosauriumModItems.QUETZALCOATLUS_DNA.get());
				tabData.accept(DinosauriumModItems.MICRORAPTOR_DNA.get());
				tabData.accept(DinosauriumModItems.HATZEGOPTERYX_DNA.get());
				tabData.accept(DinosauriumModItems.ARAMBOURGIANIA_DNA.get());
				tabData.accept(DinosauriumModItems.ICHTHYOSAURUS_DNA.get());
				tabData.accept(DinosauriumModItems.ANKYLOSAURUS_DNA.get());
				tabData.accept(DinosauriumModItems.GALLIMIMUS_DNA.get());
				tabData.accept(DinosauriumModItems.DEINOCHEIRUS_DNA.get());
				tabData.accept(DinosauriumModItems.STEGOSAURUS_DNA.get());
				tabData.accept(DinosauriumModItems.TRICERATOPS_DNA.get());
				tabData.accept(DinosauriumModItems.TYRANNOSAURUS_DNA.get());
				tabData.accept(DinosauriumModItems.ONCHOPRISTIS_DNA.get());
				tabData.accept(DinosauriumModItems.SPINOSAURUS_DNA.get());
				tabData.accept(DinosauriumModItems.AMARGASAURUS_DNA.get());
				tabData.accept(DinosauriumModItems.THERIZINOSAURUS_DNA.get());
				tabData.accept(DinosauriumModItems.PARASAUROLOPHUS_DNA.get());
				tabData.accept(DinosauriumModItems.SINOSAUROPTERYX_DNA.get());
				tabData.accept(DinosauriumModItems.NIGERSAURUS_DNA.get());
				tabData.accept(DinosauriumModItems.IGUANODON_DNA.get());
				tabData.accept(DinosauriumModItems.COMPSOGNATHUS_DNA.get());
				tabData.accept(DinosauriumModItems.OVIRAPTOR_DNA.get());
				tabData.accept(DinosauriumModItems.PTERANODON_DNA.get());
				tabData.accept(DinosauriumModItems.BRUHATHKAYOSAURUS_DNA.get());
				tabData.accept(DinosauriumModItems.NYCTOSAURUS_DNA.get());
				tabData.accept(DinosauriumModItems.BRACHYTRACHELOPAN_DNA.get());
				tabData.accept(DinosauriumModItems.MIRAGAIA_DNA.get());
				tabData.accept(DinosauriumModItems.TUOJIANGOSAURUS_DNA.get());
				tabData.accept(DinosauriumModItems.PROTOCERATOPS_DNA.get());
				tabData.accept(DinosauriumModItems.ARCHAEOPTERYX_DNA.get());
				tabData.accept(DinosauriumModItems.OLOROTITAN_DNA.get());
			}).withTabsBefore(DINOSAURIUM_FOSSILS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DINOSAURIUM_FOODSTUFFS = REGISTRY.register("dinosaurium_foodstuffs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dinosaurium.dinosaurium_foodstuffs")).icon(() -> new ItemStack(DinosauriumModItems.RAW_ORNITHOMIMOSAUR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DinosauriumModItems.RAW_ORNITHOMIMOSAUR.get());
				tabData.accept(DinosauriumModItems.COOKED_ORNITHOMIMOSAUR.get());
				tabData.accept(DinosauriumModItems.CEPHALOLEICHNITES_ITEM.get());
				tabData.accept(DinosauriumModItems.CRETARANEUS_ITEM.get());
				tabData.accept(DinosauriumModItems.MONGOLARACHNE_ITEM.get());
				tabData.accept(DinosauriumModItems.FRIED_SPIDER.get());
				tabData.accept(DinosauriumModItems.OMMA_ITEM.get());
				tabData.accept(DinosauriumModItems.MASHED_BUGS.get());
				tabData.accept(DinosauriumModItems.NANNOGOMPHUS_ITEM.get());
				tabData.accept(DinosauriumModItems.GIANT_CICADA_ITEM.get());
				tabData.accept(DinosauriumModItems.CRASSOSTREA_OYSTER.get());
				tabData.accept(DinosauriumModItems.OYSTER_SOUP.get());
				tabData.accept(DinosauriumModItems.RAW_OYSTER.get());
			}).withTabsBefore(DINOSAURIUM_GENETICS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DINOSAURIUM_PLANTS = REGISTRY.register("dinosaurium_plants",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dinosaurium.dinosaurium_plants")).icon(() -> new ItemStack(DinosauriumModBlocks.HORSETAIL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DinosauriumModBlocks.HORSETAIL.get().asItem());
				tabData.accept(DinosauriumModBlocks.TALL_HORSETAIL.get().asItem());
				tabData.accept(DinosauriumModBlocks.OTOZAMITES.get().asItem());
				tabData.accept(DinosauriumModBlocks.EPHEDRA.get().asItem());
				tabData.accept(DinosauriumModBlocks.WELWITSCHIA.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_WOOD.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_LOG.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_CONE.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_CROWN.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_FROND.get().asItem());
				tabData.accept(DinosauriumModBlocks.ZAMITES_SAPLING.get().asItem());
				tabData.accept(DinosauriumModBlocks.STRIPPED_ZAMITES_LOG.get().asItem());
				tabData.accept(DinosauriumModBlocks.STRIPPED_ZAMITES_WOOD.get().asItem());
				tabData.accept(DinosauriumModBlocks.OSMUNDA.get().asItem());
				tabData.accept(DinosauriumModBlocks.OSMUNDACAULIS.get().asItem());
				tabData.accept(DinosauriumModBlocks.LAUROZAMITES.get().asItem());
				tabData.accept(DinosauriumModBlocks.BENETTITALES.get().asItem());
			}).withTabsBefore(DINOSAURIUM_FOODSTUFFS.getId()).build());
}
