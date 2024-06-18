package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.firefightersmod.network.FirefightersModModVariables;
import net.mcreator.firefightersmod.init.FirefightersModModBlocks;
import net.mcreator.firefightersmod.FirefightersModMod;

public class EmbersblockOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double ran = 0;
		if (FirefightersModModVariables.WorldVariables.get(world).globrset == false) {
			FirefightersModMod.queueServerWork(20, () -> {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("fira", false);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				FirefightersModModVariables.WorldVariables.get(world).globrset = true;
				FirefightersModModVariables.WorldVariables.get(world).syncData(world);
			});
		}
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "fira")) == false) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("fira", true);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			sx = -2;
			found = false;
			for (int index0 = 0; index0 < 4; index0++) {
				sy = -2;
				for (int index1 = 0; index1 < 4; index1++) {
					sz = -2;
					for (int index2 = 0; index2 < 4; index2++) {
						if (Mth.nextInt(RandomSource.create(), 1, 3600) == 3600) {
							if (!world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)).canOcclude()) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), FirefightersModModBlocks.SMOKE.get().defaultBlockState(), 3);
								found = true;
							}
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
			ran = Mth.nextInt(RandomSource.create(), 1, 24);
			if (ran < 5 && ran > 0 && (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
				world.setBlock(BlockPos.containing(x + 1, y, z), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
			}
			if (ran < 9 && ran > 4 && (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
				world.setBlock(BlockPos.containing(x, y + 1, z), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
			}
			if (ran < 13 && ran > 8 && (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
				world.setBlock(BlockPos.containing(x, y, z + 1), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
			}
			if (ran < 17 && ran > 12 && (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
				world.setBlock(BlockPos.containing(x - 1, y, z), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
			}
			if (ran < 21 && ran > 16 && (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
				world.setBlock(BlockPos.containing(x, y - 1, z), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
			}
			if (ran < 25 && ran > 20 && (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
				world.setBlock(BlockPos.containing(x, y, z - 1), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
			}
			if (FirefightersModModBlocks.UNIFIRE.get().defaultBlockState().canSurvive(world, BlockPos.containing(x + 1, y, z))) {
				world.setBlock(BlockPos.containing(x + 1, y, z), FirefightersModModBlocks.UNIFIRE.get().defaultBlockState(), 3);
			}
			if (FirefightersModModBlocks.UNIFIRE.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y + 1, z))) {
				world.setBlock(BlockPos.containing(x, y + 1, z), FirefightersModModBlocks.UNIFIRE.get().defaultBlockState(), 3);
			}
			if (FirefightersModModBlocks.UNIFIRE.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z + 1))) {
				world.setBlock(BlockPos.containing(x, y, z + 1), FirefightersModModBlocks.UNIFIRE.get().defaultBlockState(), 3);
			}
			if (FirefightersModModBlocks.UNIFIRE.get().defaultBlockState().canSurvive(world, BlockPos.containing(x - 1, y, z))) {
				world.setBlock(BlockPos.containing(x - 1, y, z), FirefightersModModBlocks.UNIFIRE.get().defaultBlockState(), 3);
			}
			if (FirefightersModModBlocks.UNIFIRE.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y - 1, z))) {
				world.setBlock(BlockPos.containing(x, y - 1, z), FirefightersModModBlocks.UNIFIRE.get().defaultBlockState(), 3);
			}
			if (FirefightersModModBlocks.UNIFIRE.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z - 1))) {
				world.setBlock(BlockPos.containing(x, y, z - 1), FirefightersModModBlocks.UNIFIRE.get().defaultBlockState(), 3);
			}
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "firan") == 6) {
				world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.BURBLOCK.get().defaultBlockState(), 3);
			}
			FirefightersModMod.queueServerWork((int) (Mth.nextInt(RandomSource.create(), 1, 5) * 20), () -> {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("firan", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "firan") + 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("fira", false);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			});
		}
	}
}
