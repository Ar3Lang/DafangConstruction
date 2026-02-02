package com.ar3lang.dafangconstruction;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static com.ar3lang.dafangconstruction.DafangBlocks.*;

public class DafangItemGroup {
    public static final RegistryKey<ItemGroup> DAFANG_ITEMGROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(DafangConstruction.MOD_ID, "dafang_construction"));

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(DAFANG_ITEMGROUP).register((entries) -> {
            entries.add(GRANITE_YELLOWRUST);
            entries.add(GRANITE_YELLOWRUST_BRICK_1);
            entries.add(GRANITE_YELLOWRUST_BRICK_2);
            entries.add(GRANITE_YELLOWRUST_BRICK_3);
            entries.add(GRANITE_YELLOWRUST_BRICK_4);
            entries.add(GRANITE_YELLOWRUST_BRICK_5);
            entries.add(GRANITE_YELLOWRUST_POLISHED);
            entries.add(GRANITE_YELLOWRUST_MATTE);
            entries.add(GRANITE_YELLOWRUST_TILES);

            entries.add(GRANITE_RED);
            entries.add(GRANITE_RED_BRICK_1);
            entries.add(GRANITE_RED_BRICK_2);
            entries.add(GRANITE_RED_BRICK_3);
            entries.add(GRANITE_RED_BRICK_4);
            entries.add(GRANITE_RED_BRICK_5);
            entries.add(GRANITE_RED_POLISHED);
            entries.add(GRANITE_RED_MATTE);
            entries.add(GRANITE_RED_TILES);

            entries.add(GRANITE_GALAXYGRAY);
            entries.add(GRANITE_GALAXYGRAY_BRICK_1);
            entries.add(GRANITE_GALAXYGRAY_BRICK_2);
            entries.add(GRANITE_GALAXYGRAY_BRICK_3);
            entries.add(GRANITE_GALAXYGRAY_BRICK_4);
            entries.add(GRANITE_GALAXYGRAY_BRICK_5);
            entries.add(GRANITE_GALAXYGRAY_POLISHED);
            entries.add(GRANITE_GALAXYGRAY_MATTE);
            entries.add(GRANITE_GALAXYGRAY_TILES);

            entries.add(GRANITE_GRAY);
            entries.add(GRANITE_GRAY_BRICK_1);
            entries.add(GRANITE_GRAY_BRICK_2);
            entries.add(GRANITE_GRAY_BRICK_3);
            entries.add(GRANITE_GRAY_BRICK_4);
            entries.add(GRANITE_GRAY_BRICK_5);
            entries.add(GRANITE_GRAY_POLISHED);
            entries.add(GRANITE_GRAY_MATTE);
            entries.add(GRANITE_GRAY_TILES);
        });
    }
}

