package net.threexj.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.MusicSound;
import net.minecraft.util.Identifier;
import net.threexj.tutorialmod.TutorialMod;

public class ModItems {

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));

    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new Item.Settings().food(ModFoodComponents.PINEAPPLE)));


    public static final Item LEGO_COAL = registerItem("lego_coal", new Item(new Item.Settings()));

    private static void addItemsToFirstItemGroup(FabricItemGroupEntries entries) {
        entries.add(Items.STONE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.tryParse(TutorialMod.MOD_ID + ":" + name), item);
    }

    public static void registerModItems() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToFirstItemGroup);
    }
}
