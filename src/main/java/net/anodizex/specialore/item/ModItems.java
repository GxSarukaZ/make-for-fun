package net.anodizex.specialore.item;

import net.anodizex.specialore.SpecialOreMod;
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

    public static final Item DRAGONFLUX =registerItem("dragonflux",
            new Item(new FabricItemSettings().group(ModItemGroup.SPECIALOREMOD).rarity(Rarity.EPIC).maxCount(1)));

    public static final Item DRAGON_CATALYST =registerItem("dragon_catalyst",
            new Item(new FabricItemSettings().group(ModItemGroup.SPECIALOREMOD).rarity(Rarity.EPIC).maxCount(1)));

    public static final Item TITANIUM_INGOT =registerItem("titanium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item RAW_TIMASCUS_INGOT =registerItem("raw_timascus_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item FLYFIRE_IN_BOTTLE =registerItem("flyfire_in_bottle",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item TIMASCUS_SWORD =registerItem("timascus_sword",
            new SwordItem(ModToolMaterial.TIMASCUS, 8, 1f,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item REINFORCED_TIMASCUS_SWORD_50 =registerItem("reinforced_timascus_sword_50",
            new SwordItem(ModToolMaterial.TIMASCUS, 12, 1f,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS).rarity(Rarity.EPIC)));

    public static final Item ZELE_SCYTHE =registerItem("zele_scythe",
            new SwordItem(ModToolMaterial.TIMASCUS, 8, 1f,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS)));

    public static final Item SCULK_STAFF =registerItem("sculk_staff",
            new SwordItem(ModToolMaterial.SCULK, 8, 1f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item REINFORCED_TIMASCUS_SWORD =registerItem("reinforced_timascus_sword",
            new SwordItem(ModToolMaterial.TIMASCUS, 10, 1f,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS).rarity(Rarity.RARE)));

    public static final Item HYPERION_TIMASCUS_SWORD =registerItem("hyperion_timascus_sword",
            new SwordItem(ModToolMaterial.TIMASCUS, 12, 1f,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS).rarity(Rarity.EPIC)));

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

    public static final Item DRAGON_TIMASCUS_HELMET =registerItem("dragon_timascus_helmet",
            new ArmorItem(ModArmorMaterials.DRAGON_TIMASCUS, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS).rarity(Rarity.EPIC)));

    public static final Item DRAGON_TIMASCUS_CHESTPLATE =registerItem("dragon_timascus_chestplate",
            new ArmorItem(ModArmorMaterials.DRAGON_TIMASCUS, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS).rarity(Rarity.EPIC)));

    public static final Item DRAGON_TIMASCUS_LEGGINGS =registerItem("dragon_timascus_leggings",
            new ArmorItem(ModArmorMaterials.DRAGON_TIMASCUS, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS).rarity(Rarity.EPIC)));

    public static final Item DRAGON_TIMASCUS_BOOTS =registerItem("dragon_timascus_boots",
            new ArmorItem(ModArmorMaterials.DRAGON_TIMASCUS, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS).rarity(Rarity.EPIC)));

    public static final Item CRYSTAL =registerItem("crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.CATALYST)));

    public static final Item CATALYST =registerItem("catalyst",
            new Item(new FabricItemSettings().group(ModItemGroup.CATALYST).rarity(Rarity.UNCOMMON).maxCount(1)));

    public static final Item REINFORCED_CATALYST =registerItem("reinforced_catalyst",
            new Item(new FabricItemSettings().group(ModItemGroup.CATALYST).rarity(Rarity.RARE).maxCount(1)));

    public static final Item DAMASCUS_DAGGER =registerItem("damascus_dagger",
            new SwordItem(ModToolMaterial.TIMASCUS, 15, 1f,
                    new FabricItemSettings().group(ModItemGroup.TIMASCUS).rarity(Rarity.EPIC)));

    public static final Item MIDNIGHT_CATALYST =registerItem("midnight_catalyst",
            new Item(new FabricItemSettings().group(ModItemGroup.CATALYST).rarity(Rarity.EPIC).maxCount(1)));

    public static final Item BE_THE_ONE_CATALYST =registerItem("be_the_one_catalyst",
            new Item(new FabricItemSettings().group(ModItemGroup.CATALYST).rarity(Rarity.EPIC).maxCount(1)));

    public static final Item VERINATED_CATALYST =registerItem("verinated_catalyst",
            new Item(new FabricItemSettings().group(ModItemGroup.CATALYST).rarity(Rarity.EPIC).maxCount(1)));

    public static final Item DRAGON_SWORD =registerItem("dragon_sword",
            new SwordItem(ModToolMaterial.DRAGON, 11, 10f,
                    new FabricItemSettings().group(ModItemGroup.SPECIALOREMOD).rarity(Rarity.RARE)));

    public static final Item DRAGON_DAGGER =registerItem("dragon_dagger",
            new SwordItem(ModToolMaterial.DRAGON, 11, 10f,
                    new FabricItemSettings().group(ModItemGroup.SPECIALOREMOD).rarity(Rarity.RARE)));

    public static final Item DRAGON_VALKYRIE =registerItem("dragon_valkyrie",
            new SwordItem(ModToolMaterial.DRAGON, 11, 10f,
                    new FabricItemSettings().group(ModItemGroup.SPECIALOREMOD).rarity(Rarity.EPIC)));

    public static final Item WITHER_DOMINUS =registerItem("wither_dominus",
            new SwordItem(ModToolMaterial.DRAGON, 11, 10f,
                    new FabricItemSettings().group(ModItemGroup.SPECIALOREMOD).rarity(Rarity.EPIC)));

    public static final Item WARDEN_HYPERION =registerItem("warden_hyperion",
            new SwordItem(ModToolMaterial.DRAGON, 11, 10f,
                    new FabricItemSettings().group(ModItemGroup.SPECIALOREMOD).rarity(Rarity.EPIC)));

    public static final Item DRAGON_HANDLE =registerItem("dragon_handle",
            new Item(new FabricItemSettings().group(ModItemGroup.CATALYST).rarity(Rarity.RARE).maxCount(1)));

    public static final Item WARDEN_TENDRILL = registerItem("warden_tendrill",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.EPIC).maxCount(1)));

    public static final Item WARDENFLUX = registerItem("wardenflux",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.EPIC).maxCount(1)));

    public static final Item WITHER_CATALYST = registerItem("wither_catalyst",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.RARE).maxCount(64)));

    public static final Item DOMINUS = registerItem("dominus",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.EPIC).maxCount(2)));

    public static final Item VALKYRIE = registerItem("valkyrie",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.EPIC).maxCount(2)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM,new Identifier(SpecialOreMod.MOD_ID, name),item);
    }

    public static void registerModItems() {
        SpecialOreMod.LOGGER.info("Registering Mod Items for" + SpecialOreMod.MOD_ID);
    }
}
