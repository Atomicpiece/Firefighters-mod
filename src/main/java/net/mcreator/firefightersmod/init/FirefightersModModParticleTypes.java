
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.firefightersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.firefightersmod.FirefightersModMod;

public class FirefightersModModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, FirefightersModMod.MODID);
	public static final RegistryObject<SimpleParticleType> WATTER = REGISTRY.register("watter", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> SPARK = REGISTRY.register("spark", () -> new SimpleParticleType(true));
}
