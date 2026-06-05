package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.block.DafangBlockFamily;
import com.ar3lang.dafangconstruction.block.DafangBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Consumer;

public class DafangCraftingRecipeProvider extends FabricRecipeProvider {
    public DafangCraftingRecipeProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        for (DafangBlockFamily family : DafangBlocks.getAllFamilies()) {
            Block base = family.getBase();
            if (family.getSlab() != null) {
                offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, family.getSlab(), base);
            }
            if (family.getStairs() != null) {
                RecipeProvider.createStairsRecipe(family.getStairs(), Ingredient.ofItems(base))
                    .criterion(hasItem(base), conditionsFromItem(base))
                    .offerTo(exporter);
            }
            if (family.getWall() != null) {
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, family.getWall(), base);
            }
        }

        //无序
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("granite_yellowrust"), 4).input(Blocks.GRANITE).input(Blocks.GRANITE).input(Blocks.ANDESITE).input(Items.IRON_NUGGET).criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("granite_gray"), 4).input(Blocks.GRANITE).input(Blocks.ANDESITE).input(Blocks.ANDESITE).input(Blocks.COBBLESTONE).criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("granite_red"), 4).input(Blocks.GRANITE).input(Blocks.ANDESITE).input(Blocks.ANDESITE).input(Items.REDSTONE).criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("granite_galaxygray"), 8).input(Blocks.GRANITE).input(Blocks.GRANITE).input(Blocks.GRANITE).input(Blocks.GRANITE).input(Blocks.GRANITE).input(Blocks.GRANITE).input(Items.COAL).input(Items.QUARTZ).criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("marble"), 6).input(Blocks.CALCITE).input(Blocks.CALCITE).input(Blocks.CALCITE).input(Blocks.CALCITE).input(Blocks.TUFF).input(Items.QUARTZ).criterion(hasItem(Blocks.CALCITE),conditionsFromItem(Blocks.CALCITE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("marble_black"), 6).input(Blocks.CALCITE).input(Blocks.CALCITE).input(Blocks.CALCITE).input(Blocks.DEEPSLATE).input(Blocks.DEEPSLATE).input(Items.QUARTZ).criterion(hasItem(Blocks.CALCITE),conditionsFromItem(Blocks.CALCITE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("marble_golden"), 8).input(Blocks.CALCITE).input(Blocks.CALCITE).input(Blocks.CALCITE).input(Blocks.CALCITE).input(Blocks.TUFF).input(Items.QUARTZ).input(Items.GOLD_NUGGET).input(Items.GOLD_NUGGET).criterion(hasItem(Blocks.CALCITE),conditionsFromItem(Blocks.CALCITE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("marble_golden"), 4).input(DafangBlocks.getBlockbyID("marble")).input(DafangBlocks.getBlockbyID("marble")).input(DafangBlocks.getBlockbyID("marble")).input(Items.GOLD_NUGGET).criterion(hasItem(DafangBlocks.getBlockbyID("marble")),conditionsFromItem(DafangBlocks.getBlockbyID("marble"))).offerTo(exporter,"marble_alt");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("marble_wood"), 5).input(Blocks.CALCITE).input(Blocks.CALCITE).input(Blocks.CALCITE).input(Blocks.SANDSTONE).input(Blocks.SANDSTONE).criterion(hasItem(Blocks.CALCITE),conditionsFromItem(Blocks.CALCITE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("marble_wood_yellow"), 5).input(Blocks.CALCITE).input(Blocks.CALCITE).input(Blocks.CALCITE).input(Blocks.RED_SANDSTONE).input(Blocks.RED_SANDSTONE).criterion(hasItem(Blocks.CALCITE),conditionsFromItem(Blocks.CALCITE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("marble_wood_yellow"), 6).input(Blocks.CALCITE).input(Blocks.CALCITE).input(Blocks.CALCITE).input(Blocks.SANDSTONE).input(Blocks.SANDSTONE).input(Items.IRON_NUGGET).criterion(hasItem(Blocks.CALCITE),conditionsFromItem(Blocks.CALCITE)).offerTo(exporter,"marble_wood_yellow_alt");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("dafang_modern_1"),8).input(Blocks.CYAN_TERRACOTTA).input(DafangBlocks.getBlockbyID("granite_gray")).input(DafangBlocks.getBlockbyID("granite_gray")).input(DafangBlocks.getBlockbyID("granite_gray")).input(DafangBlocks.getBlockbyID("granite_gray")).input(DafangBlocks.getBlockbyID("granite_gray")).input(DafangBlocks.getBlockbyID("granite_gray")).criterion(hasItem(DafangBlocks.getBlockbyID("granite_gray")),conditionsFromItem(DafangBlocks.getBlockbyID("granite_gray"))).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("cement"), 6).input(Blocks.GRAVEL).input(Blocks.GRAVEL).input(Blocks.SAND).input(Blocks.SAND).input(Blocks.SAND).input(Blocks.MUD).criterion(hasItem(Blocks.GRAVEL),conditionsFromItem(Blocks.GRANITE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("carpet_1"), 6).input(Blocks.GRAY_WOOL).input(Blocks.LIGHT_GRAY_WOOL).input(Blocks.GRAY_WOOL).input(Items.PAPER).input(Items.PAPER).input(Items.PAPER).input(Blocks.MUD).criterion(hasItem(Blocks.GRAY_WOOL),conditionsFromItem(Blocks.GRAY_WOOL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("carpet_2"), 4).input(Blocks.GRAY_WOOL).input(Blocks.LIGHT_GRAY_WOOL).input(Blocks.GRAY_WOOL).input(Blocks.BROWN_WOOL).criterion(hasItem(Blocks.GRAY_WOOL),conditionsFromItem(Blocks.GRAY_WOOL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DafangBlocks.getBlockbyID("fabric_pale"), 8).input(ItemTags.WOOL).input(ItemTags.WOOL).input(ItemTags.WOOL).input(ItemTags.WOOL).input(Items.PAPER).input(Items.PAPER).input(Items.STRING).input(Items.GRAY_DYE).criterion(hasItem(Blocks.GRAY_WOOL),conditionsFromItem(Blocks.GRAY_WOOL)).offerTo(exporter);


        createPolish(DafangBlocks.getBlockbyID("granite_yellowrust_polished"), DafangBlocks.getBlockbyID("granite_yellowrust"), 4, exporter);
        createPolish(DafangBlocks.getBlockbyID("granite_red_polished"), DafangBlocks.getBlockbyID("granite_red"), 4, exporter);
        createPolish(DafangBlocks.getBlockbyID("granite_gray_polished"), DafangBlocks.getBlockbyID("granite_gray"), 4, exporter);
        createPolish(DafangBlocks.getBlockbyID("granite_galaxygray_polished"), DafangBlocks.getBlockbyID("granite_galaxygray"), 4, exporter);
        createPolish(DafangBlocks.getBlockbyID("cement_plate"), DafangBlocks.getBlockbyID("cement"), 4, exporter);
        createPolish(DafangBlocks.getBlockbyID("cement_plate_2"), DafangBlocks.getBlockbyID("cement_plate"), 4, exporter);
        createPolish(DafangBlocks.getBlockbyID("cement_plate_4"), DafangBlocks.getBlockbyID("cement_plate_2"), 4, exporter);

//             解锁条件：
//            .criterion(hasItem(Items.RED_DYE), conditionsFromItem(Items.RED_DYE))
//            .criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE))
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
    private void createPolish(Block outputBlock, Block inputBlock, int count, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, outputBlock, count)
            .pattern("##")
            .pattern("##")
            .input('#', inputBlock)
            .criterion(hasItem(inputBlock), conditionsFromItem(inputBlock))
            .group("building_polish")
            .offerTo(exporter);
    }
    @Override
    public String getName() {
        return "Dafang Crafting Recipes";
    }
}
