
package com.dinosaurium.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.Optional;

public class AraucariaSaplingBlock extends SaplingBlock {
	public static final TreeGrower TREE_GROWER = new TreeGrower("araucaria_sapling", Optional.empty(), Optional.of(getFeatureKey("dinosaurium:araucaria_tree")), Optional.empty());

	public AraucariaSaplingBlock() {
		super(TREE_GROWER, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().sound(SoundType.GRASS).instabreak().noCollission().offsetType(BlockBehaviour.OffsetType.NONE).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	private static ResourceKey<ConfiguredFeature<?, ?>> getFeatureKey(String feature) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse(feature));
	}
}
