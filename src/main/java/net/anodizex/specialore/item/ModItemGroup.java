package net.anodizex.specialore.item;

import net.anodizex.specialore.SpecialOreMod;
import net.anodizex.specialore.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TIMASCUS = FabricItemGroupBuilder.build(new Identifier(SpecialOreMod.MOD_ID,"timascus"),
            () -> new ItemStack(ModItems.TIMASCUS_INGOT));

    public static final ItemGroup CATALYST = FabricItemGroupBuilder.build(new Identifier(SpecialOreMod.MOD_ID,"catalyst"),
            () -> new ItemStack(ModItems.BE_THE_ONE_CATALYST));

    public static final ItemGroup SPECIALBLOCK = FabricItemGroupBuilder.build(new Identifier(SpecialOreMod.MOD_ID,"specialblock"),
            () -> new ItemStack(ModBlocks.TIMASCUS_BLOCK));

    public static final ItemGroup SPECIALOREMOD = FabricItemGroupBuilder.build(new Identifier(SpecialOreMod.MOD_ID,"specialblock"),
            () -> new ItemStack(ModItems.DRAGONFLUX));
}
