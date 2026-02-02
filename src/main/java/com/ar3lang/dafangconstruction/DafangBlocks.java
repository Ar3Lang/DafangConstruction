package com.ar3lang.dafangconstruction;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DafangBlocks {
    //# 成员方法
    public static Block register(String id, Block block) {
        Item.Settings itemSettings = new Item.Settings();
        return register(id, block, new BlockItem(block, itemSettings));
    }
    public static Block register(String id, Block block, BlockItem item) {
        Registry.register(Registries.BLOCK, new Identifier(DafangConstruction.MOD_ID, id), block);
        Registry.register(Registries.ITEM, new Identifier(DafangConstruction.MOD_ID, id), item);
        return block;
    }
    public static Block register(String id, Block block, DafangTags[] tags, Boolean info){
        Item.Settings itemSettings = new Item.Settings();
        BlockItem item = new DafangTooltipBlockItem(block, itemSettings, tags, info, id);
        return register(id, block, item);
    }
    public static Block register(String id, Block block, DafangTags[] tags) {
        Item.Settings itemSettings = new Item.Settings();
        BlockItem item = new DafangTooltipBlockItem(block, itemSettings, tags, id);
        return register(id, block, item);
    }

    //# 石头类注册
    //## 黄锈石
    public static final Block GRANITE_YELLOWRUST = register("granite_yellowrust",new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.STONE)),new DafangTags[]{DafangTags.ROCK},true);
    public static final Block GRANITE_YELLOWRUST_BRICK_1 = register("granite_yellowrust_brick1",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_YELLOWRUST_BRICK_2 = register("granite_yellowrust_brick2",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_YELLOWRUST_BRICK_3 = register("granite_yellowrust_brick3",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_YELLOWRUST_BRICK_4 = register("granite_yellowrust_brick4",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_YELLOWRUST_BRICK_5 = register("granite_yellowrust_brick5",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_YELLOWRUST_POLISHED = register("granite_yellowrust_polished",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_YELLOWRUST_MATTE = register("granite_yellowrust_matte",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_YELLOWRUST_TILES = register("granite_yellowrust_tiles",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    //## 泛红花岗岩
    public static final Block GRANITE_RED = register("granite_red",new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.STONE)),new DafangTags[]{DafangTags.ROCK},true);
    public static final Block GRANITE_RED_BRICK_1 = register("granite_red_brick1",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_RED_BRICK_2 = register("granite_red_brick2",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_RED_BRICK_3 = register("granite_red_brick3",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_RED_BRICK_4 = register("granite_red_brick4",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_RED_BRICK_5 = register("granite_red_brick5",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_RED_POLISHED = register("granite_red_polished",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_RED_MATTE = register("granite_red_matte",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_RED_TILES = register("granite_red_tiles",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    //## 银河灰花岗岩
    public static final Block GRANITE_GALAXYGRAY = register("granite_galaxygray",new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.STONE)),new DafangTags[]{DafangTags.ROCK},true);
    public static final Block GRANITE_GALAXYGRAY_BRICK_1 = register("granite_galaxygray_brick1",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_GALAXYGRAY_BRICK_2 = register("granite_galaxygray_brick2",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_GALAXYGRAY_BRICK_3 = register("granite_galaxygray_brick3",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_GALAXYGRAY_BRICK_4 = register("granite_galaxygray_brick4",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_GALAXYGRAY_BRICK_5 = register("granite_galaxygray_brick5",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_GALAXYGRAY_POLISHED = register("granite_galaxygray_polished",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_GALAXYGRAY_MATTE = register("granite_galaxygray_matte",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_GALAXYGRAY_TILES = register("granite_galaxygray_tiles",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    //# 灰花岗岩
    public static final Block GRANITE_GRAY = register("granite_gray",new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.STONE)),new DafangTags[]{DafangTags.ROCK},true);
    public static final Block GRANITE_GRAY_BRICK_1 = register("granite_gray_brick1",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_GRAY_BRICK_2 = register("granite_gray_brick2",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_GRAY_BRICK_3 = register("granite_gray_brick3",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_GRAY_BRICK_4 = register("granite_gray_brick4",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_GRAY_BRICK_5 = register("granite_gray_brick5",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_GRAY_POLISHED = register("granite_gray_polished",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_GRAY_MATTE = register("granite_gray_matte",new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block GRANITE_GRAY_TILES = register("granite_gray_tiles",new Block(FabricBlockSettings.copy(Blocks.STONE)));
}
