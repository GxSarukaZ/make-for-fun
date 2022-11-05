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

    public static final Item WARDEN_TENDRILL = registerItem("warden_tendrill",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.EPIC).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM,new Identifier(SpecialOreMod.MOD_ID, name),item);
    }

    public static void registerModItems() {
        SpecialOreMod.LOGGER.info("Registering Mod Items for" + SpecialOreMod.MOD_ID);
    }
}
