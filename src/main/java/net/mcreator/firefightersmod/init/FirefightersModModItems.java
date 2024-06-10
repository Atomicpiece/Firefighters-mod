
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.firefightersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.firefightersmod.item.HazmatsuitItem;
import net.mcreator.firefightersmod.item.FirefighterSuitItem;
import net.mcreator.firefightersmod.FirefightersModMod;

public class FirefightersModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FirefightersModMod.MODID);
	public static final RegistryObject<Item> UNIFIRE = block(FirefightersModModBlocks.UNIFIRE);
	public static final RegistryObject<Item> HAZMATSUIT_HELMET = REGISTRY.register("hazmatsuit_helmet", () -> new HazmatsuitItem.Helmet());
	public static final RegistryObject<Item> HAZMATSUIT_CHESTPLATE = REGISTRY.register("hazmatsuit_chestplate", () -> new HazmatsuitItem.Chestplate());
	public static final RegistryObject<Item> HAZMATSUIT_LEGGINGS = REGISTRY.register("hazmatsuit_leggings", () -> new HazmatsuitItem.Leggings());
	public static final RegistryObject<Item> HAZMATSUIT_BOOTS = REGISTRY.register("hazmatsuit_boots", () -> new HazmatsuitItem.Boots());
	public static final RegistryObject<Item> P_BTANK = block(FirefightersModModBlocks.P_BTANK);
	public static final RegistryObject<Item> SMOKE = block(FirefightersModModBlocks.SMOKE);
	public static final RegistryObject<Item> CARDBOARDBOX = block(FirefightersModModBlocks.CARDBOARDBOX);
	public static final RegistryObject<Item> EMBERSBLOCK = block(FirefightersModModBlocks.EMBERSBLOCK);
	public static final RegistryObject<Item> FIREFIGHTER_SUIT_HELMET = REGISTRY.register("firefighter_suit_helmet", () -> new FirefighterSuitItem.Helmet());
	public static final RegistryObject<Item> FIREFIGHTER_SUIT_CHESTPLATE = REGISTRY.register("firefighter_suit_chestplate", () -> new FirefighterSuitItem.Chestplate());
	public static final RegistryObject<Item> FIREFIGHTER_SUIT_LEGGINGS = REGISTRY.register("firefighter_suit_leggings", () -> new FirefighterSuitItem.Leggings());
	public static final RegistryObject<Item> FIREFIGHTER_SUIT_BOOTS = REGISTRY.register("firefighter_suit_boots", () -> new FirefighterSuitItem.Boots());
	public static final RegistryObject<Item> TIRES = block(FirefightersModModBlocks.TIRES);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
