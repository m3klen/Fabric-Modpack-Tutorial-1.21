package net.threexj.tutorialmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.threexj.tutorialmod.TutorialMod;

public class ModBlocks {

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Block SAPPHIRE_BLOCK2 = registerBlock("sapphire_block2",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.tryParse(TutorialMod.MOD_ID + ":" + name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.tryParse(TutorialMod.MOD_ID + ":" + name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering ModBLocks for " + TutorialMod.MOD_ID);
    }
}
