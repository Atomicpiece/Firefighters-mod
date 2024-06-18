package net.mcreator.firefightersmod.procedures;

import net.minecraftforge.eventbus.api.Event;

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
