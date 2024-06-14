package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BurningTiresBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x + 1, y, z), FirefightersModModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z + 1), FirefightersModModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x - 1, y, z), FirefightersModModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z - 1), FirefightersModModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
		}
		FirefightersModMod.queueServerWork(1200, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModItems.DELETED_MOD_ELEMENT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), FirefightersModModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
			}
		});
	}
}
