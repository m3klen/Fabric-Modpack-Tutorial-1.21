package net.threexj.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.MusicSound;
import net.minecraft.util.Identifier;
import net.threexj.tutorialmod.TutorialMod;
import net.threexj.tutorialmod.item.custom.ModToolMaterial;

public class ModItems {

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));

    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new Item.Settings().food(ModFoodComponents.PINEAPPLE)));


    public static final Item BACCHETTA = registerItem("bacchetta", new Item(new Item.Settings()));

    public static final Item LEGO_COAL = registerItem("lego_coal", new Item(new Item.Settings()));


    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterial.STEEL, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(
                    ModToolMaterial.STEEL, 3, -2.4F
            ))));

    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterial.STEEL, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
                    ModToolMaterial.STEEL, 1, -2.4F
            ))));

    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterial.STEEL, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(
                    ModToolMaterial.STEEL, 6.0F, -3.1F
            ))));

    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterial.STEEL, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(
                    ModToolMaterial.STEEL, 1.5F, -3.0F
            ))));

    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterial.STEEL, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(
                    ModToolMaterial.STEEL, -2.0F, -1.0F
            ))));

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
