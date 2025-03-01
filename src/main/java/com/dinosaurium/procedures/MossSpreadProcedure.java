package com.dinosaurium.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import com.dinosaurium.init.DinosauriumModBlocks;

public class MossSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sX = 0;
		double sY = 0;
		double sZ = 0;
		boolean foundBlock = false;
		sX = -1;
		sY = -2;
		sY = -1;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 3; index1++) {
				for (int index2 = 0; index2 < 3; index2++) {
					if (world.getBrightness(LightLayer.SKY, BlockPos.containing(sX, sY, sZ)) == 9 && (world.getBlockState(BlockPos.containing(sX, sY, sZ))).getBlock() == Blocks.DIRT
							&& (world.getBlockState(BlockPos.containing(sX, sY + 1, sZ))).getBlock() == Blocks.AIR) {
						break;
					}
					sZ = sZ + 1;
				}
				if (foundBlock == true) {
					break;
				}
				sX = sX + 1;
				sZ = z - 1;
			}
			if (foundBlock == true) {
				break;
			}
			sX = x - 1;
			sY = sY + 1;
			sZ = z - 1;
		}
		if (foundBlock == true) {
			{
				BlockPos _bp = BlockPos.containing(sX, sY, sZ);
				BlockState _bs = DinosauriumModBlocks.MOSSY_DIRT.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			{
				BlockPos _bp = BlockPos.containing(sX, sY, sZ);
				BlockState _bs = Blocks.DIRT.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
