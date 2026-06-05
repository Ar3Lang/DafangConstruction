package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.block.DafangBlockFamily;
import com.ar3lang.dafangconstruction.block.DafangBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;

public class DafangStonecuttingRecipeProvider extends FabricRecipeProvider {
    public DafangStonecuttingRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
//        // --- 1. 黄锈石系列 (YELLOW RUST) ---
//        // 母岩转主样式
//        addStonecutting(exporter, DafangBlocks.GRANITE_YELLOWRUST,
//            DafangBlocks.GRANITE_YELLOWRUST_POLISHED, DafangBlocks.GRANITE_YELLOWRUST_MATTE, DafangBlocks.GRANITE_YELLOWRUST_TILES,
//            DafangBlocks.GRANITE_YELLOWRUST_BRICK1, DafangBlocks.GRANITE_YELLOWRUST_BRICK2,
//            DafangBlocks.GRANITE_YELLOWRUST_BRICK3, DafangBlocks.GRANITE_YELLOWRUST_BRICK4, DafangBlocks.GRANITE_YELLOWRUST_BRICK5,
//            DafangBlocks.GRANITE_YELLOWRUST_SLAB, DafangBlocks.GRANITE_YELLOWRUST_STAIRS, DafangBlocks.GRANITE_YELLOWRUST_WALL);
//
//        // 大砖互转 (1-5) 且 大砖单向转小砖
//        addStonecutting(exporter, DafangBlocks.GRANITE_YELLOWRUST_BRICK1, DafangBlocks.GRANITE_YELLOWRUST_BRICK2, DafangBlocks.GRANITE_YELLOWRUST_BRICK3, DafangBlocks.GRANITE_YELLOWRUST_BRICK4, DafangBlocks.GRANITE_YELLOWRUST_BRICK5, DafangBlocks.GRANITE_YELLOWRUST_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_YELLOWRUST_BRICK2, DafangBlocks.GRANITE_YELLOWRUST_BRICK1, DafangBlocks.GRANITE_YELLOWRUST_BRICK3, DafangBlocks.GRANITE_YELLOWRUST_BRICK4, DafangBlocks.GRANITE_YELLOWRUST_BRICK5, DafangBlocks.GRANITE_YELLOWRUST_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_YELLOWRUST_BRICK3, DafangBlocks.GRANITE_YELLOWRUST_BRICK1, DafangBlocks.GRANITE_YELLOWRUST_BRICK2, DafangBlocks.GRANITE_YELLOWRUST_BRICK4, DafangBlocks.GRANITE_YELLOWRUST_BRICK5, DafangBlocks.GRANITE_YELLOWRUST_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_YELLOWRUST_BRICK4, DafangBlocks.GRANITE_YELLOWRUST_BRICK1, DafangBlocks.GRANITE_YELLOWRUST_BRICK2, DafangBlocks.GRANITE_YELLOWRUST_BRICK3, DafangBlocks.GRANITE_YELLOWRUST_BRICK5, DafangBlocks.GRANITE_YELLOWRUST_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_YELLOWRUST_BRICK5, DafangBlocks.GRANITE_YELLOWRUST_BRICK1, DafangBlocks.GRANITE_YELLOWRUST_BRICK2, DafangBlocks.GRANITE_YELLOWRUST_BRICK3, DafangBlocks.GRANITE_YELLOWRUST_BRICK4, DafangBlocks.GRANITE_YELLOWRUST_TILES);

//        // --- 2. 红花岗岩系列 (RED) ---
//        addStonecutting(exporter, DafangBlocks.GRANITE_RED,
//            DafangBlocks.GRANITE_RED_POLISHED, DafangBlocks.GRANITE_RED_MATTE, DafangBlocks.GRANITE_RED_TILES,
//            DafangBlocks.GRANITE_RED_BRICK1, DafangBlocks.GRANITE_RED_BRICK2,
//            DafangBlocks.GRANITE_RED_BRICK3, DafangBlocks.GRANITE_RED_BRICK4, DafangBlocks.GRANITE_RED_BRICK5,
//            DafangBlocks.GRANITE_RED_SLAB, DafangBlocks.GRANITE_RED_STAIRS, DafangBlocks.GRANITE_RED_WALL);
//
//        addStonecutting(exporter, DafangBlocks.GRANITE_RED_BRICK1, DafangBlocks.GRANITE_RED_BRICK2, DafangBlocks.GRANITE_RED_BRICK3, DafangBlocks.GRANITE_RED_BRICK4, DafangBlocks.GRANITE_RED_BRICK5, DafangBlocks.GRANITE_RED_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_RED_BRICK2, DafangBlocks.GRANITE_RED_BRICK1, DafangBlocks.GRANITE_RED_BRICK3, DafangBlocks.GRANITE_RED_BRICK4, DafangBlocks.GRANITE_RED_BRICK5, DafangBlocks.GRANITE_RED_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_RED_BRICK3, DafangBlocks.GRANITE_RED_BRICK1, DafangBlocks.GRANITE_RED_BRICK2, DafangBlocks.GRANITE_RED_BRICK4, DafangBlocks.GRANITE_RED_BRICK5, DafangBlocks.GRANITE_RED_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_RED_BRICK4, DafangBlocks.GRANITE_RED_BRICK1, DafangBlocks.GRANITE_RED_BRICK2, DafangBlocks.GRANITE_RED_BRICK3, DafangBlocks.GRANITE_RED_BRICK5, DafangBlocks.GRANITE_RED_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_RED_BRICK5, DafangBlocks.GRANITE_RED_BRICK1, DafangBlocks.GRANITE_RED_BRICK2, DafangBlocks.GRANITE_RED_BRICK3, DafangBlocks.GRANITE_RED_BRICK4, DafangBlocks.GRANITE_RED_TILES);

//        // --- 3. 银河灰系列 (GALAXYGRAY) ---
//        addStonecutting(exporter, DafangBlocks.GRANITE_GALAXYGRAY,
//            DafangBlocks.GRANITE_GALAXYGRAY_POLISHED, DafangBlocks.GRANITE_GALAXYGRAY_MATTE, DafangBlocks.GRANITE_GALAXYGRAY_TILES,
//            DafangBlocks.GRANITE_GALAXYGRAY_BRICK1, DafangBlocks.GRANITE_GALAXYGRAY_BRICK2,
//            DafangBlocks.GRANITE_GALAXYGRAY_BRICK3, DafangBlocks.GRANITE_GALAXYGRAY_BRICK4, DafangBlocks.GRANITE_GALAXYGRAY_BRICK5,
//            DafangBlocks.GRANITE_GALAXYGRAY_SLAB, DafangBlocks.GRANITE_GALAXYGRAY_STAIRS, DafangBlocks.GRANITE_GALAXYGRAY_WALL);
//
//        addStonecutting(exporter, DafangBlocks.GRANITE_GALAXYGRAY_BRICK1, DafangBlocks.GRANITE_GALAXYGRAY_BRICK2, DafangBlocks.GRANITE_GALAXYGRAY_BRICK3, DafangBlocks.GRANITE_GALAXYGRAY_BRICK4, DafangBlocks.GRANITE_GALAXYGRAY_BRICK5, DafangBlocks.GRANITE_GALAXYGRAY_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_GALAXYGRAY_BRICK2, DafangBlocks.GRANITE_GALAXYGRAY_BRICK1, DafangBlocks.GRANITE_GALAXYGRAY_BRICK3, DafangBlocks.GRANITE_GALAXYGRAY_BRICK4, DafangBlocks.GRANITE_GALAXYGRAY_BRICK5, DafangBlocks.GRANITE_GALAXYGRAY_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_GALAXYGRAY_BRICK3, DafangBlocks.GRANITE_GALAXYGRAY_BRICK1, DafangBlocks.GRANITE_GALAXYGRAY_BRICK2, DafangBlocks.GRANITE_GALAXYGRAY_BRICK4, DafangBlocks.GRANITE_GALAXYGRAY_BRICK5, DafangBlocks.GRANITE_GALAXYGRAY_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_GALAXYGRAY_BRICK4, DafangBlocks.GRANITE_GALAXYGRAY_BRICK1, DafangBlocks.GRANITE_GALAXYGRAY_BRICK2, DafangBlocks.GRANITE_GALAXYGRAY_BRICK3, DafangBlocks.GRANITE_GALAXYGRAY_BRICK5, DafangBlocks.GRANITE_GALAXYGRAY_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_GALAXYGRAY_BRICK5, DafangBlocks.GRANITE_GALAXYGRAY_BRICK1, DafangBlocks.GRANITE_GALAXYGRAY_BRICK2, DafangBlocks.GRANITE_GALAXYGRAY_BRICK3, DafangBlocks.GRANITE_GALAXYGRAY_BRICK4, DafangBlocks.GRANITE_GALAXYGRAY_TILES);

//        // --- 4. 灰花岗岩系列 (GRAY) ---
//        addStonecutting(exporter, DafangBlocks.GRANITE_GRAY,
//            DafangBlocks.GRANITE_GRAY_POLISHED, DafangBlocks.GRANITE_GRAY_MATTE, DafangBlocks.GRANITE_GRAY_TILES,
//            DafangBlocks.GRANITE_GRAY_BRICK1, DafangBlocks.GRANITE_GRAY_BRICK2,
//            DafangBlocks.GRANITE_GRAY_BRICK3, DafangBlocks.GRANITE_GRAY_BRICK4, DafangBlocks.GRANITE_GRAY_BRICK5,
//            DafangBlocks.GRANITE_GRAY_SLAB, DafangBlocks.GRANITE_GRAY_STAIRS, DafangBlocks.GRANITE_GRAY_WALL);
//
//        addStonecutting(exporter, DafangBlocks.GRANITE_GRAY_BRICK1, DafangBlocks.GRANITE_GRAY_BRICK2, DafangBlocks.GRANITE_GRAY_BRICK3, DafangBlocks.GRANITE_GRAY_BRICK4, DafangBlocks.GRANITE_GRAY_BRICK5, DafangBlocks.GRANITE_GRAY_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_GRAY_BRICK2, DafangBlocks.GRANITE_GRAY_BRICK1, DafangBlocks.GRANITE_GRAY_BRICK3, DafangBlocks.GRANITE_GRAY_BRICK4, DafangBlocks.GRANITE_GRAY_BRICK5, DafangBlocks.GRANITE_GRAY_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_GRAY_BRICK3, DafangBlocks.GRANITE_GRAY_BRICK1, DafangBlocks.GRANITE_GRAY_BRICK2, DafangBlocks.GRANITE_GRAY_BRICK4, DafangBlocks.GRANITE_GRAY_BRICK5, DafangBlocks.GRANITE_GRAY_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_GRAY_BRICK4, DafangBlocks.GRANITE_GRAY_BRICK1, DafangBlocks.GRANITE_GRAY_BRICK2, DafangBlocks.GRANITE_GRAY_BRICK3, DafangBlocks.GRANITE_GRAY_BRICK5, DafangBlocks.GRANITE_GRAY_TILES);
//        addStonecutting(exporter, DafangBlocks.GRANITE_GRAY_BRICK5, DafangBlocks.GRANITE_GRAY_BRICK1, DafangBlocks.GRANITE_GRAY_BRICK2, DafangBlocks.GRANITE_GRAY_BRICK3, DafangBlocks.GRANITE_GRAY_BRICK4, DafangBlocks.GRANITE_GRAY_TILES);

//        // --- 5. 平滑石系列 (SMOOTHSTONE) ---
//        addStonecutting(exporter, DafangBlocks.DAFANG_SMOOTHSTONE,
//            DafangBlocks.DAFANG_SMOOTHSTONE_BRICK1, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK2,
//            DafangBlocks.DAFANG_SMOOTHSTONE_BRICK3, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK4, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK5,
//            DafangBlocks.DAFANG_SMOOTHSTONE_SLAB, DafangBlocks.DAFANG_SMOOTHSTONE_STAIRS, DafangBlocks.DAFANG_SMOOTHSTONE_WALL);
//
//        addStonecutting(exporter, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK1, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK2, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK3, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK4, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK5);
//        addStonecutting(exporter, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK2, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK1, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK3, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK4, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK5);
//        addStonecutting(exporter, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK3, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK1, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK2, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK4, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK5);
//        addStonecutting(exporter, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK4, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK1, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK2, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK3, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK5);
//        addStonecutting(exporter, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK5, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK1, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK2, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK3, DafangBlocks.DAFANG_SMOOTHSTONE_BRICK4);
//
//
//        // --- 6. 现代系列 (MODERN) ---
//        addStonecutting(exporter, DafangBlocks.DAFANG_MODERN_1, DafangBlocks.DAFANG_MODERN_2, DafangBlocks.DAFANG_MODERN_3, DafangBlocks.DAFANG_MODERN_4, DafangBlocks.DAFANG_MODERN_1_SLAB, DafangBlocks.DAFANG_MODERN_1_STAIRS, DafangBlocks.DAFANG_MODERN_1_WALL);
//        addStonecutting(exporter, DafangBlocks.DAFANG_MODERN_2, DafangBlocks.DAFANG_MODERN_1, DafangBlocks.DAFANG_MODERN_3, DafangBlocks.DAFANG_MODERN_4);
//        addStonecutting(exporter, DafangBlocks.DAFANG_MODERN_3, DafangBlocks.DAFANG_MODERN_1, DafangBlocks.DAFANG_MODERN_2, DafangBlocks.DAFANG_MODERN_4);
//        addStonecutting(exporter, DafangBlocks.DAFANG_MODERN_4, DafangBlocks.DAFANG_MODERN_1, DafangBlocks.DAFANG_MODERN_2, DafangBlocks.DAFANG_MODERN_3);

        //自动注册
        //FAIMILY自动注册，SLAB STAIRS WALL
        for(DafangBlockFamily family : DafangBlocks.getAllFamilies()){
            addStonecutting(exporter, family.getBase(), family.getSlab(), family.getStairs(), family.getWall());
        }
        //手动注册
        // 母岩转主样式
        addStonecutting(exporter, DafangBlocks.getBlockbyID("granite_yellowrust"),
            DafangBlocks.getBlockbyID("granite_yellowrust_polished"),
            DafangBlocks.getBlockbyID("granite_yellowrust_matte"),
            DafangBlocks.getBlockbyID("granite_yellowrust_tiles"),
            DafangBlocks.getBlockbyID("granite_yellowrust_mushroom"));
        addStonecutting(exporter, DafangBlocks.getBlockbyID("granite_red"),
            DafangBlocks.getBlockbyID("granite_red_polished"),
            DafangBlocks.getBlockbyID("granite_red_matte"),
            DafangBlocks.getBlockbyID("granite_red_tiles"),
            DafangBlocks.getBlockbyID("granite_red_mushroom"));
        addStonecutting(exporter, DafangBlocks.getBlockbyID("granite_gray"),
            DafangBlocks.getBlockbyID("granite_gray_polished"),
            DafangBlocks.getBlockbyID("granite_gray_matte"),
            DafangBlocks.getBlockbyID("granite_gray_tiles"),
            DafangBlocks.getBlockbyID("granite_gray_mushroom"));
        addStonecutting(exporter, DafangBlocks.getBlockbyID("granite_galaxygray"),
            DafangBlocks.getBlockbyID("granite_galaxygray_polished"),
            DafangBlocks.getBlockbyID("granite_galaxygray_matte"),
            DafangBlocks.getBlockbyID("granite_galaxygray_tiles"));
        addStonecuttingMutual(exporter,
            DafangBlocks.getBlockbyID("dafang_modern_1"),
            DafangBlocks.getBlockbyID("dafang_modern_2"),
            DafangBlocks.getBlockbyID("dafang_modern_3"),
            DafangBlocks.getBlockbyID("dafang_modern_4"));
        addStonecuttingMutual(exporter,
            DafangBlocks.getBlockbyID("dafang_smoothstone"),
            DafangBlocks.getBlockbyID("dafang_smoothstone_brick1"),
            DafangBlocks.getBlockbyID("dafang_smoothstone_brick2"),
            DafangBlocks.getBlockbyID("dafang_smoothstone_brick3"),
            DafangBlocks.getBlockbyID("dafang_smoothstone_brick4"),
            DafangBlocks.getBlockbyID("dafang_smoothstone_brick5"));
        addStonecuttingMutual(exporter,
            DafangBlocks.getBlockbyID("granite_yellowrust_brick1"),
            DafangBlocks.getBlockbyID("granite_yellowrust_brick2"),
            DafangBlocks.getBlockbyID("granite_yellowrust_brick3"),
            DafangBlocks.getBlockbyID("granite_yellowrust_brick4"),
            DafangBlocks.getBlockbyID("granite_yellowrust_brick5"));
        addStonecuttingMutual(exporter,
            DafangBlocks.getBlockbyID("granite_red_brick1"),
            DafangBlocks.getBlockbyID("granite_red_brick2"),
            DafangBlocks.getBlockbyID("granite_red_brick3"),
            DafangBlocks.getBlockbyID("granite_red_brick4"),
            DafangBlocks.getBlockbyID("granite_red_brick5"));
        addStonecuttingMutual(exporter,
            DafangBlocks.getBlockbyID("granite_gray_brick1"),
            DafangBlocks.getBlockbyID("granite_gray_brick2"),
            DafangBlocks.getBlockbyID("granite_gray_brick3"),
            DafangBlocks.getBlockbyID("granite_gray_brick4"),
            DafangBlocks.getBlockbyID("granite_gray_brick5"));
        addStonecuttingMutual(exporter,
            DafangBlocks.getBlockbyID("granite_galaxygray_brick1"),
            DafangBlocks.getBlockbyID("granite_galaxygray_brick2"),
            DafangBlocks.getBlockbyID("granite_galaxygray_brick3"),
            DafangBlocks.getBlockbyID("granite_galaxygray_brick4"),
            DafangBlocks.getBlockbyID("granite_galaxygray_brick5"));
    }

    private void addStonecutting(Consumer<RecipeJsonProvider> exporter, Block input, Block... outputs) {
        for (Block output : outputs) {
            String path = Registries.BLOCK.getId(output).getPath();
            int count = path.endsWith("_slab") ? 2 : 1;
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, output, input, count);
        }
    }
    private void addStonecuttingMutual(Consumer<RecipeJsonProvider> exporter, Block... allBlocks) {
        for (Block input : allBlocks) {
            for (Block output : allBlocks) {
                if (input == output) continue;
                String path = Registries.BLOCK.getId(output).getPath();
                int count = path.endsWith("_slab") ? 2 : 1;
                offerStonecuttingRecipe(
                    exporter,
                    RecipeCategory.BUILDING_BLOCKS,
                    output,
                    input,
                    count
                );
            }
        }
    }
    @Override
    public String getName() {
        return "Dafang Stonecutting Recipes";
    }
}
