package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.DafangBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;

public class DafangLootTablesProvider extends FabricBlockLootTableProvider {
    public DafangLootTablesProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(DafangBlocks.GRANITE_YELLOWRUST);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_BRICK_1);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_BRICK_2);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_BRICK_3);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_BRICK_4);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_BRICK_5);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_MATTE);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_POLISHED);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_TILES);

        addDrop(DafangBlocks.GRANITE_RED);
        addDrop(DafangBlocks.GRANITE_RED_BRICK_1);
        addDrop(DafangBlocks.GRANITE_RED_BRICK_2);
        addDrop(DafangBlocks.GRANITE_RED_BRICK_3);
        addDrop(DafangBlocks.GRANITE_RED_BRICK_4);
        addDrop(DafangBlocks.GRANITE_RED_BRICK_5);
        addDrop(DafangBlocks.GRANITE_RED_MATTE);
        addDrop(DafangBlocks.GRANITE_RED_POLISHED);
        addDrop(DafangBlocks.GRANITE_RED_TILES);

        addDrop(DafangBlocks.GRANITE_GALAXYGRAY);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_1);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_2);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_3);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_4);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_5);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_MATTE);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_POLISHED);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_TILES);

        addDrop(DafangBlocks.GRANITE_GRAY);
        addDrop(DafangBlocks.GRANITE_GRAY_BRICK_1);
        addDrop(DafangBlocks.GRANITE_GRAY_BRICK_2);
        addDrop(DafangBlocks.GRANITE_GRAY_BRICK_3);
        addDrop(DafangBlocks.GRANITE_GRAY_BRICK_4);
        addDrop(DafangBlocks.GRANITE_GRAY_BRICK_5);
        addDrop(DafangBlocks.GRANITE_GRAY_MATTE);
        addDrop(DafangBlocks.GRANITE_GRAY_POLISHED);
        addDrop(DafangBlocks.GRANITE_GRAY_TILES);
    }
}
