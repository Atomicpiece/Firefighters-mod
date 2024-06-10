package net.mcreator.firefightersmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.firefightersmod.init.FirefightersModModBlocks;
import net.mcreator.firefightersmod.FirefightersModMod;

public class SmokeOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, 100, z))).getBlock() == FirefightersModModBlocks.SMOKE.get()) {
			FirefightersModMod.queueServerWork(200, () -> {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			});
		} else {
			if ((world.getBlockState(BlockPos.containing(x, 1 + y, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, 1 + y, z))).getBlock() == Blocks.VOID_AIR
					|| (world.getBlockState(BlockPos.containing(x, 1 + y, z))).getBlock() == Blocks.CAVE_AIR) {
				world.setBlock(BlockPos.containing(x, 1 + y, z), FirefightersModModBlocks.SMOKE.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		}
	}
}
