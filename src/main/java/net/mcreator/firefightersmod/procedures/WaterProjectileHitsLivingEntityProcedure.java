package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class WaterProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (FirefightersModModParticleTypes.DELETED_MOD_ELEMENT.get()), x, y, z, 1, 0.1, 0.1, 0.1, 0.1);
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
