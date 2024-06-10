
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.firefightersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.firefightersmod.block.UnifireBlock;
import net.mcreator.firefightersmod.FirefightersModMod;

public class FirefightersModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FirefightersModMod.MODID);
	public static final RegistryObject<Block> UNIFIRE = REGISTRY.register("unifire", () -> new UnifireBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
