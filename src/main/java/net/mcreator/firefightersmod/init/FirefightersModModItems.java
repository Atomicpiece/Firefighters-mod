
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

import net.mcreator.firefightersmod.item.MatchesItem;
import net.mcreator.firefightersmod.item.MatchItem;
import net.mcreator.firefightersmod.item.HazmatsuitItem;
import net.mcreator.firefightersmod.item.FirefighterSuitItem;
import net.mcreator.firefightersmod.item.FireHoseItem;
import net.mcreator.firefightersmod.item.FireExtinguisherItem;
import net.mcreator.firefightersmod.item.DeforesterItem;
import net.mcreator.firefightersmod.item.AntiburnItem;
import net.mcreator.firefightersmod.item.AntiSmokeItem;
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
	public static final RegistryObject<Item> BURBLOCK = block(FirefightersModModBlocks.BURBLOCK);
	public static final RegistryObject<Item> FIRE_EXTINGUISHER = REGISTRY.register("fire_extinguisher", () -> new FireExtinguisherItem());
	public static final RegistryObject<Item> ANTI_SMOKE = REGISTRY.register("anti_smoke", () -> new AntiSmokeItem());
	public static final RegistryObject<Item> BURTIRES = block(FirefightersModModBlocks.BURTIRES);
	public static final RegistryObject<Item> ANTIBURN = REGISTRY.register("antiburn", () -> new AntiburnItem());
	public static final RegistryObject<Item> BURNING_TIRES = block(FirefightersModModBlocks.BURNING_TIRES);
	public static final RegistryObject<Item> FIRE_HOSE = REGISTRY.register("fire_hose", () -> new FireHoseItem());
	public static final RegistryObject<Item> TIRESSLAB = block(FirefightersModModBlocks.TIRESSLAB);
	public static final RegistryObject<Item> SFLA = block(FirefightersModModBlocks.SFLA);
	public static final RegistryObject<Item> WALLFLAME = block(FirefightersModModBlocks.WALLFLAME);
	public static final RegistryObject<Item> DEFORESTER = REGISTRY.register("deforester", () -> new DeforesterItem());
	public static final RegistryObject<Item> BARREL = block(FirefightersModModBlocks.BARREL);
	public static final RegistryObject<Item> MATCH = REGISTRY.register("match", () -> new MatchItem());
	public static final RegistryObject<Item> MATCHES = REGISTRY.register("matches", () -> new MatchesItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
