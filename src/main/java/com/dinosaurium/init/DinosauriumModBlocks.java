
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dinosaurium.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import com.dinosaurium.block.ZamitesWoodBlock;
import com.dinosaurium.block.ZamitesTrapdoorBlock;
import com.dinosaurium.block.ZamitesStairsBlock;
import com.dinosaurium.block.ZamitesSlabBlock;
import com.dinosaurium.block.ZamitesSaplingBlock;
import com.dinosaurium.block.ZamitesPressurePlateBlock;
import com.dinosaurium.block.ZamitesPlanksBlock;
import com.dinosaurium.block.ZamitesLogBlock;
import com.dinosaurium.block.ZamitesFrondBlock;
import com.dinosaurium.block.ZamitesFenceGateBlock;
import com.dinosaurium.block.ZamitesFenceBlock;
import com.dinosaurium.block.ZamitesDoorBlock;
import com.dinosaurium.block.ZamitesCrownBlock;
import com.dinosaurium.block.ZamitesConeBlock;
import com.dinosaurium.block.ZamitesButtonBlock;
import com.dinosaurium.block.WelwitschiaBlock;
import com.dinosaurium.block.TinOreBlock;
import com.dinosaurium.block.TinBlockBlock;
import com.dinosaurium.block.TallHorsetailBlock;
import com.dinosaurium.block.StrippedZamitesWoodBlock;
import com.dinosaurium.block.StrippedZamitesLogBlock;
import com.dinosaurium.block.RawTinBlockBlock;
import com.dinosaurium.block.PalaeontologyTableBlock;
import com.dinosaurium.block.OtozamitesBlock;
import com.dinosaurium.block.OsmundacaulisBlock;
import com.dinosaurium.block.OsmundaBlock;
import com.dinosaurium.block.MesozoicPortalFrameBlockBlock;
import com.dinosaurium.block.MesozoicPortalBlock;
import com.dinosaurium.block.LaurozamitesBlock;
import com.dinosaurium.block.HorsetailBlock;
import com.dinosaurium.block.FramedGlassBlock;
import com.dinosaurium.block.FossilBlockBlock;
import com.dinosaurium.block.EphedraBlock;
import com.dinosaurium.block.DeepslateTinOreBlock;
import com.dinosaurium.block.DeepslateFossilBlockBlock;
import com.dinosaurium.block.DeepslateBauxiteOreBlock;
import com.dinosaurium.block.DeepslateAmberOreBlock;
import com.dinosaurium.block.DNAAnalyzerBlock;
import com.dinosaurium.block.CrassostreaOysterBlockBlock;
import com.dinosaurium.block.BronzeBlockBlock;
import com.dinosaurium.block.BenettitalesBlock;
import com.dinosaurium.block.BauxiteOreBlock;
import com.dinosaurium.block.BauxiteBlockBlock;
import com.dinosaurium.block.AsphaltBlock;
import com.dinosaurium.block.AmberOreBlock;
import com.dinosaurium.block.AmberBlockBlock;
import com.dinosaurium.block.AluminiumBlockBlock;
import com.dinosaurium.DinosauriumMod;

public class DinosauriumModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DinosauriumMod.MODID);
	public static final DeferredBlock<Block> MESOZOIC_PORTAL = REGISTRY.register("mesozoic_portal", MesozoicPortalBlock::new);
	public static final DeferredBlock<Block> MESOZOIC_PORTAL_FRAME_BLOCK = REGISTRY.register("mesozoic_portal_frame_block", MesozoicPortalFrameBlockBlock::new);
	public static final DeferredBlock<Block> AMBER_ORE = REGISTRY.register("amber_ore", AmberOreBlock::new);
	public static final DeferredBlock<Block> AMBER_BLOCK = REGISTRY.register("amber_block", AmberBlockBlock::new);
	public static final DeferredBlock<Block> DEEPSLATE_AMBER_ORE = REGISTRY.register("deepslate_amber_ore", DeepslateAmberOreBlock::new);
	public static final DeferredBlock<Block> ASPHALT = REGISTRY.register("asphalt", AsphaltBlock::new);
	public static final DeferredBlock<Block> PALAEONTOLOGY_TABLE = REGISTRY.register("palaeontology_table", PalaeontologyTableBlock::new);
	public static final DeferredBlock<Block> DEEPSLATE_FOSSIL_BLOCK = REGISTRY.register("deepslate_fossil_block", DeepslateFossilBlockBlock::new);
	public static final DeferredBlock<Block> FOSSIL_BLOCK = REGISTRY.register("fossil_block", FossilBlockBlock::new);
	public static final DeferredBlock<Block> HORSETAIL = REGISTRY.register("horsetail", HorsetailBlock::new);
	public static final DeferredBlock<Block> TALL_HORSETAIL = REGISTRY.register("tall_horsetail", TallHorsetailBlock::new);
	public static final DeferredBlock<Block> OTOZAMITES = REGISTRY.register("otozamites", OtozamitesBlock::new);
	public static final DeferredBlock<Block> EPHEDRA = REGISTRY.register("ephedra", EphedraBlock::new);
	public static final DeferredBlock<Block> WELWITSCHIA = REGISTRY.register("welwitschia", WelwitschiaBlock::new);
	public static final DeferredBlock<Block> ZAMITES_WOOD = REGISTRY.register("zamites_wood", ZamitesWoodBlock::new);
	public static final DeferredBlock<Block> ZAMITES_LOG = REGISTRY.register("zamites_log", ZamitesLogBlock::new);
	public static final DeferredBlock<Block> ZAMITES_PLANKS = REGISTRY.register("zamites_planks", ZamitesPlanksBlock::new);
	public static final DeferredBlock<Block> ZAMITES_STAIRS = REGISTRY.register("zamites_stairs", ZamitesStairsBlock::new);
	public static final DeferredBlock<Block> ZAMITES_SLAB = REGISTRY.register("zamites_slab", ZamitesSlabBlock::new);
	public static final DeferredBlock<Block> ZAMITES_FENCE = REGISTRY.register("zamites_fence", ZamitesFenceBlock::new);
	public static final DeferredBlock<Block> ZAMITES_FENCE_GATE = REGISTRY.register("zamites_fence_gate", ZamitesFenceGateBlock::new);
	public static final DeferredBlock<Block> ZAMITES_PRESSURE_PLATE = REGISTRY.register("zamites_pressure_plate", ZamitesPressurePlateBlock::new);
	public static final DeferredBlock<Block> ZAMITES_BUTTON = REGISTRY.register("zamites_button", ZamitesButtonBlock::new);
	public static final DeferredBlock<Block> ZAMITES_CONE = REGISTRY.register("zamites_cone", ZamitesConeBlock::new);
	public static final DeferredBlock<Block> ZAMITES_CROWN = REGISTRY.register("zamites_crown", ZamitesCrownBlock::new);
	public static final DeferredBlock<Block> ZAMITES_FROND = REGISTRY.register("zamites_frond", ZamitesFrondBlock::new);
	public static final DeferredBlock<Block> ZAMITES_SAPLING = REGISTRY.register("zamites_sapling", ZamitesSaplingBlock::new);
	public static final DeferredBlock<Block> ZAMITES_DOOR = REGISTRY.register("zamites_door", ZamitesDoorBlock::new);
	public static final DeferredBlock<Block> ZAMITES_TRAPDOOR = REGISTRY.register("zamites_trapdoor", ZamitesTrapdoorBlock::new);
	public static final DeferredBlock<Block> STRIPPED_ZAMITES_LOG = REGISTRY.register("stripped_zamites_log", StrippedZamitesLogBlock::new);
	public static final DeferredBlock<Block> STRIPPED_ZAMITES_WOOD = REGISTRY.register("stripped_zamites_wood", StrippedZamitesWoodBlock::new);
	public static final DeferredBlock<Block> OSMUNDA = REGISTRY.register("osmunda", OsmundaBlock::new);
	public static final DeferredBlock<Block> OSMUNDACAULIS = REGISTRY.register("osmundacaulis", OsmundacaulisBlock::new);
	public static final DeferredBlock<Block> LAUROZAMITES = REGISTRY.register("laurozamites", LaurozamitesBlock::new);
	public static final DeferredBlock<Block> BENETTITALES = REGISTRY.register("benettitales", BenettitalesBlock::new);
	public static final DeferredBlock<Block> CRASSOSTREA_OYSTER_BLOCK = REGISTRY.register("crassostrea_oyster_block", CrassostreaOysterBlockBlock::new);
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
	public static final DeferredBlock<Block> DNA_ANALYZER = REGISTRY.register("dna_analyzer", DNAAnalyzerBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
