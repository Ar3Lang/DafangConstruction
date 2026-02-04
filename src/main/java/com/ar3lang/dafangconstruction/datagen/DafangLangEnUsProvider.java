package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.DafangBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class DafangLangEnUsProvider extends FabricLanguageProvider {
    public DafangLangEnUsProvider(FabricDataOutput dataOutput) {
        super(dataOutput,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST,"Yellow Rust Granite");
        translationBuilder.add("dafang.tooltip.granite_yellowrust"," Yellow Rust Granite is a common bright yellow granite used in construction materials, known for its distinctive yellow veining and rust spots.\\n In China, southern regions primarily feature Fujian Rust Stone, while northern regions are known for Wenshang Rust Stone in Shandong.\\n It can be processed into polished slabs, flamed slabs, thin slabs, countertops, landscape stones, paving stones, curb stones, small cubes, wall stones, stone furniture, stone carvings, etc.");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_BRICK_1,"Yellow Rust Granite Large Brick (Staggered)");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_BRICK_2,"Yellow Rust Granite Large Brick (x2)");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_BRICK_3,"Yellow Rust Granite Large Brick (x1.5)");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_BRICK_4,"Yellow Rust Granite Large Brick (Vertical Grain x2)");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_BRICK_5,"Yellow Rust Granite Large Brick (Vertical Grain x1.5)");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_POLISHED,"Polished Yellow Rust Granite");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_MATTE,"Matte Yellow Rust Granite Brick");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_TILES,"Yellow Rust Granite Tiles");

        translationBuilder.add(DafangBlocks.GRANITE_RED,"Red-Speckled Granite");
        translationBuilder.add("dafang.tooltip.granite_red","  'Red-Speckled Granite' is a fictional term. In this texture, the red-speckled granite features slight red spots, has a relatively rough texture, and appears mostly gray.\\n  The red spots in granite are typically formed due to the presence of iron-bearing minerals (such as hematite, limonite) or the oxidation of potassium feldspar.");
        translationBuilder.add(DafangBlocks.GRANITE_RED_BRICK_1,"Red-Speckled Granite Large Brick (Staggered)");
        translationBuilder.add(DafangBlocks.GRANITE_RED_BRICK_2,"Red-Speckled Granite Large Brick (x2)");
        translationBuilder.add(DafangBlocks.GRANITE_RED_BRICK_3,"Red-Speckled Granite Large Brick (x1.5)");
        translationBuilder.add(DafangBlocks.GRANITE_RED_BRICK_4,"Red-Speckled Granite Large Brick (Vertical Grain x2)");
        translationBuilder.add(DafangBlocks.GRANITE_RED_BRICK_5,"Red-Speckled Granite Large Brick (Vertical Grain x1.5)");
        translationBuilder.add(DafangBlocks.GRANITE_RED_POLISHED,"Polished Red-Speckled Granite");
        translationBuilder.add(DafangBlocks.GRANITE_RED_MATTE,"Matte Red-Speckled Granite Brick");
        translationBuilder.add(DafangBlocks.GRANITE_RED_TILES,"Red-Speckled Granite Tiles");

        translationBuilder.add(DafangBlocks.GRANITE_GALAXYGRAY,"Galaxy Gray Granite");
        translationBuilder.add("dafang.tooltip.granite_galaxygray","  Galaxy Gray is a type of dark granite; a marble shares the same name.\\n  Galaxy Gray has a relatively smooth texture and is commonly used for polished slab surfaces in public buildings.");
        translationBuilder.add(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_1,"Galaxy Gray Granite Large Brick (Staggered)");
        translationBuilder.add(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_2,"Galaxy Gray Granite Large Brick (x2)");
        translationBuilder.add(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_3,"Galaxy Gray Granite Large Brick (x1.5)");
        translationBuilder.add(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_4,"Galaxy Gray Granite Large Brick (Vertical Grain x2)");
        translationBuilder.add(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_5,"Galaxy Gray Granite Large Brick (Vertical Grain x1.5)");
        translationBuilder.add(DafangBlocks.GRANITE_GALAXYGRAY_POLISHED,"Polished Galaxy Gray Granite");
        translationBuilder.add(DafangBlocks.GRANITE_GALAXYGRAY_MATTE,"Matte Galaxy Gray Granite Brick");
        translationBuilder.add(DafangBlocks.GRANITE_GALAXYGRAY_TILES,"Galaxy Gray Granite Tiles");

        translationBuilder.add(DafangBlocks.GRANITE_GRAY,"Gray Granite");
        translationBuilder.add("dafang.tooltip.granite_gray","  'Gray Granite' is a fictional term. In this texture, the gray granite is relatively flat and appears light gray overall.\\n  It mimics real-life 'Sesame White' type granite. The flamed variant has a rougher texture and can be used in modern architecture.");
        translationBuilder.add(DafangBlocks.GRANITE_GRAY_BRICK_1,"Gray Granite Large Brick (Staggered)");
        translationBuilder.add(DafangBlocks.GRANITE_GRAY_BRICK_2,"Gray Granite Large Brick (x2)");
        translationBuilder.add(DafangBlocks.GRANITE_GRAY_BRICK_3,"Gray Granite Large Brick (x1.5)");
        translationBuilder.add(DafangBlocks.GRANITE_GRAY_BRICK_4,"Gray Granite Large Brick (Vertical Grain x2)");
        translationBuilder.add(DafangBlocks.GRANITE_GRAY_BRICK_5,"Gray Granite Large Brick (Vertical Grain x1.5)");
        translationBuilder.add(DafangBlocks.GRANITE_GRAY_POLISHED,"Gray Granite");
        translationBuilder.add(DafangBlocks.GRANITE_GRAY_MATTE,"Gray Granite Brick");
        translationBuilder.add(DafangBlocks.GRANITE_GRAY_TILES,"Gray Granite Tiles");

        //Tooltip
        translationBuilder.add("dafang.tooltip.titles.tags","Tags");
        translationBuilder.add("dafang.tooltip.titles.info","Description");

        translationBuilder.add("dafang.tag.rock","Stone");
        translationBuilder.add("dafang.tag.wool","Wool");
        translationBuilder.add("dafang.tag.wood","Wood");
        translationBuilder.add("dafang.tag.metal","Metal");
        translationBuilder.add("dafang.tag.raw","Raw Block");
        translationBuilder.add("dafang.tag.matte","Matte Finish");
        translationBuilder.add("dafang.tag.fire","Flamed Finish");
        translationBuilder.add("dafang.tag.polished","Polished");
        translationBuilder.add("dafang.tag.vertical","Vertical Grain");
        translationBuilder.add("dafang.tag.horizontal","Horizontal Grain");
        translationBuilder.add("dafang.tag.random","Random Grain");
        translationBuilder.add("dafang.tag.x1","Normal Scale");
        translationBuilder.add("dafang.tag.x1_5","1.5x Scale");
        translationBuilder.add("dafang.tag.x2","2x Scale");
        translationBuilder.add("dafang.tag.cross","Brick Pattern");
    }
}
