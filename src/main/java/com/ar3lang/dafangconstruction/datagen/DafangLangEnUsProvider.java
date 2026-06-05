package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.block.DafangBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class DafangLangEnUsProvider extends FabricLanguageProvider {
    public DafangLangEnUsProvider(FabricDataOutput dataOutput) {
        super(dataOutput,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder tb) {
        tb.add("dafang.itemgroup","Dafang Construction");


        registerFamily(tb, "granite_yellowrust", "Yellow Rust Granite");
        tb.add("dafang.tooltip.granite_yellowrust", " Yellow Rust Granite is a common bright yellow granite used in construction materials, known for its distinctive yellow veining and rust spots.\n In China, southern regions primarily feature Fujian Rust Stone, while northern regions are known for Wenshang Rust Stone in Shandong.\n It can be processed into polished slabs, flamed slabs, thin slabs, countertops, landscape stones, paving stones, curb stones, small cubes, wall stones, stone furniture, stone carvings, etc.");
        registerFamily(tb, "granite_yellowrust_brick1", "Yellow Rust Granite Large Brick (Staggered)");
        registerFamily(tb, "granite_yellowrust_brick2", "Yellow Rust Granite Large Brick (x2)");
        registerFamily(tb, "granite_yellowrust_brick3", "Yellow Rust Granite Large Brick (x1.5)");
        registerFamily(tb, "granite_yellowrust_brick4", "Yellow Rust Granite Large Brick (Vertical Grain x2)");
        registerFamily(tb, "granite_yellowrust_brick5", "Yellow Rust Granite Large Brick (Vertical Grain x1.5)");
        registerFamily(tb, "granite_yellowrust_polished", "Polished Yellow Rust Granite");
        registerFamily(tb, "granite_yellowrust_matte", "Matte Yellow Rust Granite Brick");
        registerFamily(tb, "granite_yellowrust_tiles", "Yellow Rust Granite Tiles");

// ===== 泛红花岗岩 =====
        registerFamily(tb, "granite_red", "Red-Speckled Granite");
        tb.add("dafang.tooltip.granite_red", "  'Red-Speckled Granite' is a fictional term. In this texture, the red-speckled granite features slight red spots, has a relatively rough texture, and appears mostly gray.\n  The red spots in granite are typically formed due to the presence of iron-bearing minerals (such as hematite, limonite) or the oxidation of potassium feldspar.");
        registerFamily(tb, "granite_red_brick1", "Red-Speckled Granite Large Brick (Staggered)");
        registerFamily(tb, "granite_red_brick2", "Red-Speckled Granite Large Brick (x2)");
        registerFamily(tb, "granite_red_brick3", "Red-Speckled Granite Large Brick (x1.5)");
        registerFamily(tb, "granite_red_brick4", "Red-Speckled Granite Large Brick (Vertical Grain x2)");
        registerFamily(tb, "granite_red_brick5", "Red-Speckled Granite Large Brick (Vertical Grain x1.5)");
        registerFamily(tb, "granite_red_polished", "Polished Red-Speckled Granite");
        registerFamily(tb, "granite_red_matte", "Matte Red-Speckled Granite Brick");
        registerFamily(tb, "granite_red_tiles", "Red-Speckled Granite Tiles");

// ===== 银河灰 =====
        registerFamily(tb, "granite_galaxygray", "Galaxy Gray Granite");
        tb.add("dafang.tooltip.granite_galaxygray", "  Galaxy Gray is a type of dark granite; a marble shares the same name.\n  Galaxy Gray has a relatively smooth texture and is commonly used for polished slab surfaces in public buildings.");
        registerFamily(tb, "granite_galaxygray_brick1", "Galaxy Gray Granite Large Brick (Staggered)");
        registerFamily(tb, "granite_galaxygray_brick2", "Galaxy Gray Granite Large Brick (x2)");
        registerFamily(tb, "granite_galaxygray_brick3", "Galaxy Gray Granite Large Brick (x1.5)");
        registerFamily(tb, "granite_galaxygray_brick4", "Galaxy Gray Granite Large Brick (Vertical Grain x2)");
        registerFamily(tb, "granite_galaxygray_brick5", "Galaxy Gray Granite Large Brick (Vertical Grain x1.5)");
        registerFamily(tb, "granite_galaxygray_polished", "Polished Galaxy Gray Granite");
        registerFamily(tb, "granite_galaxygray_matte", "Matte Galaxy Gray Granite Brick");
        registerFamily(tb, "granite_galaxygray_tiles", "Galaxy Gray Granite Tiles");

// ===== 灰花岗岩 =====
        registerFamily(tb, "granite_gray", "Gray Granite");
        tb.add("dafang.tooltip.granite_gray", "  'Gray Granite' is a fictional term. In this texture, the gray granite is relatively flat and appears light gray overall.\n  It mimics real-life 'Sesame White' type granite. The flamed variant has a rougher texture and can be used in modern architecture.");
        registerFamily(tb, "granite_gray_brick1", "Gray Granite Large Brick (Staggered)");
        registerFamily(tb, "granite_gray_brick2", "Gray Granite Large Brick (x2)");
        registerFamily(tb, "granite_gray_brick3", "Gray Granite Large Brick (x1.5)");
        registerFamily(tb, "granite_gray_brick4", "Gray Granite Large Brick (Vertical Grain x2)");
        registerFamily(tb, "granite_gray_brick5", "Gray Granite Large Brick (Vertical Grain x1.5)");
        registerFamily(tb, "granite_gray_polished", "Gray Granite");
        registerFamily(tb, "granite_gray_matte", "Gray Granite Brick");
        registerFamily(tb, "granite_gray_tiles", "Gray Granite Tiles");

// ===== 平滑石 =====
        registerFamily(tb, "dafang_smoothstone", "Smooth Stone (Refined)");
        tb.add("dafang.tooltip.dafang_smoothstone", "  Smooth stone is a refined version of conventional stone, which eliminates the rough grain of the surface through the melting process, presenting a silk-like fine texture. \nThe neutral gray hue makes it ideal for high-end floors, gallery walls, and structural columns. Unlike rough, it has a mature matte texture that gently diffuses light, providing a clean, professional atmosphere for industrial and home interior spaces.");
        registerFamily(tb, "dafang_smoothstone_brick1", "Smooth Stone Large Brick (Staggered)");
        registerFamily(tb, "dafang_smoothstone_brick2", "Smooth Stone Large Brick (x2)");
        registerFamily(tb, "dafang_smoothstone_brick3", "Smooth Stone Large Brick (x1.5)");
        registerFamily(tb, "dafang_smoothstone_brick4", "Smooth Stone Large Brick (Vertical Grain x2)");
        registerFamily(tb, "dafang_smoothstone_brick5", "Smooth Stone Large Brick (Vertical Grain x1.5)");

// ===== 现代 =====
        registerFamily(tb, "dafang_modern_1", "Modern Architectural Panel (x2)");
        tb.add("dafang.tooltip.dafang_modern_1", " Dafang Modern Architecture series blocks are a series of blocks based on gray granite material prefabricated. \n It has a slightly cyan dominant color and cyan caulking");
        registerFamily(tb, "dafang_modern_2", "Modern Architectural Panel (x1.5)");
        registerFamily(tb, "dafang_modern_3", "Modern Architectural Panel (Vertical x2)");
        registerFamily(tb, "dafang_modern_4", "Modern Architectural Panel (Vertical x1.5)");

        //Tooltip
        tb.add("dafang.tooltip.titles.tags","Tags");
        tb.add("dafang.tooltip.titles.info","Description");

        tb.add("dafang.tag.rock","Stone");
        tb.add("dafang.tag.wool","Wool");
        tb.add("dafang.tag.wood","Wood");
        tb.add("dafang.tag.metal","Metal");
        tb.add("dafang.tag.cement","Cement");        tb.add("dafang.tag.marble","Marble");
        tb.add("dafang.tag.raw","Raw Block");
        tb.add("dafang.tag.matte","Matte Finish");
        tb.add("dafang.tag.fire","Flamed Finish");
        tb.add("dafang.tag.polished","Polished");
        tb.add("dafang.tag.vertical","Vertical Grain");
        tb.add("dafang.tag.horizontal","Horizontal Grain");
        tb.add("dafang.tag.random","Random Grain");
        tb.add("dafang.tag.x1","Normal Scale");
        tb.add("dafang.tag.x1_5","1.5x Scale");
        tb.add("dafang.tag.x2","2x Scale");
        tb.add("dafang.tag.cross","Brick Pattern");

    }
    private void registerFamily(TranslationBuilder tb, String familyKey, String baseName) {
        var f = DafangBlocks.getFamily(familyKey);

        // 基础方块
        if (f.getBase() != null) tb.add(f.getBase(), baseName);

        // 基础衍生
        if (f.getSlab() != null) tb.add(f.getSlab(), baseName + " Slab");
        if (f.getStairs() != null) tb.add(f.getStairs(), baseName + " Stairs");
        if (f.getWall() != null) tb.add(f.getWall(), baseName + " Wall");

    }
}
