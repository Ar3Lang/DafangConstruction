package com.ar3lang.dafangconstruction.block;

import com.ar3lang.dafangconstruction.DafangTextureType;
import com.ar3lang.dafangconstruction.DafangTooltipBlockItem;
import com.ar3lang.dafangconstruction.datagen.DafangTextureMetadataProvider;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Collection;
import java.util.Map;


import com.ar3lang.dafangconstruction.DafangConstruction;
import com.ar3lang.dafangconstruction.DafangTags;

import java.util.*;

public class DafangBlocks {
    public static Block getBlockbyID(String id){
        return getFamily(id).getBase();
    }

    private static final Map<String, DafangBlockFamily> FAMILIES = new TreeMap<>();

    public static DafangBlockFamily getFamily(String id) {
        return FAMILIES.get(id);
    }

    public static Collection<DafangBlockFamily> getAllFamilies() {
        return FAMILIES.values();
    }

    // ===== 初始化入口 =====
    public static void init() {
        registerAll();
    }

    // ===== 注册入口 =====
    private static void registerAll() {

// ===== 黄锈石 =====
        registerFamily("granite_yellowrust", FabricBlockSettings.copy(Blocks.STONE), new DafangTags[]{DafangTags.ROCK, DafangTags.RAW,DafangTags.FLAT}, DafangTextureType.PATTERN2, true);
        registerFamily("granite_yellowrust_brick1", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.FIRE, DafangTags.CROSS, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("granite_yellowrust_brick2", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.FIRE, DafangTags.HORIZONTAL, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("granite_yellowrust_brick3", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.FIRE, DafangTags.HORIZONTAL, DafangTags.x1_5}, DafangTextureType.PATTERN1_5);
        registerFamily("granite_yellowrust_brick4", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.FIRE, DafangTags.VERTICAL, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("granite_yellowrust_brick5", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.FIRE, DafangTags.VERTICAL, DafangTags.x1_5}, DafangTextureType.PATTERN1_5);
        registerFamily("granite_yellowrust_polished", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.POLISHED, DafangTags.x1}, DafangTextureType.PATTERN2);
        registerFamily("granite_yellowrust_matte", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.MATTE,DafangTags.FLAT}, DafangTextureType.PATTERN2);
        registerFamily("granite_yellowrust_tiles", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.RANDOM, DafangTags.x1}, DafangTextureType.RANDOM3);
        registerFamily("granite_yellowrust_mushroom", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.ARTISTIC, DafangTags.x1}, DafangTextureType.PATTERN2);

// ===== 泛红花岗岩 =====
        registerFamily("granite_red", FabricBlockSettings.copy(Blocks.STONE), new DafangTags[]{DafangTags.ROCK, DafangTags.RAW,DafangTags.FLAT}, DafangTextureType.PATTERN2, true);
        registerFamily("granite_red_brick1", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.FIRE, DafangTags.CROSS, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("granite_red_brick2", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.FIRE, DafangTags.HORIZONTAL, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("granite_red_brick3", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.FIRE, DafangTags.HORIZONTAL, DafangTags.x1_5}, DafangTextureType.PATTERN1_5);
        registerFamily("granite_red_brick4", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.FIRE, DafangTags.VERTICAL, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("granite_red_brick5", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.FIRE, DafangTags.VERTICAL, DafangTags.x1_5}, DafangTextureType.PATTERN1_5);
        registerFamily("granite_red_polished", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.POLISHED, DafangTags.x1}, DafangTextureType.PATTERN2);
        registerFamily("granite_red_matte", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.MATTE,DafangTags.FLAT}, DafangTextureType.PATTERN2);
        registerFamily("granite_red_tiles", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.RANDOM, DafangTags.x1}, DafangTextureType.RANDOM3);
        registerFamily("granite_red_mushroom", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.ARTISTIC, DafangTags.x1}, DafangTextureType.PATTERN2);

// ===== 银河灰 =====
        registerFamily("granite_galaxygray", FabricBlockSettings.copy(Blocks.STONE), new DafangTags[]{DafangTags.ROCK, DafangTags.RAW,DafangTags.FLAT}, DafangTextureType.PATTERN2, true);
        registerFamily("granite_galaxygray_brick1", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.CROSS, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("granite_galaxygray_brick2", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.HORIZONTAL, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("granite_galaxygray_brick3", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.HORIZONTAL, DafangTags.x1_5}, DafangTextureType.PATTERN1_5);
        registerFamily("granite_galaxygray_brick4", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.VERTICAL, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("granite_galaxygray_brick5", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.VERTICAL, DafangTags.x1_5}, DafangTextureType.PATTERN1_5);
        registerFamily("granite_galaxygray_polished", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.POLISHED, DafangTags.x1}, DafangTextureType.PATTERN2);
        registerFamily("granite_galaxygray_matte", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.MATTE,DafangTags.FLAT}, DafangTextureType.PATTERN2);
        registerFamily("granite_galaxygray_tiles", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.RANDOM, DafangTags.x1}, DafangTextureType.RANDOM3);

// ===== 灰花岗岩 =====
        registerFamily("granite_gray", FabricBlockSettings.copy(Blocks.STONE), new DafangTags[]{DafangTags.ROCK, DafangTags.RAW,DafangTags.FLAT}, DafangTextureType.PATTERN2, true);
        registerFamily("granite_gray_brick1", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.FIRE, DafangTags.CROSS, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("granite_gray_brick2", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.FIRE, DafangTags.HORIZONTAL, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("granite_gray_brick3", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.FIRE, DafangTags.HORIZONTAL, DafangTags.x1_5}, DafangTextureType.PATTERN1_5);
        registerFamily("granite_gray_brick4", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.FIRE, DafangTags.VERTICAL, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("granite_gray_brick5", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.FIRE, DafangTags.VERTICAL, DafangTags.x1_5}, DafangTextureType.PATTERN1_5);
        registerFamily("granite_gray_polished", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.POLISHED, DafangTags.x1}, DafangTextureType.PATTERN2);
        registerFamily("granite_gray_matte", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.MATTE,DafangTags.FLAT}, DafangTextureType.PATTERN2);
        registerFamily("granite_gray_tiles", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK, DafangTags.RANDOM, DafangTags.x1}, DafangTextureType.RANDOM3);
        registerFamily("granite_gray_mushroom", FabricBlockSettings.copy(Blocks.STONE_BRICKS), new DafangTags[]{DafangTags.ROCK,DafangTags.ARTISTIC, DafangTags.x1}, DafangTextureType.PATTERN2);

// ===== 平滑石 =====
        registerFamily("dafang_smoothstone", FabricBlockSettings.copy(Blocks.SMOOTH_STONE), new DafangTags[]{DafangTags.ROCK, DafangTags.x1}, DafangTextureType.PATTERN2, true);
        registerFamily("dafang_smoothstone_brick1", FabricBlockSettings.copy(Blocks.SMOOTH_STONE), new DafangTags[]{DafangTags.ROCK, DafangTags.CROSS, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("dafang_smoothstone_brick2", FabricBlockSettings.copy(Blocks.SMOOTH_STONE), new DafangTags[]{DafangTags.ROCK, DafangTags.HORIZONTAL, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("dafang_smoothstone_brick3", FabricBlockSettings.copy(Blocks.SMOOTH_STONE), new DafangTags[]{DafangTags.ROCK, DafangTags.HORIZONTAL, DafangTags.x1_5}, DafangTextureType.PATTERN1_5);
        registerFamily("dafang_smoothstone_brick4", FabricBlockSettings.copy(Blocks.SMOOTH_STONE), new DafangTags[]{DafangTags.ROCK, DafangTags.VERTICAL, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("dafang_smoothstone_brick5", FabricBlockSettings.copy(Blocks.SMOOTH_STONE), new DafangTags[]{DafangTags.ROCK, DafangTags.VERTICAL, DafangTags.x1_5}, DafangTextureType.PATTERN1_5);

        // ===== 现代 =====
        registerFamily("dafang_modern_1", FabricBlockSettings.copy(Blocks.SMOOTH_STONE), new DafangTags[]{DafangTags.ROCK, DafangTags.HORIZONTAL, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("dafang_modern_2", FabricBlockSettings.copy(Blocks.SMOOTH_STONE), new DafangTags[]{DafangTags.ROCK, DafangTags.HORIZONTAL, DafangTags.x1_5}, DafangTextureType.PATTERN1_5);
        registerFamily("dafang_modern_3", FabricBlockSettings.copy(Blocks.SMOOTH_STONE), new DafangTags[]{DafangTags.ROCK, DafangTags.VERTICAL, DafangTags.x2}, DafangTextureType.PATTERN2);
        registerFamily("dafang_modern_4", FabricBlockSettings.copy(Blocks.SMOOTH_STONE), new DafangTags[]{DafangTags.ROCK, DafangTags.VERTICAL, DafangTags.x1_5}, DafangTextureType.PATTERN1_5);

        //大理石
        registerFamily("marble",FabricBlockSettings.copy(Blocks.CALCITE),new DafangTags[]{DafangTags.ROCK,DafangTags.MARBLE,DafangTags.RAW,DafangTags.FLAT},DafangTextureType.RECTANGLE4_2);
        registerFamily("marble_golden",FabricBlockSettings.copy(Blocks.CALCITE),new DafangTags[]{DafangTags.ROCK,DafangTags.MARBLE,DafangTags.GOLD,DafangTags.FLAT},DafangTextureType.RECTANGLE4_2);
        registerFamily("marble_black",FabricBlockSettings.copy(Blocks.DEEPSLATE),new DafangTags[]{DafangTags.ROCK,DafangTags.MARBLE,DafangTags.FLAT},DafangTextureType.RECTANGLE4_2);
        registerFamily("marble_wood",FabricBlockSettings.copy(Blocks.CALCITE),new DafangTags[]{DafangTags.ROCK,DafangTags.MARBLE,DafangTags.FLAT,DafangTags.HORIZONTAL},DafangTextureType.RECTANGLE4_2);
        registerFamily("marble_wood_yellow",FabricBlockSettings.copy(Blocks.CALCITE),new DafangTags[]{DafangTags.ROCK,DafangTags.MARBLE,DafangTags.FLAT,DafangTags.HORIZONTAL},DafangTextureType.RECTANGLE4_2);

        //水泥
        registerFamily("cement",FabricBlockSettings.copy(Blocks.LIGHT_GRAY_CONCRETE),new DafangTags[]{DafangTags.ROCK, DafangTags.CEMENT,DafangTags.FLAT},DafangTextureType.PATTERN4);
        registerFamily("cement_plate",FabricBlockSettings.copy(Blocks.LIGHT_GRAY_CONCRETE),new DafangTags[]{DafangTags.CEMENT,DafangTags.SQUARE,DafangTags.x1},DafangTextureType.PATTERN4);
        registerFamily("cement_plate_2",FabricBlockSettings.copy(Blocks.LIGHT_GRAY_CONCRETE),new DafangTags[]{DafangTags.CEMENT,DafangTags.SQUARE,DafangTags.x2},DafangTextureType.PATTERN4);
        registerFamily("cement_plate_4",FabricBlockSettings.copy(Blocks.LIGHT_GRAY_CONCRETE),new DafangTags[]{DafangTags.CEMENT,DafangTags.SQUARE,DafangTags.x4},DafangTextureType.PATTERN8);

        //布料 羊毛 纺织
        registerFamily("carpet_1",FabricBlockSettings.copy(Blocks.GRAY_WOOL),new DafangTags[]{DafangTags.WOOL, DafangTags.FLAT, DafangTags.VERTICAL},DafangTextureType.PATTERN4);
        registerFamily("carpet_2",FabricBlockSettings.copy(Blocks.GRAY_WOOL),new DafangTags[]{DafangTags.WOOL, DafangTags.SQUARE, DafangTags.CROSS},DafangTextureType.PATTERN2);
        registerFamily("fabric_pale",FabricBlockSettings.copy(Blocks.GRAY_WOOL),new DafangTags[]{DafangTags.WOOL, DafangTags.FLAT},DafangTextureType.PATTERN2);

        System.out.println(getAllFamilies());
    }
    private static void registerFamily(String id,
                                       AbstractBlock.Settings settings,
                                       DafangTags[] tags,
                                       DafangTextureType type) {
        registerFamily(id, settings, tags, type,false);
    }

    private static void registerFamily(String id,
                                       AbstractBlock.Settings settings,
                                       DafangTags[] tags,
                                       DafangTextureType type,
                                       boolean hasInfo) {

        DafangBlockFamily family = new DafangBlockFamily(id);

        // ===== base =====
        Block base = new Block(settings);
        register(id, base, tags,  hasInfo);
        family.setBase(base);

        // ===== slab =====
        Block slab = new SlabBlock(AbstractBlock.Settings.copy(base));
        register(id + "_slab", slab, tags,false);
        family.setSlab(slab);

        // ===== stairs =====
        Block stairs = new StairsBlock(base.getDefaultState(),
            AbstractBlock.Settings.copy(base));
        register(id + "_stairs", stairs, tags,false);
        family.setStairs(stairs);

        // ===== wall =====
        Block wall = new WallBlock(AbstractBlock.Settings.copy(base));
        register(id + "_wall", wall, tags, false);
        family.setWall(wall);

        family.setTextureType(type);

        FAMILIES.put(id, family);
    }

    private static void register(String id,
                                 Block block,
                                 DafangTags[] tags,
                                 boolean hasInfo) {

        Identifier identifier = new Identifier(DafangConstruction.MOD_ID, id);

        Registry.register(Registries.BLOCK, identifier, block);

        BlockItem item = new DafangTooltipBlockItem(
            block,
            new Item.Settings(),
            tags,
            hasInfo,
            id
        );

        Registry.register(Registries.ITEM, identifier, item);
    }

}
