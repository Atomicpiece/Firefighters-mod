package net.mcreator.firefightersmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.firefightersmod.init.FirefightersModModBlocks;

public class SflaOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 250) == 250) {
			world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.SMOKE.get().defaultBlockState(), 3);
		}
	}
}
