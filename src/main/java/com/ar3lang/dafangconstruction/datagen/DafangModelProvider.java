package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.DafangBlocks;
import com.ar3lang.dafangconstruction.DafangConstruction;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.BlockStateVariant;
import net.minecraft.data.client.BlockStateVariantMap;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.VariantSettings;
import net.minecraft.data.client.VariantsBlockStateSupplier;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class DafangModelProvider extends FabricModelProvider {

    public DafangModelProvider(FabricDataOutput output) {
        super(output);
    }

    /**
     * 只注册 blockstate，不生成模型 JSON。
     * 模型由 Fusion 通过 texture metadata 动态生成。
     */
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Yellow Rust Granite
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK_1);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK_2);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK_3);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK_4);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK_5);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_MATTE);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_POLISHED);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_TILES);

        // Red Granite
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_BRICK_1);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_BRICK_2);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_BRICK_3);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_BRICK_4);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_BRICK_5);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_MATTE);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_POLISHED);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_TILES);

        // Galaxy Gray Granite
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_BRICK_1);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_BRICK_2);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_BRICK_3);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_BRICK_4);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_BRICK_5);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_MATTE);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_POLISHED);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_TILES);

        // Gray Granite
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GRAY);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GRAY_BRICK_1);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GRAY_BRICK_2);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GRAY_BRICK_3);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GRAY_BRICK_4);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GRAY_BRICK_5);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GRAY_MATTE);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GRAY_POLISHED);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GRAY_TILES);
    }

    /**
     * 注册 blockstate，让模型指向 Fusion 会处理的纹理路径。
     * 不生成模型 JSON，模型由 Fusion 动态生成。
     */
    private void registerFusionBlockState(BlockStateModelGenerator generator, Block block) {
        Identifier blockId = Registries.BLOCK.getId(block);
        // 模型 ID 指向 textures/block 下的纹理（去掉 .png 扩展名）
        // Fusion 会根据 textures/block/[path].png.mcmeta 动态处理
        Identifier modelId = new Identifier(DafangConstruction.MOD_ID, "block/" + blockId.getPath());

        // 只注册 blockstate，不注册模型（不调用 modelCollector）
        generator.blockStateCollector.accept(
            VariantsBlockStateSupplier.create(
                block,
                BlockStateVariant.create()
                    .put(VariantSettings.MODEL, modelId)
            )
        );

        // 注意：这里不注册 item 模型，因为 generateItemModels 是空方法
        // 如果需要 item 模型指向同一个 block 模型，可以在这里额外处理
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // 物品模型留空，或后续手动添加
        // Fusion 的模型在 block 处已经处理，item 通常继承 block 的模型
    }
}
