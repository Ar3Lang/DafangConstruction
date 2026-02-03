package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.DafangBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class DafangModelProvider extends FabricModelProvider {

    public DafangModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_YELLOWRUST);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_YELLOWRUST_BRICK_1);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_YELLOWRUST_BRICK_2);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_YELLOWRUST_BRICK_3);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_YELLOWRUST_BRICK_4);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_YELLOWRUST_BRICK_5);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_YELLOWRUST_MATTE);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_YELLOWRUST_POLISHED);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_YELLOWRUST_TILES);
        
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_RED);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_RED_BRICK_1);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_RED_BRICK_2);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_RED_BRICK_3);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_RED_BRICK_4);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_RED_BRICK_5);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_RED_MATTE);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_RED_POLISHED);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_RED_TILES);
        
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GALAXYGRAY);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_1);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_2);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_3);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_4);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_5);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GALAXYGRAY_MATTE);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GALAXYGRAY_POLISHED);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GALAXYGRAY_TILES);
                
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GRAY);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GRAY_BRICK_1);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GRAY_BRICK_2);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GRAY_BRICK_3);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GRAY_BRICK_4);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GRAY_BRICK_5);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GRAY_MATTE);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GRAY_POLISHED);
        blockStateModelGenerator.registerSimpleCubeAll(DafangBlocks.GRANITE_GRAY_TILES);
        
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
