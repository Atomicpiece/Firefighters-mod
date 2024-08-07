
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.firefightersmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.firefightersmod.client.particle.WatterParticle;
import net.mcreator.firefightersmod.client.particle.SparkParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FirefightersModModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(FirefightersModModParticleTypes.WATTER.get(), WatterParticle::provider);
		event.registerSpriteSet(FirefightersModModParticleTypes.SPARK.get(), SparkParticle::provider);
	}
}
