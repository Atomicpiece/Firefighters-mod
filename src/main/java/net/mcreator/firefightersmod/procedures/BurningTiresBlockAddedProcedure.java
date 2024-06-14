package net.mcreator.firefightersmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.firefightersmod.init.FirefightersModModBlocks;
import net.mcreator.firefightersmod.FirefightersModMod;

public class BurningTiresBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x + 1, y, z), FirefightersModModBlocks.TIRESSLAB.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z + 1), FirefightersModModBlocks.TIRESSLAB.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x - 1, y, z), FirefightersModModBlocks.TIRESSLAB.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z - 1), FirefightersModModBlocks.TIRESSLAB.get().defaultBlockState(), 3);
		}
		FirefightersModMod.queueServerWork(1200, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.BURNING_TIRES.get()) {
				world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.BURTIRES.get().defaultBlockState(), 3);
			}
		});
	}
}
