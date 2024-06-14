
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.firefightersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.firefightersmod.block.UnifireBlock;
import net.mcreator.firefightersmod.block.TiresBlock;
import net.mcreator.firefightersmod.block.SmokeBlock;
import net.mcreator.firefightersmod.block.SflaBlock;
import net.mcreator.firefightersmod.block.PBtankBlock;
import net.mcreator.firefightersmod.block.EmbersblockBlock;
import net.mcreator.firefightersmod.block.CardboardboxBlock;
import net.mcreator.firefightersmod.FirefightersModMod;

public class FirefightersModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FirefightersModMod.MODID);
	public static final RegistryObject<Block> UNIFIRE = REGISTRY.register("unifire", () -> new UnifireBlock());
	public static final RegistryObject<Block> P_BTANK = REGISTRY.register("p_btank", () -> new PBtankBlock());
	public static final RegistryObject<Block> SMOKE = REGISTRY.register("smoke", () -> new SmokeBlock());
	public static final RegistryObject<Block> CARDBOARDBOX = REGISTRY.register("cardboardbox", () -> new CardboardboxBlock());
	public static final RegistryObject<Block> EMBERSBLOCK = REGISTRY.register("embersblock", () -> new EmbersblockBlock());
	public static final RegistryObject<Block> TIRES = REGISTRY.register("tires", () -> new TiresBlock());
	public static final RegistryObject<Block> SFLA = REGISTRY.register("sfla", () -> new SflaBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			SmokeBlock.blockColorLoad(event);
		}
	}
}
