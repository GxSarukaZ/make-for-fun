package net.anodizex.specialore;

import net.anodizex.specialore.block.ModBlocks;
import net.anodizex.specialore.effect.ModEffects;
import net.anodizex.specialore.enchantment.ModEnchantments;
import net.anodizex.specialore.entity.ModEntities;
import net.anodizex.specialore.entity.entities.TarantulaElectricBlueEntity;
import net.anodizex.specialore.item.ModItems;
import net.anodizex.specialore.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class SpecialOreMod implements ModInitializer {
	public static final String MOD_ID = "specialore";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();

		ModEnchantments.registerModEnchantments();

		ModEffects.registerEffects();

		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(ModEntities.TARANTULA_ELECTRIC_BLUE, TarantulaElectricBlueEntity.setAttributes());
	}
}
