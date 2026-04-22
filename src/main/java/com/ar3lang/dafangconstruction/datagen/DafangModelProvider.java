package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.DafangBlocks;
import com.ar3lang.dafangconstruction.DafangConstruction;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
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
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK1);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK2);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK3);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK4);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK5);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_MATTE);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_POLISHED);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_TILES);
        registerFusionSlabBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST, DafangBlocks.GRANITE_YELLOWRUST_SLAB);
        registerFusionSlabBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK1, DafangBlocks.GRANITE_YELLOWRUST_BRICK1_SLAB);
        registerFusionSlabBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK2, DafangBlocks.GRANITE_YELLOWRUST_BRICK2_SLAB);
        registerFusionSlabBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK3, DafangBlocks.GRANITE_YELLOWRUST_BRICK3_SLAB);
        registerFusionSlabBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK4, DafangBlocks.GRANITE_YELLOWRUST_BRICK4_SLAB);
        registerFusionSlabBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK5, DafangBlocks.GRANITE_YELLOWRUST_BRICK5_SLAB);
        registerFusionSlabBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_MATTE, DafangBlocks.GRANITE_YELLOWRUST_MATTE_SLAB);
        registerFusionSlabBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_POLISHED, DafangBlocks.GRANITE_YELLOWRUST_POLISHED_SLAB);
        registerFusionSlabBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_TILES, DafangBlocks.GRANITE_YELLOWRUST_TILES_SLAB);
        registerFusionStairs(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_STAIRS);
        registerFusionStairs(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK1_STAIRS);
        registerFusionStairs(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK2_STAIRS);
        registerFusionStairs(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK3_STAIRS);
        registerFusionStairs(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK4_STAIRS);
        registerFusionStairs(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK5_STAIRS);
        registerFusionStairs(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_MATTE_STAIRS);
        registerFusionStairs(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_POLISHED_STAIRS);
        registerFusionStairs(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_TILES_STAIRS);
        registerFusionWall(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_WALL);
        registerFusionWall(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK1_WALL);
        registerFusionWall(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK2_WALL);
        registerFusionWall(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK3_WALL);
        registerFusionWall(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK4_WALL);
        registerFusionWall(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_BRICK5_WALL);
        registerFusionWall(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_MATTE_WALL);
        registerFusionWall(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_POLISHED_WALL);
        registerFusionWall(blockStateModelGenerator, DafangBlocks.GRANITE_YELLOWRUST_TILES_WALL);

        // Red Granite
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_BRICK1);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_BRICK2);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_BRICK3);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_BRICK4);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_BRICK5);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_MATTE);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_POLISHED);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_RED_TILES);

        // Galaxy Gray Granite
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_BRICK1);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_BRICK2);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_BRICK3);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_BRICK4);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_BRICK5);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_MATTE);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_POLISHED);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GALAXYGRAY_TILES);

        // Gray Granite
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GRAY);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GRAY_BRICK1);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GRAY_BRICK_2);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GRAY_BRICK3);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GRAY_BRICK4);
        registerFusionBlockState(blockStateModelGenerator, DafangBlocks.GRANITE_GRAY_BRICK5);
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
    private void registerFusionSlabBlockState(BlockStateModelGenerator generator, Block baseBlock, Block slabBlock) {
        Identifier baseId = Registries.BLOCK.getId(baseBlock);
        Identifier slabId = Registries.BLOCK.getId(slabBlock);

        Identifier bottomModelId = new Identifier(DafangConstruction.MOD_ID, "block/" + slabId.getPath());
        Identifier topModelId = new Identifier(DafangConstruction.MOD_ID, "block/" + slabId.getPath() + "_top");
        Identifier doubleModelId = new Identifier(DafangConstruction.MOD_ID, "block/" + baseId.getPath());

        generator.blockStateCollector.accept(
            VariantsBlockStateSupplier.create(slabBlock)
                .coordinate(BlockStateVariantMap.create(SlabBlock.TYPE)
                    .register(SlabType.BOTTOM, BlockStateVariant.create().put(VariantSettings.MODEL, bottomModelId))
                    .register(SlabType.TOP, BlockStateVariant.create().put(VariantSettings.MODEL, topModelId))
                    .register(SlabType.DOUBLE, BlockStateVariant.create().put(VariantSettings.MODEL, doubleModelId))
                )
        );
    }

    private void registerFusionStairs(BlockStateModelGenerator generator, Block stairs) {
        String path = Registries.BLOCK.getId(stairs).getPath();

        Identifier main = new Identifier(DafangConstruction.MOD_ID, "block/" + path);
        Identifier inner = new Identifier(DafangConstruction.MOD_ID, "block/" + path + "_inner");
        Identifier outer = new Identifier(DafangConstruction.MOD_ID, "block/" + path + "_outer");

        generator.blockStateCollector.accept(
            BlockStateModelGenerator.createStairsBlockState(stairs, inner, main, outer)
        );
    }

    private void registerFusionWall(BlockStateModelGenerator generator, Block wall) {
        String path = Registries.BLOCK.getId(wall).getPath();

        Identifier post = new Identifier(DafangConstruction.MOD_ID, "block/" + path + "_post");
        Identifier side = new Identifier(DafangConstruction.MOD_ID, "block/" + path + "_side");
        Identifier sideTall = new Identifier(DafangConstruction.MOD_ID, "block/" + path + "_side_tall");

        generator.blockStateCollector.accept(
            BlockStateModelGenerator.createWallBlockState(wall, post, side, sideTall)
        );
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // 物品模型留空，或后续手动添加
        // Fusion 的模型在 block 处已经处理，item 通常继承 block 的模型
    }
}
