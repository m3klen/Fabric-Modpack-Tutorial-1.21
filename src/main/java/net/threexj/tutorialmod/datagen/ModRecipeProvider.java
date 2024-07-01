package net.threexj.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.threexj.tutorialmod.blocks.ModBlocks;
import net.threexj.tutorialmod.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public static final List<ItemConvertible> OUR_SMELTABLES = List.of(ModItems.STEEL_INGOT, ModBlocks.STEEL_BLOCK);

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerSmelting(exporter, OUR_SMELTABLES, RecipeCategory.MISC, ModItems.PINEAPPLE,
                0.7f, 200, "sapphire");

        offerBlasting(exporter, OUR_SMELTABLES, RecipeCategory.MISC, ModItems.PINEAPPLE,
                0.7f, 100, "sapphire");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.STEEL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.DIAMOND, 1)
                .pattern("SSS")
                .pattern("S#S")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('#', Items.DIRT)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .offerTo(exporter, Identifier.tryParse(getRecipeName(Items.STONE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PINEAPPLE, 1)
                .pattern(" S ")
                .pattern("S#S")
                .pattern("SSS")
                .input('S', Items.GOLD_INGOT)
                .input('#', Items.APPLE)
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.PINEAPPLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_SWORD, 1)
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" I ")
                .input('S', ModItems.STEEL_INGOT)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.STEEL_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_AXE, 1)
                .pattern("SS ")
                .pattern("SI ")
                .pattern(" I ")
                .input('S', ModItems.STEEL_INGOT)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.STEEL_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_PICKAXE, 1)
                .pattern("SSS")
                .pattern(" I ")
                .pattern(" I ")
                .input('S', ModItems.STEEL_INGOT)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.STEEL_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_SHOVEL, 1)
                .pattern(" S ")
                .pattern(" I ")
                .pattern(" I ")
                .input('S', ModItems.STEEL_INGOT)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.STEEL_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_HOE, 1)
                .pattern("SS ")
                .pattern(" I ")
                .pattern(" I ")
                .input('S', ModItems.STEEL_INGOT)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.STEEL_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_HELMET, 1)
                .pattern("WWW")
                .pattern("W W")
                .pattern("   ")
                .input('W',  ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.STEEL_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_CHESTPLATE, 1)
                .pattern("W W")
                .pattern("WWW")
                .pattern("WWW")
                .input('W',  ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.STEEL_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_LEGGINGS, 1)
                .pattern("WWW")
                .pattern("W W")
                .pattern("W W")
                .input('W',  ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.STEEL_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_BOOTS, 1)
                .pattern("   ")
                .pattern("W W")
                .pattern("W W")
                .input('W',  ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.STEEL_BOOTS)));
    }
}
