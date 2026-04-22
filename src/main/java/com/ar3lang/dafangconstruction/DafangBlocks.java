package com.ar3lang.dafangconstruction;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
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

    // 石头类注册
    // 黄锈石
    public static final Block GRANITE_YELLOWRUST = register("granite_yellowrust",new Block(AbstractBlock.Settings.copy(Blocks.STONE)),new DafangTags[]{DafangTags.ROCK,DafangTags.RAW},true);
    public static final Block GRANITE_YELLOWRUST_BRICK1 = register("granite_yellowrust_brick1",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.CROSS,DafangTags.x2});
    public static final Block GRANITE_YELLOWRUST_BRICK2 = register("granite_yellowrust_brick2",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.HORIZONTAL,DafangTags.x2});
    public static final Block GRANITE_YELLOWRUST_BRICK3 = register("granite_yellowrust_brick3",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.HORIZONTAL,DafangTags.x1_5});
    public static final Block GRANITE_YELLOWRUST_BRICK4 = register("granite_yellowrust_brick4",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.VERTICAL,DafangTags.x2});
    public static final Block GRANITE_YELLOWRUST_BRICK5 = register("granite_yellowrust_brick5",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.VERTICAL,DafangTags.x1_5});
    public static final Block GRANITE_YELLOWRUST_POLISHED = register("granite_yellowrust_polished",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.POLISHED,DafangTags.x1});
    public static final Block GRANITE_YELLOWRUST_MATTE = register("granite_yellowrust_matte",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.MATTE});
    public static final Block GRANITE_YELLOWRUST_TILES = register("granite_yellowrust_tiles",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.RANDOM,DafangTags.x1});

    //黄锈台阶
    public static final Block GRANITE_YELLOWRUST_SLAB = register("granite_yellowrust_slab",new SlabBlock(AbstractBlock.Settings.copy(GRANITE_YELLOWRUST)),new DafangTags[]{DafangTags.ROCK,DafangTags.RAW});
    public static final Block GRANITE_YELLOWRUST_BRICK1_SLAB = register("granite_yellowrust_brick1_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.CROSS,DafangTags.x2});
    public static final Block GRANITE_YELLOWRUST_BRICK2_SLAB = register("granite_yellowrust_brick2_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.HORIZONTAL,DafangTags.x2});
    public static final Block GRANITE_YELLOWRUST_BRICK3_SLAB = register("granite_yellowrust_brick3_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.HORIZONTAL,DafangTags.x1_5});
    public static final Block GRANITE_YELLOWRUST_BRICK4_SLAB = register("granite_yellowrust_brick4_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.VERTICAL,DafangTags.x2});
    public static final Block GRANITE_YELLOWRUST_BRICK5_SLAB = register("granite_yellowrust_brick5_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.VERTICAL,DafangTags.x1_5});
    public static final Block GRANITE_YELLOWRUST_POLISHED_SLAB = register("granite_yellowrust_polished_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.POLISHED,DafangTags.x1});
    public static final Block GRANITE_YELLOWRUST_MATTE_SLAB = register("granite_yellowrust_matte_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.MATTE});
    public static final Block GRANITE_YELLOWRUST_TILES_SLAB = register("granite_yellowrust_tiles_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.RANDOM,DafangTags.x1});

    //黄锈楼梯
    // Sublime正则表达式查找替换，从台阶复制：
    // 查找：(Block (\w.*?)_STAIRS.*)FabricB
    // 替换：\1\2.getDefaultState(), FabricB
    public static final Block GRANITE_YELLOWRUST_STAIRS = register("granite_yellowrust_stairs",new StairsBlock(GRANITE_YELLOWRUST.getDefaultState(), AbstractBlock.Settings.copy(GRANITE_YELLOWRUST)),
        new DafangTags[]{DafangTags.ROCK,DafangTags.RAW});
    public static final Block GRANITE_YELLOWRUST_BRICK1_STAIRS = register("granite_yellowrust_brick1_stairs",new StairsBlock(GRANITE_YELLOWRUST_BRICK1.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.CROSS,DafangTags.x2});
    public static final Block GRANITE_YELLOWRUST_BRICK2_STAIRS = register("granite_yellowrust_brick2_stairs",new StairsBlock(GRANITE_YELLOWRUST_BRICK2.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.HORIZONTAL,DafangTags.x2});
    public static final Block GRANITE_YELLOWRUST_BRICK3_STAIRS = register("granite_yellowrust_brick3_stairs",new StairsBlock(GRANITE_YELLOWRUST_BRICK3.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.HORIZONTAL,DafangTags.x1_5});
    public static final Block GRANITE_YELLOWRUST_BRICK4_STAIRS = register("granite_yellowrust_brick4_stairs",new StairsBlock(GRANITE_YELLOWRUST_BRICK4.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.VERTICAL,DafangTags.x2});
    public static final Block GRANITE_YELLOWRUST_BRICK5_STAIRS = register("granite_yellowrust_brick5_stairs",new StairsBlock(GRANITE_YELLOWRUST_BRICK5.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.VERTICAL,DafangTags.x1_5});
    public static final Block GRANITE_YELLOWRUST_POLISHED_STAIRS = register("granite_yellowrust_polished_stairs",new StairsBlock(GRANITE_YELLOWRUST_POLISHED.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.POLISHED,DafangTags.x1});
    public static final Block GRANITE_YELLOWRUST_MATTE_STAIRS = register("granite_yellowrust_matte_stairs",new StairsBlock(GRANITE_YELLOWRUST_MATTE.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.MATTE});
    public static final Block GRANITE_YELLOWRUST_TILES_STAIRS = register("granite_yellowrust_tiles_stairs",new StairsBlock(GRANITE_YELLOWRUST_TILES.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.RANDOM,DafangTags.x1});

    //黄锈墙
    public static final Block GRANITE_YELLOWRUST_WALL = register("granite_yellowrust_wall", new WallBlock(AbstractBlock.Settings.copy(GRANITE_YELLOWRUST)), new DafangTags[]{DafangTags.ROCK,DafangTags.RAW});
    public static final Block GRANITE_YELLOWRUST_BRICK1_WALL = register("granite_yellowrust_brick1_wall",new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.CROSS,DafangTags.x2});
    public static final Block GRANITE_YELLOWRUST_BRICK2_WALL = register("granite_yellowrust_brick2_wall",new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.HORIZONTAL,DafangTags.x2});
    public static final Block GRANITE_YELLOWRUST_BRICK3_WALL = register("granite_yellowrust_brick3_wall",new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.HORIZONTAL,DafangTags.x1_5});
    public static final Block GRANITE_YELLOWRUST_BRICK4_WALL = register("granite_yellowrust_brick4_wall",new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.VERTICAL,DafangTags.x2});
    public static final Block GRANITE_YELLOWRUST_BRICK5_WALL = register("granite_yellowrust_brick5_wall",new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.VERTICAL,DafangTags.x1_5});
    public static final Block GRANITE_YELLOWRUST_POLISHED_WALL = register("granite_yellowrust_polished_wall",new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.POLISHED,DafangTags.x1});
    public static final Block GRANITE_YELLOWRUST_MATTE_WALL = register("granite_yellowrust_matte_wall",new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.MATTE});
    public static final Block GRANITE_YELLOWRUST_TILES_WALL = register("granite_yellowrust_tiles_wall",new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.RANDOM,DafangTags.x1});



    // 泛红花岗岩
    public static final Block GRANITE_RED = register("granite_red",new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.STONE)),new DafangTags[]{DafangTags.ROCK,DafangTags.RAW},true);
    public static final Block GRANITE_RED_BRICK1 = register("granite_red_brick1",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.CROSS,DafangTags.x2});
    public static final Block GRANITE_RED_BRICK2 = register("granite_red_brick2",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.HORIZONTAL,DafangTags.x2});
    public static final Block GRANITE_RED_BRICK3 = register("granite_red_brick3",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.HORIZONTAL,DafangTags.x1_5});
    public static final Block GRANITE_RED_BRICK4 = register("granite_red_brick4",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.VERTICAL,DafangTags.x2});
    public static final Block GRANITE_RED_BRICK5 = register("granite_red_brick5",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.VERTICAL,DafangTags.x1_5});
    public static final Block GRANITE_RED_POLISHED = register("granite_red_polished",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.POLISHED,DafangTags.x1});
    public static final Block GRANITE_RED_MATTE = register("granite_red_matte",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.MATTE});
    public static final Block GRANITE_RED_TILES = register("granite_red_tiles",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.RANDOM,DafangTags.x1});




    //## 银河灰花岗岩
    public static final Block GRANITE_GALAXYGRAY = register("granite_galaxygray",new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.STONE)),new DafangTags[]{DafangTags.ROCK,DafangTags.RAW},true);
    public static final Block GRANITE_GALAXYGRAY_BRICK1 = register("granite_galaxygray_brick1",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.CROSS,DafangTags.x2});
    public static final Block GRANITE_GALAXYGRAY_BRICK2 = register("granite_galaxygray_brick2",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.HORIZONTAL,DafangTags.x2});
    public static final Block GRANITE_GALAXYGRAY_BRICK3 = register("granite_galaxygray_brick3",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.HORIZONTAL,DafangTags.x1_5});
    public static final Block GRANITE_GALAXYGRAY_BRICK4 = register("granite_galaxygray_brick4",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.VERTICAL,DafangTags.x2});
    public static final Block GRANITE_GALAXYGRAY_BRICK5 = register("granite_galaxygray_brick5",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.VERTICAL,DafangTags.x1_5});
    public static final Block GRANITE_GALAXYGRAY_POLISHED = register("granite_galaxygray_polished",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.POLISHED,DafangTags.x1});
    public static final Block GRANITE_GALAXYGRAY_MATTE = register("granite_galaxygray_matte",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.MATTE});
    public static final Block GRANITE_GALAXYGRAY_TILES = register("granite_galaxygray_tiles",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.RANDOM,DafangTags.x1});
    //# 灰花岗岩
    public static final Block GRANITE_GRAY = register("granite_gray",new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.STONE)),new DafangTags[]{DafangTags.ROCK,DafangTags.RAW},true);
    public static final Block GRANITE_GRAY_BRICK1 = register("granite_gray_brick1",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.CROSS,DafangTags.x2});
    public static final Block GRANITE_GRAY_BRICK_2 = register("granite_gray_brick2",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.HORIZONTAL,DafangTags.x2});
    public static final Block GRANITE_GRAY_BRICK3 = register("granite_gray_brick3",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.HORIZONTAL,DafangTags.x1_5});
    public static final Block GRANITE_GRAY_BRICK4 = register("granite_gray_brick4",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.VERTICAL,DafangTags.x2});
    public static final Block GRANITE_GRAY_BRICK5 = register("granite_gray_brick5",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.FIRE,DafangTags.VERTICAL,DafangTags.x1_5});
    public static final Block GRANITE_GRAY_POLISHED = register("granite_gray_polished",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.POLISHED,DafangTags.x1});
    public static final Block GRANITE_GRAY_MATTE = register("granite_gray_matte",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.MATTE});
    public static final Block GRANITE_GRAY_TILES = register("granite_gray_tiles",new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)),new DafangTags[]{DafangTags.ROCK,DafangTags.RANDOM,DafangTags.x1});
}
