package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.firefightersmod.network.FirefightersModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GlobrsetProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		FirefightersModModVariables.WorldVariables.get(world).globrset = false;
		FirefightersModModVariables.WorldVariables.get(world).syncData(world);
	}
}
