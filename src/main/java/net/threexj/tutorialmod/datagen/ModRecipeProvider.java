package net.threexj.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.threexj.tutorialmod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.DIAMOND, 1)
                .pattern("SSS")
                .pattern("S#S")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('#', Items.DIRT)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .offerTo(exporter, Identifier.tryParse(getRecipeName(Items.STONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE, 1)
                .pattern("DDD")
                .pattern("DED")
                .pattern("DDD")
                .input('D', Items.DIAMOND)
                .input('E', Items.EMERALD)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, Identifier.tryParse(getRecipeName(ModItems.SAPPHIRE)));
    }
}
