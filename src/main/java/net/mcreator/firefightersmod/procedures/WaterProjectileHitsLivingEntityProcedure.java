package net.mcreator.firefightersmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.firefightersmod.init.FirefightersModModParticleTypes;
import net.mcreator.firefightersmod.init.FirefightersModModBlocks;

public class WaterProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (FirefightersModModParticleTypes.WATTER.get()), x, y, z, 1, 0.1, 0.1, 0.1, 0.1);
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
