package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class TiresslabOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (Mth.nextInt(RandomSource.create(), 1, 4800) == 4800) {
			sx = -3;
			found = false;
			for (int index0 = 0; index0 < 6; index0++) {
				sy = -3;
				for (int index1 = 0; index1 < 6; index1++) {
					sz = -3;
					for (int index2 = 0; index2 < 6; index2++) {
						if (!world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)).canOcclude()) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), FirefightersModModBlocks.SMOKE.get().defaultBlockState(), 3);
							found = true;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (found == true) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.furnace.fire_crackle")), SoundSource.MASTER, 1, 2);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.furnace.fire_crackle")), SoundSource.MASTER, 1, 2, false);
					}
				}
			}
		}
	}
}
