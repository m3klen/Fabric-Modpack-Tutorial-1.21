package net.threexj.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.threexj.tutorialmod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.STEEL_PICKAXE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.STEEL_AXE);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.STEEL_HOE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.STEEL_SWORD);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.STEEL_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.STEEL_HELMET);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.STEEL_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.STEEL_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.STEEL_BOOTS);

    }
}
