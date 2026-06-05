package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.block.DafangBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.item.ItemConvertible;
import java.util.List;
import java.util.function.Consumer;

public class DafangFurnaceRecipeProvider extends FabricRecipeProvider {
    public DafangFurnaceRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        addSmelting(exporter,
            DafangBlocks.getFamily("granite_yellowrust").getBase().asItem(),
            DafangBlocks.getFamily("granite_yellowrust_brick1").getBase().asItem()
        );
        addSmelting(exporter,
            DafangBlocks.getFamily("granite_red").getBase().asItem(),
            DafangBlocks.getFamily("granite_red_brick1").getBase().asItem()
        );
        addSmelting(exporter,
            DafangBlocks.getFamily("granite_galaxygray").getBase().asItem(),
            DafangBlocks.getFamily("granite_galaxygray_brick1").getBase().asItem()
        );
        addSmelting(exporter,
            DafangBlocks.getFamily("granite_gray").getBase().asItem(),
            DafangBlocks.getFamily("granite_gray_brick1").getBase().asItem()
        );
        addSmelting(exporter,
            Blocks.SMOOTH_STONE,
            DafangBlocks.getFamily("dafang_smoothstone").getBase().asItem()
        );
    }

    /**
     * 辅助方法：同时注册熔炉和高炉配方
     * @param exporter 导出器
     * @param input 输入方块 (RAW)
     * @param output 输出方块 (BRICK1)
     */
    private void addSmelting(Consumer<RecipeJsonProvider> exporter, ItemConvertible input, ItemConvertible output) {
        List<ItemConvertible> inputs = List.of(input);

        // 熔炉配方：200刻 (10秒)，经验 0.1
        offerSmelting(exporter, inputs, RecipeCategory.BUILDING_BLOCKS, output, 0.1f, 200, "dafang_smelting");

        // 高炉配方：100刻 (5秒)，经验 0.1
        offerBlasting(exporter, inputs, RecipeCategory.BUILDING_BLOCKS, output, 0.1f, 100, "dafang_smelting");
    }
    @Override
    public String getName() {
        return "Dafang Furnace Recipes";
    }
}
