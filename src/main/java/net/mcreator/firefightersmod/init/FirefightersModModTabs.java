
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.firefightersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.firefightersmod.FirefightersModMod;

public class FirefightersModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirefightersModMod.MODID);
	public static final RegistryObject<CreativeModeTab> TESTTAB = REGISTRY.register("testtab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.firefighters_mod.testtab")).icon(() -> new ItemStack(FirefightersModModBlocks.SMOKE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FirefightersModModItems.ANTI_SMOKE.get());
				tabData.accept(FirefightersModModItems.ANTIBURN.get());
				tabData.accept(FirefightersModModItems.DEFORESTER.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> FIREFIGHTERS_MOD = REGISTRY.register("firefighters_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.firefighters_mod.firefighters_mod")).icon(() -> new ItemStack(FirefightersModModItems.FIREFIGHTER_SUIT_CHESTPLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FirefightersModModItems.FIREFIGHTER_SUIT_HELMET.get());
				tabData.accept(FirefightersModModItems.FIREFIGHTER_SUIT_CHESTPLATE.get());
				tabData.accept(FirefightersModModItems.FIREFIGHTER_SUIT_LEGGINGS.get());
				tabData.accept(FirefightersModModItems.FIREFIGHTER_SUIT_BOOTS.get());
				tabData.accept(FirefightersModModItems.HAZMATSUIT_HELMET.get());
				tabData.accept(FirefightersModModItems.HAZMATSUIT_CHESTPLATE.get());
				tabData.accept(FirefightersModModItems.HAZMATSUIT_LEGGINGS.get());
				tabData.accept(FirefightersModModItems.HAZMATSUIT_BOOTS.get());
				tabData.accept(FirefightersModModBlocks.P_BTANK.get().asItem());
				tabData.accept(FirefightersModModBlocks.SMOKE.get().asItem());
				tabData.accept(FirefightersModModBlocks.TIRES.get().asItem());
				tabData.accept(FirefightersModModBlocks.CARDBOARDBOX.get().asItem());
				tabData.accept(FirefightersModModBlocks.EMBERSBLOCK.get().asItem());
				tabData.accept(FirefightersModModBlocks.UNIFIRE.get().asItem());
				tabData.accept(FirefightersModModBlocks.SFLA.get().asItem());
				tabData.accept(FirefightersModModBlocks.BURBLOCK.get().asItem());
				tabData.accept(FirefightersModModItems.FIRE_HOSE.get());
				tabData.accept(FirefightersModModItems.FIRE_EXTINGUISHER.get());
				tabData.accept(FirefightersModModBlocks.BURNING_TIRES.get().asItem());
				tabData.accept(FirefightersModModBlocks.TIRESSLAB.get().asItem());
				tabData.accept(FirefightersModModBlocks.BURTIRES.get().asItem());
				tabData.accept(FirefightersModModBlocks.WALLFLAME.get().asItem());
				tabData.accept(FirefightersModModBlocks.BARREL.get().asItem());
				tabData.accept(FirefightersModModItems.MATCH.get());
				tabData.accept(FirefightersModModItems.MATCHES.get());
			}).withSearchBar().build());
}
