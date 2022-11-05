package net.anodizex.specialore.block;

import net.anodizex.specialore.SpecialOreMod;
import net.anodizex.specialore.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block TIMASCUS_BLOCK = registerBlock("timascus_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4F).requiresTool().sounds(BlockSoundGroup.METAL)), ModItemGroup.SPECIALBLOCK);

    public static final Block SCULK_BONE = registerBlock("sculk_bone",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4F).requiresTool().sounds(BlockSoundGroup.BONE)), ItemGroup.DECORATIONS);

    public static final Block TIMASCUS_ORE = registerBlock("timascus_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4F).requiresTool().sounds(BlockSoundGroup.STONE)), ModItemGroup.SPECIALBLOCK);

    public static final Block DEEPSLATE_TIMASCUS_ORE = registerBlock("deepslate_timascus_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)), ModItemGroup.SPECIALBLOCK);

    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4F).requiresTool().sounds(BlockSoundGroup.STONE)), ModItemGroup.SPECIALBLOCK);

    public static final Block SCULK_VERIANT_EGG = registerBlock("sculk_veriant_egg",
            new Block(FabricBlockSettings.of(Material.SCULK).strength(4F).requiresTool().sounds(BlockSoundGroup.SLIME)), ModItemGroup.SPECIALBLOCK);

    public static final Block ICE_AMETHYST_CLUSTER = registerBlock("ice_amethyst_cluster",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(2.5F).requiresTool().sounds(BlockSoundGroup.AMETHYST_CLUSTER)), ModItemGroup.SPECIALBLOCK);

    public static final Block SCULKERING_FROGLIGHT = registerBlock("sculkering_froglight",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4F).requiresTool().sounds(BlockSoundGroup.STONE).sounds(BlockSoundGroup.SCULK)), ModItemGroup.SPECIALBLOCK);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK,new Identifier(SpecialOreMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM,new Identifier(SpecialOreMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        SpecialOreMod.LOGGER.info("Registering Mod Block for"+ SpecialOreMod.MOD_ID);
    }
}
