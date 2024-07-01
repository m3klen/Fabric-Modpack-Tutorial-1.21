package net.threexj.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.threexj.tutorialmod.TutorialMod;
import net.threexj.tutorialmod.blocks.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup TUTORIALMOD_ITEMGROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.tryParse(TutorialMod.MOD_ID + ":" + "tutorialmod_itemgroup"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.tutorialmod"))
                    .icon(() -> new ItemStack(Items.WOODEN_HOE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModItems.PINEAPPLE);
                        entries.add(ModItems.LEGO_COAL);

                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_HOE);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_SHOVEL);

                        entries.add(ModItems.STEEL_HELMET);
                        entries.add(ModItems.STEEL_CHESTPLATE);
                        entries.add(ModItems.STEEL_LEGGINGS);
                        entries.add(ModItems.STEEL_BOOTS);

                        entries.add(Items.IRON_HELMET);

                        entries.add(ModBlocks.PURPLE_ENCHANTING_TABLE);
                        entries.add(ModBlocks.COLORED_BLOCK);

                    })
                    .build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
