package net.mcreator.firefightersmod.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.firefightersmod.network.FirefightersModModVariables;
import net.mcreator.firefightersmod.init.FirefightersModModBlocks;
import net.mcreator.firefightersmod.FirefightersModMod;

public class UnifireOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
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
			if (Mth.nextInt(RandomSource.create(), 1, 1000) == 1000) {
				world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.SMOKE.get().defaultBlockState(), 3);
			} else {
				if (Mth.nextInt(RandomSource.create(), 1, 250) == 250) {
					world.setBlock(BlockPos.containing(x, y, z), FirefightersModModBlocks.SFLA.get().defaultBlockState(), 3);
				} else {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get()) {
						if (Mth.nextInt(RandomSource.create(), 1, 200) == 200) {
							if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y + 1, z), FirefightersModModBlocks.SMOKE.get().defaultBlockState(), 3);
							}
						}
						if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
							world.setBlock(BlockPos.containing(x + 1, y, z), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
						}
						if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
							world.setBlock(BlockPos.containing(x, y + 1, z), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
						}
						if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
							world.setBlock(BlockPos.containing(x, y, z + 1), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
						}
						if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
							world.setBlock(BlockPos.containing(x - 1, y, z), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
						}
						if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
							world.setBlock(BlockPos.containing(x, y - 1, z), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
						}
						if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("minecraft:burnables")))) {
							world.setBlock(BlockPos.containing(x, y, z - 1), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
						}
						if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:slab_burnables")))) {
							world.setBlock(BlockPos.containing(x + 1, y, z), FirefightersModModBlocks.TIRESSLAB.get().defaultBlockState(), 3);
						}
						if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:slab_burnables")))) {
							world.setBlock(BlockPos.containing(x, y + 1, z), FirefightersModModBlocks.TIRESSLAB.get().defaultBlockState(), 3);
						}
						if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("minecraft:slab_burnables")))) {
							world.setBlock(BlockPos.containing(x, y, z + 1), FirefightersModModBlocks.TIRESSLAB.get().defaultBlockState(), 3);
						}
						if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:slab_burnables")))) {
							world.setBlock(BlockPos.containing(x - 1, y, z), FirefightersModModBlocks.TIRESSLAB.get().defaultBlockState(), 3);
						}
						if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:slab_burnables")))) {
							world.setBlock(BlockPos.containing(x, y - 1, z), FirefightersModModBlocks.TIRESSLAB.get().defaultBlockState(), 3);
						}
						if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("minecraft:slab_burnables")))) {
							world.setBlock(BlockPos.containing(x, y, z - 1), FirefightersModModBlocks.TIRESSLAB.get().defaultBlockState(), 3);
						}
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
						});
					}
				}
			}
		}
	}
}
