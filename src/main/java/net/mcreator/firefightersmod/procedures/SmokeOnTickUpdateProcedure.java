package net.mcreator.firefightersmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.firefightersmod.init.FirefightersModModBlocks;
import net.mcreator.firefightersmod.FirefightersModMod;

public class SmokeOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(x, 120, z))).getBlock()) {
			FirefightersModMod.queueServerWork(400, () -> {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			});
		} else {
			if ((world.getBlockState(BlockPos.containing(x, 1 + y, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, 1 + y, z))).getBlock() == Blocks.VOID_AIR
					|| (world.getBlockState(BlockPos.containing(x, 1 + y, z))).getBlock() == Blocks.CAVE_AIR) {
				world.setBlock(BlockPos.containing(x, 1 + y, z), FirefightersModModBlocks.SMOKE.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		}
		if (!((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == FirefightersModModBlocks.SMOKE.get())) {
			if (Mth.nextInt(RandomSource.create(), 1, 5) == 1) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y, z), FirefightersModModBlocks.SMOKE.get().defaultBlockState(), 3);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 2) {
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y, z + 1), FirefightersModModBlocks.SMOKE.get().defaultBlockState(), 3);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 3) {
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y, z), FirefightersModModBlocks.SMOKE.get().defaultBlockState(), 3);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 4) {
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y, z - 1), FirefightersModModBlocks.SMOKE.get().defaultBlockState(), 3);
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 5) {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 1, z), FirefightersModModBlocks.SMOKE.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
