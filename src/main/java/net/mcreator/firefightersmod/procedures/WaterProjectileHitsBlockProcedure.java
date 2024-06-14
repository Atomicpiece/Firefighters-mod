package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class WaterProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.EMBERSBLOCK.get()) {
			world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.BURBLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModItems.DELETED_MOD_ELEMENT.get()) {
			world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.BURTIRES.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModItems.DELETED_MOD_ELEMENT.get()) {
			world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.BURTIRES.get().defaultBlockState(), 3);
		}
	}
}
