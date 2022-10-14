package net.anodizex.specialore;

import net.anodizex.specialore.block.ModBlocks;
import net.anodizex.specialore.effect.ModEffects;
import net.anodizex.specialore.enchantment.ModEnchantments;
import net.anodizex.specialore.item.ModItems;
import net.anodizex.specialore.particle.ModParticles;
import net.anodizex.specialore.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpecialOreMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "specialore";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModParticles.registerParticles();
		ModLootTableModifiers.modifyLootTables();

		ModEnchantments.registerModEnchantments();

		ModEffects.registerEffects();
	}
}
