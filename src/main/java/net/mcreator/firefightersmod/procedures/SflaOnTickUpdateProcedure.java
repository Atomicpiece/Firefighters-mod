package net.mcreator.firefightersmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.firefightersmod.init.FirefightersModModBlocks;

public class SflaOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 250) == 250) {
			world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.SMOKE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
			world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.UNIFIRE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
			world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.UNIFIRE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
			world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.UNIFIRE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
			world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.UNIFIRE.get().defaultBlockState(), 3);
		}
	}
}
