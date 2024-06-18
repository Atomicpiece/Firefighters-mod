package net.mcreator.firefightersmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.firefightersmod.init.FirefightersModModBlocks;

public class WaterProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.SFLA.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.SFLA.get()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.EMBERSBLOCK.get()) {
			world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.BURBLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.BURNING_TIRES.get()) {
			world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.BURTIRES.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.TIRESSLAB.get()) {
			world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.BURTIRES.get().defaultBlockState(), 3);
		}
	}
}
