
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.firefightersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.firefightersmod.block.entity.WallflameBlockEntity;
import net.mcreator.firefightersmod.block.entity.UnifireBlockEntity;
import net.mcreator.firefightersmod.block.entity.TiresslabBlockEntity;
import net.mcreator.firefightersmod.block.entity.SmokeBlockEntity;
import net.mcreator.firefightersmod.block.entity.PBtankBlockEntity;
import net.mcreator.firefightersmod.block.entity.EmbersblockBlockEntity;
import net.mcreator.firefightersmod.block.entity.BurningTiresBlockEntity;
import net.mcreator.firefightersmod.block.entity.BurblockBlockEntity;
import net.mcreator.firefightersmod.FirefightersModMod;

public class FirefightersModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FirefightersModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> UNIFIRE = register("unifire", FirefightersModModBlocks.UNIFIRE, UnifireBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> P_BTANK = register("p_btank", FirefightersModModBlocks.P_BTANK, PBtankBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SMOKE = register("smoke", FirefightersModModBlocks.SMOKE, SmokeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EMBERSBLOCK = register("embersblock", FirefightersModModBlocks.EMBERSBLOCK, EmbersblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BURBLOCK = register("burblock", FirefightersModModBlocks.BURBLOCK, BurblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BURNING_TIRES = register("burning_tires", FirefightersModModBlocks.BURNING_TIRES, BurningTiresBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TIRESSLAB = register("tiresslab", FirefightersModModBlocks.TIRESSLAB, TiresslabBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WALLFLAME = register("wallflame", FirefightersModModBlocks.WALLFLAME, WallflameBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
