package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.DafangBlocks;
import com.ar3lang.dafangconstruction.DafangTooltipBlockItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class DafangLangEnUsProvider extends FabricLanguageProvider {
    public DafangLangEnUsProvider(FabricDataOutput dataOutput) {
        super(dataOutput,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST,"黄锈花岗岩");
        translationBuilder.add("dafang.tooltip.granite_yellowrust","  黄锈花岗岩是一种常见的用于建材的亮黄色花岗岩，以其独特的黄色纹理和锈斑而闻名。\\n  在中国，南方以福建锈石为主，北方山东汶上锈石比较有名。\\n  可进行磨光板、火烧板、薄板、台面板、环境石、地铺石、路延石、小方块、墙壁石、石制家具、石雕等制作。");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_BRICK_1,"黄锈花岗岩大型砖");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_BRICK_2,"黄锈花岗岩大型砖砖");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_BRICK_3,"黄锈花岗岩大型砖砖");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_BRICK_4,"黄锈花岗岩大型砖砖");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_BRICK_5,"黄锈花岗岩大型砖砖");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_POLISHED,"磨制黄锈花岗岩");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_MATTE,"哑光黄锈花岗岩砖");
        translationBuilder.add(DafangBlocks.GRANITE_YELLOWRUST_TILES,"黄锈花岗岩砖");

        //Tooltip
        translationBuilder.add("dafang.tooltip.titles.tags","标签");
        translationBuilder.add("dafang.tooltip.titles.info","简介");
        translationBuilder.add("dafang.tag.rock","岩石");
        translationBuilder.add("dafang.tag.wool","羊毛");
        translationBuilder.add("dafang.tag.wood","木材");
        translationBuilder.add("dafang.tag.metal","金属");
        translationBuilder.add("dafang.tag.vertical","垂直纹理");
        translationBuilder.add("dafang.tag.horizontal","水平纹理");
        translationBuilder.add("dafang.tag.random","随机纹理");
        translationBuilder.add("dafang.tag.x1","正常比例");
        translationBuilder.add("dafang.tag.x1_5","1.5x比例");
        translationBuilder.add("dafang.tag.x2","2x比例");
        translationBuilder.add("dafang.tag.cross","砖纹");

    }
}
