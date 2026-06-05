package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.block.DafangBlockFamily;
import com.ar3lang.dafangconstruction.block.DafangBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class DafangCraftingRecipeProvider extends FabricRecipeProvider {
    public DafangCraftingRecipeProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // 假设你有一个包含了所有家族的列表或数组
        for (DafangBlockFamily family : DafangBlocks.getAllFamilies()) {
            Block base = family.getBase();

            // 自动生成台阶 (如果存在)
            if (family.getSlab() != null) {
                offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, family.getSlab(), base);
            }

            if (family.getStairs() != null) {
                // 使用原版静态方法
                RecipeProvider.createStairsRecipe(family.getStairs(), Ingredient.ofItems(base))
                    .criterion(hasItem(base), conditionsFromItem(base))
                    .offerTo(exporter);
            }

            // 自动生成墙 (如果存在)
            if (family.getWall() != null) {
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, family.getWall(), base);
            }
        }
    }

    private void createSlab(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
            .pattern("###")
            .input('#', input)
            .criterion(hasItem(input), conditionsFromItem(input))
            .offerTo(exporter);
    }

    private void createStairs(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
            .pattern("#  ")
            .pattern("## ")
            .pattern("###")
            .input('#', input)
            .criterion(hasItem(input), conditionsFromItem(input))
            .offerTo(exporter);
    }

    private void createWall(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
            .pattern("###")
            .pattern("###")
            .input('#', input)
            .criterion(hasItem(input), conditionsFromItem(input))
            .offerTo(exporter);
    }
    @Override
    public String getName() {
        return "Dafang Crafting Recipes";
    }
}
