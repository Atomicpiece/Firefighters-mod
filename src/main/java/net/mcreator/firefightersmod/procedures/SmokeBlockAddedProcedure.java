package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class SmokeBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FirefightersModMod.queueServerWork(100, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.SMOKE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		});
	}
}
