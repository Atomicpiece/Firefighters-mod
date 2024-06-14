package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BurningTiresOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y + 1, z), FirefightersModModBlocks.UNIFIRE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == FirefightersModModBlocks.TIRES.get()) {
			FirefightersModMod.queueServerWork(20, () -> {
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == FirefightersModModBlocks.TIRES.get()) {
					world.setBlock(BlockPos.containing(x + 1, y, z), FirefightersModModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
				}
			});
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == FirefightersModModBlocks.TIRES.get()) {
			FirefightersModMod.queueServerWork(20, () -> {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == FirefightersModModBlocks.TIRES.get()) {
					world.setBlock(BlockPos.containing(x, y + 1, z), FirefightersModModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
				}
			});
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == FirefightersModModBlocks.TIRES.get()) {
			FirefightersModMod.queueServerWork(20, () -> {
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == FirefightersModModBlocks.TIRES.get()) {
					world.setBlock(BlockPos.containing(x, y, z + 1), FirefightersModModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
				}
			});
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == FirefightersModModBlocks.TIRES.get()) {
			FirefightersModMod.queueServerWork(20, () -> {
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == FirefightersModModBlocks.TIRES.get()) {
					world.setBlock(BlockPos.containing(x - 1, y, z), FirefightersModModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
				}
			});
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == FirefightersModModBlocks.TIRES.get()) {
			FirefightersModMod.queueServerWork(20, () -> {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == FirefightersModModBlocks.TIRES.get()) {
					world.setBlock(BlockPos.containing(x, y - 1, z), FirefightersModModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
				}
			});
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == FirefightersModModBlocks.TIRES.get()) {
			FirefightersModMod.queueServerWork(20, () -> {
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == FirefightersModModBlocks.TIRES.get()) {
					world.setBlock(BlockPos.containing(x, y, z - 1), FirefightersModModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
				}
			});
		}
		if (Mth.nextInt(RandomSource.create(), 1, 1200) == 1200) {
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
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
