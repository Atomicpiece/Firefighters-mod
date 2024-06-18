package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.firefightersmod.init.FirefightersModModBlocks;

import java.util.Map;

public class UnifireOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 50) == 50) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = FirefightersModModBlocks.SMOKE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FirefightersModModBlocks.UNIFIRE.get()) {
				if (Mth.nextInt(RandomSource.create(), 1, 200) == 200) {
					if (!world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
						world.setBlock(BlockPos.containing(x, y + 1, z), FirefightersModModBlocks.SMOKE.get().defaultBlockState(), 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z)))
						.getBlock() == (ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("minecraft:burnables"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR))) {
					world.setBlock(BlockPos.containing(x + 1, y, z), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z)))
						.getBlock() == (ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("minecraft:burnables"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR))) {
					world.setBlock(BlockPos.containing(x, y + 1, z), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1)))
						.getBlock() == (ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("minecraft:burnables"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR))) {
					world.setBlock(BlockPos.containing(x, y, z + 1), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z)))
						.getBlock() == (ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("minecraft:burnables"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR))) {
					world.setBlock(BlockPos.containing(x - 1, y, z), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z)))
						.getBlock() == (ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("minecraft:burnables"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR))) {
					world.setBlock(BlockPos.containing(x, y - 1, z), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1)))
						.getBlock() == (ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("minecraft:burnables"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR))) {
					world.setBlock(BlockPos.containing(x, y, z - 1), FirefightersModModBlocks.EMBERSBLOCK.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
