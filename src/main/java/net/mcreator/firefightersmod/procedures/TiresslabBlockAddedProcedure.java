package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class TiresslabBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FirefightersModMod.queueServerWork(1200, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModItems.DELETED_MOD_ELEMENT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.BURTIRES.get().defaultBlockState(), 3);
			}
		});
	}
}
