package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.DafangBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class DafangLootTablesProvider extends FabricBlockLootTableProvider {
    public DafangLootTablesProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(DafangBlocks.GRANITE_YELLOWRUST);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_BRICK1);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_BRICK2);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_BRICK3);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_BRICK4);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_BRICK5);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_MATTE);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_POLISHED);
        addDrop(DafangBlocks.GRANITE_YELLOWRUST_TILES);

        addDrop(DafangBlocks.GRANITE_RED);
        addDrop(DafangBlocks.GRANITE_RED_BRICK1);
        addDrop(DafangBlocks.GRANITE_RED_BRICK2);
        addDrop(DafangBlocks.GRANITE_RED_BRICK3);
        addDrop(DafangBlocks.GRANITE_RED_BRICK4);
        addDrop(DafangBlocks.GRANITE_RED_BRICK5);
        addDrop(DafangBlocks.GRANITE_RED_MATTE);
        addDrop(DafangBlocks.GRANITE_RED_POLISHED);
        addDrop(DafangBlocks.GRANITE_RED_TILES);

        addDrop(DafangBlocks.GRANITE_GALAXYGRAY);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_BRICK1);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_BRICK2);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_BRICK3);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_BRICK4);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_BRICK5);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_MATTE);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_POLISHED);
        addDrop(DafangBlocks.GRANITE_GALAXYGRAY_TILES);

        addDrop(DafangBlocks.GRANITE_GRAY);
        addDrop(DafangBlocks.GRANITE_GRAY_BRICK1);
        addDrop(DafangBlocks.GRANITE_GRAY_BRICK_2);
        addDrop(DafangBlocks.GRANITE_GRAY_BRICK3);
        addDrop(DafangBlocks.GRANITE_GRAY_BRICK4);
        addDrop(DafangBlocks.GRANITE_GRAY_BRICK5);
        addDrop(DafangBlocks.GRANITE_GRAY_MATTE);
        addDrop(DafangBlocks.GRANITE_GRAY_POLISHED);
        addDrop(DafangBlocks.GRANITE_GRAY_TILES);
    }
}
