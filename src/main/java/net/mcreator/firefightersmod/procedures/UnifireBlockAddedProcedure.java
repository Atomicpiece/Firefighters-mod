package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class UnifireBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == FirefightersModModBlocks.SMOKE.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.VOID_AIR
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
