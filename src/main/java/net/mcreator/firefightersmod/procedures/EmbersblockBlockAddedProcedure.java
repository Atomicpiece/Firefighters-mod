package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class EmbersblockBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FirefightersModMod.queueServerWork(1200, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.EMBERSBLOCK.get()) {
				world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.BURBLOCK.get().defaultBlockState(), 3);
			}
		});
	}
}
