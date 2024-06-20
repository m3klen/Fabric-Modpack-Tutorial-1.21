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
    public static final List<ItemConvertible> OUR_SMELTABLES = List.of(ModItems.SAPPHIRE, ModBlocks.SAPPHIRE_BLOCK);

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerSmelting(exporter, OUR_SMELTABLES, RecipeCategory.MISC, ModItems.PINEAPPLE,
                0.7f, 200, "sapphire");

        offerBlasting(exporter, OUR_SMELTABLES, RecipeCategory.MISC, ModItems.PINEAPPLE,
                0.7f, 100, "sapphire");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE, RecipeCategory.DECORATIONS,
                ModBlocks.SAPPHIRE_BLOCK);

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
    }
}
