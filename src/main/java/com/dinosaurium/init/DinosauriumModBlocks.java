
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dinosaurium.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import com.dinosaurium.block.WelwitschiaBlock;
import com.dinosaurium.block.TinTilesBlock;
import com.dinosaurium.block.TinOreBlock;
import com.dinosaurium.block.TinBlockBlock;
import com.dinosaurium.block.TallHorsetailBlock;
import com.dinosaurium.block.ResurrectionAltarBlock;
import com.dinosaurium.block.RawTinBlockBlock;
import com.dinosaurium.block.PalaeontologyTableBlock;
import com.dinosaurium.block.OsmundaBlock;
import com.dinosaurium.block.MossyDirtBlock;
import com.dinosaurium.block.LiverwortsBlock;
import com.dinosaurium.block.LaurozamitesBlock;
import com.dinosaurium.block.HorsetailBlock;
import com.dinosaurium.block.FramedGlassBlock;
import com.dinosaurium.block.FossilBlockBlock;
import com.dinosaurium.block.EphedraBlock;
import com.dinosaurium.block.DeepslateTinOreBlock;
import com.dinosaurium.block.DeepslateFossilBlockBlock;
import com.dinosaurium.block.DeepslateBauxiteOreBlock;
import com.dinosaurium.block.DeepslateAmberOreBlock;
import com.dinosaurium.block.CutTinStairsBlock;
import com.dinosaurium.block.CutTinSlabBlock;
import com.dinosaurium.block.CutTinBlock;
import com.dinosaurium.block.ChiseledTinBlock;
import com.dinosaurium.block.BronzeBlockBlock;
import com.dinosaurium.block.BauxiteOreBlock;
import com.dinosaurium.block.BauxiteBlockBlock;
import com.dinosaurium.block.AraucariaWoodBlock;
import com.dinosaurium.block.AraucariaTrapdoorBlock;
import com.dinosaurium.block.AraucariaStairsBlock;
import com.dinosaurium.block.AraucariaSlabBlock;
import com.dinosaurium.block.AraucariaSaplingBlock;
import com.dinosaurium.block.AraucariaPressurePlateBlock;
import com.dinosaurium.block.AraucariaPlanksBlock;
import com.dinosaurium.block.AraucariaLogBlock;
import com.dinosaurium.block.AraucariaLeavesBlock;
import com.dinosaurium.block.AraucariaFenceGateBlock;
import com.dinosaurium.block.AraucariaFenceBlock;
import com.dinosaurium.block.AraucariaDoorBlock;
import com.dinosaurium.block.AraucariaButtonBlock;
import com.dinosaurium.block.AmberOreBlock;
import com.dinosaurium.block.AmberBlockBlock;
import com.dinosaurium.block.AluminiumBlockBlock;
import com.dinosaurium.DinosauriumMod;

public class DinosauriumModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DinosauriumMod.MODID);
	public static final DeferredBlock<Block> AMBER_ORE = REGISTRY.register("amber_ore", AmberOreBlock::new);
	public static final DeferredBlock<Block> AMBER_BLOCK = REGISTRY.register("amber_block", AmberBlockBlock::new);
	public static final DeferredBlock<Block> DEEPSLATE_AMBER_ORE = REGISTRY.register("deepslate_amber_ore", DeepslateAmberOreBlock::new);
	public static final DeferredBlock<Block> PALAEONTOLOGY_TABLE = REGISTRY.register("palaeontology_table", PalaeontologyTableBlock::new);
	public static final DeferredBlock<Block> DEEPSLATE_FOSSIL_BLOCK = REGISTRY.register("deepslate_fossil_block", DeepslateFossilBlockBlock::new);
	public static final DeferredBlock<Block> FOSSIL_BLOCK = REGISTRY.register("fossil_block", FossilBlockBlock::new);
	public static final DeferredBlock<Block> HORSETAIL = REGISTRY.register("horsetail", HorsetailBlock::new);
	public static final DeferredBlock<Block> TALL_HORSETAIL = REGISTRY.register("tall_horsetail", TallHorsetailBlock::new);
	public static final DeferredBlock<Block> EPHEDRA = REGISTRY.register("ephedra", EphedraBlock::new);
	public static final DeferredBlock<Block> WELWITSCHIA = REGISTRY.register("welwitschia", WelwitschiaBlock::new);
	public static final DeferredBlock<Block> OSMUNDA = REGISTRY.register("osmunda", OsmundaBlock::new);
	public static final DeferredBlock<Block> LAUROZAMITES = REGISTRY.register("laurozamites", LaurozamitesBlock::new);
	public static final DeferredBlock<Block> ALUMINIUM_BLOCK = REGISTRY.register("aluminium_block", AluminiumBlockBlock::new);
	public static final DeferredBlock<Block> BAUXITE_ORE = REGISTRY.register("bauxite_ore", BauxiteOreBlock::new);
	public static final DeferredBlock<Block> TIN_ORE = REGISTRY.register("tin_ore", TinOreBlock::new);
	public static final DeferredBlock<Block> TIN_BLOCK = REGISTRY.register("tin_block", TinBlockBlock::new);
	public static final DeferredBlock<Block> BAUXITE_BLOCK = REGISTRY.register("bauxite_block", BauxiteBlockBlock::new);
	public static final DeferredBlock<Block> RAW_TIN_BLOCK = REGISTRY.register("raw_tin_block", RawTinBlockBlock::new);
	public static final DeferredBlock<Block> DEEPSLATE_BAUXITE_ORE = REGISTRY.register("deepslate_bauxite_ore", DeepslateBauxiteOreBlock::new);
	public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = REGISTRY.register("deepslate_tin_ore", DeepslateTinOreBlock::new);
	public static final DeferredBlock<Block> BRONZE_BLOCK = REGISTRY.register("bronze_block", BronzeBlockBlock::new);
	public static final DeferredBlock<Block> FRAMED_GLASS = REGISTRY.register("framed_glass", FramedGlassBlock::new);
	public static final DeferredBlock<Block> TIN_TILES = REGISTRY.register("tin_tiles", TinTilesBlock::new);
	public static final DeferredBlock<Block> CUT_TIN = REGISTRY.register("cut_tin", CutTinBlock::new);
	public static final DeferredBlock<Block> CUT_TIN_STAIRS = REGISTRY.register("cut_tin_stairs", CutTinStairsBlock::new);
	public static final DeferredBlock<Block> CUT_TIN_SLAB = REGISTRY.register("cut_tin_slab", CutTinSlabBlock::new);
	public static final DeferredBlock<Block> CHISELED_TIN = REGISTRY.register("chiseled_tin", ChiseledTinBlock::new);
	public static final DeferredBlock<Block> ARAUCARIA_WOOD = REGISTRY.register("araucaria_wood", AraucariaWoodBlock::new);
	public static final DeferredBlock<Block> ARAUCARIA_LOG = REGISTRY.register("araucaria_log", AraucariaLogBlock::new);
	public static final DeferredBlock<Block> ARAUCARIA_PLANKS = REGISTRY.register("araucaria_planks", AraucariaPlanksBlock::new);
	public static final DeferredBlock<Block> ARAUCARIA_LEAVES = REGISTRY.register("araucaria_leaves", AraucariaLeavesBlock::new);
	public static final DeferredBlock<Block> ARAUCARIA_STAIRS = REGISTRY.register("araucaria_stairs", AraucariaStairsBlock::new);
	public static final DeferredBlock<Block> ARAUCARIA_SLAB = REGISTRY.register("araucaria_slab", AraucariaSlabBlock::new);
	public static final DeferredBlock<Block> ARAUCARIA_FENCE = REGISTRY.register("araucaria_fence", AraucariaFenceBlock::new);
	public static final DeferredBlock<Block> ARAUCARIA_FENCE_GATE = REGISTRY.register("araucaria_fence_gate", AraucariaFenceGateBlock::new);
	public static final DeferredBlock<Block> ARAUCARIA_PRESSURE_PLATE = REGISTRY.register("araucaria_pressure_plate", AraucariaPressurePlateBlock::new);
	public static final DeferredBlock<Block> ARAUCARIA_BUTTON = REGISTRY.register("araucaria_button", AraucariaButtonBlock::new);
	public static final DeferredBlock<Block> ARAUCARIA_DOOR = REGISTRY.register("araucaria_door", AraucariaDoorBlock::new);
	public static final DeferredBlock<Block> ARAUCARIA_TRAPDOOR = REGISTRY.register("araucaria_trapdoor", AraucariaTrapdoorBlock::new);
	public static final DeferredBlock<Block> ARAUCARIA_SAPLING = REGISTRY.register("araucaria_sapling", AraucariaSaplingBlock::new);
	public static final DeferredBlock<Block> RESURRECTION_ALTAR = REGISTRY.register("resurrection_altar", ResurrectionAltarBlock::new);
	public static final DeferredBlock<Block> MOSSY_DIRT = REGISTRY.register("mossy_dirt", MossyDirtBlock::new);
	public static final DeferredBlock<Block> LIVERWORTS = REGISTRY.register("liverworts", LiverwortsBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			MossyDirtBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			MossyDirtBlock.itemColorLoad(event);
		}
	}
}
