package net.mcreator.firefightersmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.firefightersmod.init.FirefightersModModBlocks;
import net.mcreator.firefightersmod.FirefightersModMod;

public class TiresNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == FirefightersModModBlocks.UNIFIRE.get() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get() || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == FirefightersModModBlocks.UNIFIRE.get()) {
			FirefightersModMod.queueServerWork(40, () -> {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.TIRES.get() && ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get()
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get() || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == FirefightersModModBlocks.UNIFIRE.get()
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == FirefightersModModBlocks.UNIFIRE.get())) {
					world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.BURNING_TIRES.get().defaultBlockState(), 3);
				}
			});
		}
	}
}
