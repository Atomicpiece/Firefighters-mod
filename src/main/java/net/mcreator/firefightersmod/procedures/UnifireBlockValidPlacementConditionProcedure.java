package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class UnifireBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.SFLA.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.VOID_AIR
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CAVE_AIR)
				&& world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()
				&& !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BUBBLE_COLUMN || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LAVA
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LAVA)) {
			return true;
		}
		return false;
	}
}
