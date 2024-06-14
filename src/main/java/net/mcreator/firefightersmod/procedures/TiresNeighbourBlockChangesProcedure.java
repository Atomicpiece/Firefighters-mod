package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.eventbus.api.Event;

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
					world.setBlock(BlockPos.containing(x, y, z), FirefightersModModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
				}
			});
		}
	}
}
