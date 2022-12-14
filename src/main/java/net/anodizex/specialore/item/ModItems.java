package net.anodizex.specialore.item;

import net.anodizex.specialore.SpecialOreMod;
import net.anodizex.specialore.entity.ModEntities;
import net.anodizex.specialore.item.custom.ModAxeItem;
import net.anodizex.specialore.item.custom.ModHoeItem;
import net.anodizex.specialore.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item TIMASCUS_INGOT =registerItem("timascus_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item TITANIUM_INGOT =registerItem("titanium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item RAW_TIMASCUS_INGOT =registerItem("raw_timascus_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item FLYFIRE_IN_BOTTLE =registerItem("flyfire_in_bottle",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item TIMASCUS_SWORD =registerItem("timascus_sword",
            new SwordItem(ModToolMaterial.TIMASCUS, 8, 1f,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item TIMASCUS_AXE =registerItem("timascus_axe",
            new ModAxeItem(ModToolMaterial.TIMASCUS, 12, 1f,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item TIMASCUS_SHOVEL =registerItem("timascus_shovel",
            new ShovelItem(ModToolMaterial.TIMASCUS, 1, 1f,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item TIMASCUS_PICKAXE =registerItem("timascus_pickaxe",
            new ModPickaxeItem(ModToolMaterial.TIMASCUS, 1, 1f,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item TIMASCUS_HOE =registerItem("timascus_hoe",
            new ModHoeItem(ModToolMaterial.TIMASCUS, 1, 1f,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item TIMASCUS_HELMET =registerItem("timascus_helmet",
            new ArmorItem(ModArmorMaterials.TIMASCUS, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item TIMASCUS_CHESTPLATE =registerItem("timascus_chestplate",
            new ArmorItem(ModArmorMaterials.TIMASCUS, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item TIMASCUS_LEGGINGS =registerItem("timascus_leggings",
            new ArmorItem(ModArmorMaterials.TIMASCUS, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item TIMASCUS_BOOTS =registerItem("timascus_boots",
            new ArmorItem(ModArmorMaterials.TIMASCUS, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item BEAT_IT_JACKET =registerItem("beat_it_jacket",
            new ArmorItem(ModArmorMaterials.BEATIT, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT).rarity(Rarity.EPIC)));

    public static final Item BEAT_IT_JACKET_SNAKE_SKIN =registerItem("beat_it_jacket_snake_skin",
            new ArmorItem(ModArmorMaterials.BEATITDRAGONFRAG, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT).rarity(Rarity.EPIC)));

    public static final Item BEAT_IT_CHEST =registerItem("beat_it_chest",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item BEAT_IT_SNAKE =registerItem("beat_it_snake",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item BEAT_IT_ARMS =registerItem("beat_it_arms",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item BEAT_IT_SNAKE_ARMS =registerItem("beat_it_snake_arms",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item TARANTULA_SPAWN_EGG = registerItem("tarantula_spawn_egg",
            new SpawnEggItem(ModEntities.TARANTULA_ELECTRIC_BLUE,0x2f04be, 0x030303,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item KISANE_MIKO_SPAWN_EGG = registerItem("kisane_miko_spawn_egg",
            new SpawnEggItem(ModEntities.KISANE_MIKO,0xd42f2f, 0x01fd08,
                    new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item SCULK_IRON_INGOT = registerItem("sculk_iron_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item SCULK_GOLD_INGOT = registerItem("sculk_gold_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM,new Identifier(SpecialOreMod.MOD_ID, name),item);
    }

    public static void registerModItems() {
        SpecialOreMod.LOGGER.info("Registering Mod Items for" + SpecialOreMod.MOD_ID);
    }
}
