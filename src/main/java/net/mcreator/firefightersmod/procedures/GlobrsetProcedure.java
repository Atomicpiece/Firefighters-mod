package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class GlobrsetProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
	}
}
