package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.firefightersmod.init.FirefightersModModBlocks;

public class EmbersblockOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -1;
		found = false;
		for (int index0 = 0; index0 < 2; index0++) {
			sy = -1;
			for (int index1 = 0; index1 < 2; index1++) {
				sz = 1;
				for (int index2 = 0; index2 < 2; index2++) {
					if (Mth.nextInt(RandomSource.create(), 1, 20) == 20) {
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
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.campfire.crackle")), SoundSource.MASTER, 1, 2);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.campfire.crackle")), SoundSource.MASTER, 1, 2, false);
				}
			}
		}
	}
}
