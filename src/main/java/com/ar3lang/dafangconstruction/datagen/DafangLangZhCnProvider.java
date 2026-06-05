package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.block.DafangBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class DafangLangZhCnProvider extends FabricLanguageProvider {
    public DafangLangZhCnProvider(FabricDataOutput dataOutput) {
        super(dataOutput,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder tb) {
        tb.add("dafang.itemgroup","大方建材");
        // ===== 黄锈石 =====
        registerFamily(tb, "granite_yellowrust", "黄锈花岗岩");
        registerFamily(tb, "granite_yellowrust_brick1", "黄锈花岗岩大型砖（交错）");
        registerFamily(tb, "granite_yellowrust_brick2", "黄锈花岗岩大型砖（x2）");
        registerFamily(tb, "granite_yellowrust_brick3", "黄锈花岗岩大型砖（x1.5）");
        registerFamily(tb, "granite_yellowrust_brick4", "黄锈花岗岩大型砖（竖纹x2）");
        registerFamily(tb, "granite_yellowrust_brick5", "黄锈花岗岩大型砖（竖纹x1.5）");
        registerFamily(tb, "granite_yellowrust_polished", "磨制黄锈花岗岩");
        registerFamily(tb, "granite_yellowrust_matte", "哑光黄锈花岗岩砖");
        registerFamily(tb, "granite_yellowrust_tiles", "黄锈花岗岩砖");
        registerFamily(tb, "granite_yellowrust_mushroom", "黄锈花岗岩蘑菇石砖");

// ===== 泛红花岗岩 =====
        registerFamily(tb, "granite_red", "泛红花岗岩");
        registerFamily(tb, "granite_red_brick1", "泛红花岗岩大型砖（交错）");
        registerFamily(tb, "granite_red_brick2", "泛红花岗岩大型砖（x2）");
        registerFamily(tb, "granite_red_brick3", "泛红花岗岩大型砖（x1.5）");
        registerFamily(tb, "granite_red_brick4", "泛红花岗岩大型砖（竖纹x2）");
        registerFamily(tb, "granite_red_brick5", "泛红花岗岩大型砖（竖纹x1.5）");
        registerFamily(tb, "granite_red_polished", "磨制泛红花岗岩");
        registerFamily(tb, "granite_red_matte", "哑光泛红花岗岩砖");
        registerFamily(tb, "granite_red_tiles", "泛红花岗岩砖");
        registerFamily(tb, "granite_red_mushroom", "泛红花岗岩蘑菇石砖");

// ===== 银河灰 =====
        registerFamily(tb, "granite_galaxygray", "银河灰花岗岩");
        registerFamily(tb, "granite_galaxygray_brick1", "银河灰花岗岩大型砖（交错）");
        registerFamily(tb, "granite_galaxygray_brick2", "银河灰花岗岩大型砖（x2）");
        registerFamily(tb, "granite_galaxygray_brick3", "银河灰花岗岩大型砖（x1.5）");
        registerFamily(tb, "granite_galaxygray_brick4", "银河灰花岗岩大型砖（竖纹x2）");
        registerFamily(tb, "granite_galaxygray_brick5", "银河灰花岗岩大型砖（竖纹x1.5）");
        registerFamily(tb, "granite_galaxygray_polished", "磨制银河灰花岗岩");
        registerFamily(tb, "granite_galaxygray_matte", "哑光银河灰花岗岩砖");
        registerFamily(tb, "granite_galaxygray_tiles", "银河灰花岗岩砖");

// ===== 灰花岗岩 =====
        registerFamily(tb, "granite_gray", "灰花岗岩");
        registerFamily(tb, "granite_gray_brick1", "灰花岗岩大型砖（交错）");
        registerFamily(tb, "granite_gray_brick2", "灰花岗岩大型砖（x2）");
        registerFamily(tb, "granite_gray_brick3", "灰花岗岩大型砖（x1.5）");
        registerFamily(tb, "granite_gray_brick4", "灰花岗岩大型砖（竖纹x2）");
        registerFamily(tb, "granite_gray_brick5", "灰花岗岩大型砖（竖纹x1.5）");
        registerFamily(tb, "granite_gray_polished", "灰花岗岩");
        registerFamily(tb, "granite_gray_matte", "灰花岗岩砖");
        registerFamily(tb, "granite_gray_tiles", "灰花岗岩砖");
        registerFamily(tb, "granite_gray_mushroom", "灰花岗岩蘑菇石砖");

// ===== 平滑石 =====
        registerFamily(tb, "dafang_smoothstone", "平滑石（精制）");
        registerFamily(tb, "dafang_smoothstone_brick1", "平滑石大砖（交错）");
        registerFamily(tb, "dafang_smoothstone_brick2", "平滑石大砖（x2）");
        registerFamily(tb, "dafang_smoothstone_brick3", "平滑石大砖（x1.5）");
        registerFamily(tb, "dafang_smoothstone_brick4", "平滑石大砖（竖纹x2）");
        registerFamily(tb, "dafang_smoothstone_brick5", "平滑石大砖（竖纹x1.5）");

// ===== 现代 =====
        registerFamily(tb, "dafang_modern_1", "现代建筑挂板（x2）");
        registerFamily(tb, "dafang_modern_2", "现代建筑挂板（x1.5）");
        registerFamily(tb, "dafang_modern_3", "现代建筑挂板（竖纹x2）");
        registerFamily(tb, "dafang_modern_4", "现代建筑挂板（竖纹x1.5）");

        tb.add("dafang.tooltip.granite_yellowrust", "  黄锈花岗岩是一种常见的用于建材的亮黄色花岗岩，以其独特的黄色纹理和锈斑而闻名。\\n  在中国，南方以福建锈石为主，北方山东汶上锈石比较有名。\\n  可进行磨光板、火烧板、薄板、台面板、环境石、地铺石、路延石、小方块、墙壁石、石制家具、石雕等制作。");
        tb.add("dafang.tooltip.granite_red", "  泛红花岗岩是虚构的称法，本材质中的泛红花岗岩带有些许红斑，质感较粗糙，整体呈灰色。\\n  花岗岩中的红斑通常是由于岩石中含有铁质矿物（如赤铁矿、褐铁矿）或钾长石的氧化作用而形成的。");

        tb.add("dafang.tooltip.granite_galaxygray", "  银河灰是一种的深色花岗岩，一种大理石与此同名。\\n  银河灰质感较光滑，常用于公共建筑的光滑面石板。");

        tb.add("dafang.tooltip.granite_gray", "  灰花岗岩是虚构的称法，本材质中的灰花岗岩较扁平，整体呈浅灰色。\\n  模仿现实中的芝麻白型花岗岩，火烧面变种质感较粗糙，可用于现代建筑。");

        tb.add("dafang.tooltip.dafang_smoothstone", " 平滑石是常规石材的精炼版本，通过熔炼工艺消除了表面粗糙的颗粒感，呈现出丝绸般的细腻质感。\\n 其中性的灰色调使其成为高端地面、画廊墙面和结构柱的理想选择。");
        tb.add("dafang.tooltip.dafang_modern_1", " 大方现代建筑系列方块是基于灰花岗岩材质预制的一系列方块。\\n 拥有微微青色的主色调，和青色的填缝");

        //大理石系列
        registerFamily(tb,"marble","大理石");
        registerFamily(tb,"marble_black","暗色大理石");
        registerFamily(tb,"marble_golden","镶金大理石");
        registerFamily(tb,"marble_wood","木纹石");
        registerFamily(tb,"marble_wood_yellow","褐黄木纹石");

        //水泥
        registerFamily(tb,"cement","水泥");
        registerFamily(tb,"cement_plate","水泥板");
        registerFamily(tb,"cement_plate_2","水泥板 (x2)");
        registerFamily(tb,"cement_plate_4","水泥板 (x4)");

        //羊毛
        registerFamily(tb,"carpet_1","地毯方块 (瓦楞海绵)");
        registerFamily(tb,"carpet_2","地毯方块 (交错方块)");
        registerFamily(tb,"fabric_pale","素朴布艺方块");

        // --- 工具提示与标签 ---
        tb.add("dafang.tooltip.titles.tags", "标签");
        tb.add("dafang.tooltip.titles.info", "简介");

        tb.add("dafang.tag.rock", "石材");
        tb.add("dafang.tag.wool", "羊毛");
        tb.add("dafang.tag.wood", "木材");
        tb.add("dafang.tag.metal", "金属");
        tb.add("dafang.tag.cement","水泥");
        tb.add("dafang.tag.marble","大理石");
        tb.add("dafang.tag.raw", "母岩");
        tb.add("dafang.tag.matte", "哑光面");
        tb.add("dafang.tag.fire", "火烧面");
        tb.add("dafang.tag.polished", "磨制/抛光");
        tb.add("dafang.tag.vertical", "垂直纹理");
        tb.add("dafang.tag.horizontal", "水平纹理");
        tb.add("dafang.tag.random", "随机纹理");
        tb.add("dafang.tag.x1", "正常比例");
        tb.add("dafang.tag.x1_5", "1.5x比例");
        tb.add("dafang.tag.x2", "2x比例");
        tb.add("dafang.tag.x4", "4x比例");
        tb.add("dafang.tag.cross", "砖纹");
        tb.add("dafang.tag.artistic","文艺");
        tb.add("dafang.tag.square","方块");
        tb.add("dafang.tag.gold","黄金");
        tb.add("dafang.tag.flat","平铺");

    }
    private void registerFamily(TranslationBuilder tb, String familyKey, String baseName) {
        var f = DafangBlocks.getFamily(familyKey);

        // 基础方块
        if (f.getBase() != null) tb.add(f.getBase(), baseName);

        // 基础衍生
        if (f.getSlab() != null) tb.add(f.getSlab(), baseName + "台阶");
        if (f.getStairs() != null) tb.add(f.getStairs(), baseName + "楼梯");
        if (f.getWall() != null) tb.add(f.getWall(), baseName + "墙壁");

    }
}
