package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.DafangConstruction;
import com.ar3lang.dafangconstruction.block.DafangBlockFamily;
import com.ar3lang.dafangconstruction.block.DafangBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.data.client.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class DafangModelProvider extends FabricModelProvider {

    public DafangModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        for (DafangBlockFamily family : DafangBlocks.getAllFamilies()) {
            //分类
            //石头
//            if(family.getId().startsWith("granite")||family.getId().startsWith("cement")||family.getId().startsWith("marble")||family.getId().startsWith("dafang_modern")||family.getId().startsWith("dafang_smoothstone"))
//            {
//               registerFusionBlockState(generator, family.getBase(), "stone");
//            } else if (family.getId().startsWith("carpet")||family.getId().startsWith("fabric"))
//            {
//                registerFusionBlockState(generator, family.getBase(), "cloth");
//            }
//            else
                if (family.getBase() != null)
                {
                    registerFusionBlockState(generator, family.getBase());
                    registerFusionSlabBlockState(generator, family.getBase(), family.getSlab());
                    registerFusionStairs(generator, family.getStairs());
                    registerFusionWall(generator, family.getWall());
                }

        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator generator) {
        for (DafangBlockFamily family : DafangBlocks.getAllFamilies()) {
            // 只有墙需要特殊处理 item 模型（根据你的原有代码逻辑）
            if (family.getWall() != null) {
                registerWallItemModel(generator, family.getWall());
            }
        }
    }

    // --- 以下是辅助方法，保持你的 Fusion 逻辑不变 ---

    private void registerFusionBlockState(BlockStateModelGenerator generator, Block block) {
        Identifier blockId = Registries.BLOCK.getId(block);
        Identifier modelId = new Identifier(DafangConstruction.MOD_ID, "block/" + blockId.getPath());
        generator.blockStateCollector.accept(
            VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, modelId))
        );
    }
    private void registerFusionBlockState(BlockStateModelGenerator generator, Block block, String catograph) {
        Identifier blockId = Registries.BLOCK.getId(block);
        Identifier modelId = new Identifier(
            DafangConstruction.MOD_ID,
            "block/" + catograph + "/" + blockId.getPath()
        );
        generator.blockStateCollector.accept(
            VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, modelId))
        );
    }


    private void registerFusionSlabBlockState(BlockStateModelGenerator generator, Block baseBlock, Block slabBlock) {
        Identifier slabId = Registries.BLOCK.getId(slabBlock);
        Identifier baseId = Registries.BLOCK.getId(baseBlock);

        generator.blockStateCollector.accept(
            VariantsBlockStateSupplier.create(slabBlock)
                .coordinate(BlockStateVariantMap.create(SlabBlock.TYPE)
                    .register(SlabType.BOTTOM, BlockStateVariant.create().put(VariantSettings.MODEL, new Identifier(DafangConstruction.MOD_ID, "block/" + slabId.getPath())))
                    .register(SlabType.TOP, BlockStateVariant.create().put(VariantSettings.MODEL, new Identifier(DafangConstruction.MOD_ID, "block/" + slabId.getPath() + "_top")))
                    .register(SlabType.DOUBLE, BlockStateVariant.create().put(VariantSettings.MODEL, new Identifier(DafangConstruction.MOD_ID, "block/" + baseId.getPath())))
                )
        );
    }

    private void registerFusionStairs(BlockStateModelGenerator generator, Block stairs) {
        String path = Registries.BLOCK.getId(stairs).getPath();
        generator.blockStateCollector.accept(
            BlockStateModelGenerator.createStairsBlockState(stairs,
                new Identifier(DafangConstruction.MOD_ID, "block/" + path + "_inner"),
                new Identifier(DafangConstruction.MOD_ID, "block/" + path),
                new Identifier(DafangConstruction.MOD_ID, "block/" + path + "_outer"))
        );
    }

    private void registerFusionWall(BlockStateModelGenerator generator, Block wall) {
        String path = Registries.BLOCK.getId(wall).getPath();
        generator.blockStateCollector.accept(
            BlockStateModelGenerator.createWallBlockState(wall,
                new Identifier(DafangConstruction.MOD_ID, "block/" + path + "_post"),
                new Identifier(DafangConstruction.MOD_ID, "block/" + path + "_side"),
                new Identifier(DafangConstruction.MOD_ID, "block/" + path + "_side_tall"))
        );
    }

    private void registerWallItemModel(ItemModelGenerator generator, Block wall) {
        Identifier wallId = Registries.BLOCK.getId(wall);
        Identifier inventoryModelId = new Identifier(DafangConstruction.MOD_ID, "block/" + wallId.getPath() + "_inventory");
        generator.register(wall.asItem(), new Model(Optional.of(inventoryModelId), Optional.empty()));
    }
}
