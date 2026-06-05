package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.block.DafangBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class DafangLangZhTwProvider extends FabricLanguageProvider {
    public DafangLangZhTwProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_tw"); // 關鍵：zh_tw
    }

    @Override
    public void generateTranslations(TranslationBuilder tb) {
        tb.add("dafang.itemgroup", "大方建材");

        // ===== 黃鏽花崗岩 =====
        registerFamily(tb, "granite_yellowrust", "黃鏽花崗岩");
        registerFamily(tb, "granite_yellowrust_brick1", "黃鏽花崗岩大型磚（交錯）");
        registerFamily(tb, "granite_yellowrust_brick2", "黃鏽花崗岩大型磚（x2）");
        registerFamily(tb, "granite_yellowrust_brick3", "黃鏽花崗岩大型磚（x1.5）");
        registerFamily(tb, "granite_yellowrust_brick4", "黃鏽花崗岩大型磚（直紋x2）");
        registerFamily(tb, "granite_yellowrust_brick5", "黃鏽花崗岩大型磚（直紋x1.5）");
        registerFamily(tb, "granite_yellowrust_polished", "磨製黃鏽花崗岩");
        registerFamily(tb, "granite_yellowrust_matte", "霧面黃鏽花崗岩磚");
        registerFamily(tb, "granite_yellowrust_tiles", "黃鏽花崗岩磚");
        registerFamily(tb, "granite_yellowrust_mushroom", "黃鏽花崗岩蘑菇石磚");

        // ===== 泛紅花崗岩 =====
        registerFamily(tb, "granite_red", "泛紅花崗岩");
        registerFamily(tb, "granite_red_brick1", "泛紅花崗岩大型磚（交錯）");
        registerFamily(tb, "granite_red_brick2", "泛紅花崗岩大型磚（x2）");
        registerFamily(tb, "granite_red_brick3", "泛紅花崗岩大型磚（x1.5）");
        registerFamily(tb, "granite_red_brick4", "泛紅花崗岩大型磚（直紋x2）");
        registerFamily(tb, "granite_red_brick5", "泛紅花崗岩大型磚（直紋x1.5）");
        registerFamily(tb, "granite_red_polished", "磨製泛紅花崗岩");
        registerFamily(tb, "granite_red_matte", "霧面泛紅花崗岩磚");
        registerFamily(tb, "granite_red_tiles", "泛紅花崗岩磚");
        registerFamily(tb, "granite_red_mushroom", "泛紅花崗岩蘑菇石磚");

        // ===== 銀河灰 =====
        registerFamily(tb, "granite_galaxygray", "銀河灰花崗岩");
        registerFamily(tb, "granite_galaxygray_brick1", "銀河灰花崗岩大型磚（交錯）");
        registerFamily(tb, "granite_galaxygray_brick2", "銀河灰花崗岩大型磚（x2）");
        registerFamily(tb, "granite_galaxygray_brick3", "銀河灰花崗岩大型磚（x1.5）");
        registerFamily(tb, "granite_galaxygray_brick4", "銀河灰花崗岩大型磚（直紋x2）");
        registerFamily(tb, "granite_galaxygray_brick5", "銀河灰花崗岩大型磚（直紋x1.5）");
        registerFamily(tb, "granite_galaxygray_polished", "磨製銀河灰花崗岩");
        registerFamily(tb, "granite_galaxygray_matte", "霧面銀河灰花崗岩磚");
        registerFamily(tb, "granite_galaxygray_tiles", "銀河灰花崗岩磚");

        // ===== 灰花崗岩 =====
        registerFamily(tb, "granite_gray", "灰花崗岩");
        registerFamily(tb, "granite_gray_brick1", "灰花崗岩大型磚（交錯）");
        registerFamily(tb, "granite_gray_brick2", "灰花崗岩大型磚（x2）");
        registerFamily(tb, "granite_gray_brick3", "灰花崗岩大型磚（x1.5）");
        registerFamily(tb, "granite_gray_brick4", "灰花崗岩大型磚（直紋x2）");
        registerFamily(tb, "granite_gray_brick5", "灰花崗岩大型磚（直紋x1.5）");
        registerFamily(tb, "granite_gray_polished", "灰花崗岩");
        registerFamily(tb, "granite_gray_matte", "灰花崗岩磚");
        registerFamily(tb, "granite_gray_tiles", "灰花崗岩磚");
        registerFamily(tb, "granite_gray_mushroom", "灰花崗岩蘑菇石磚");

        // ===== 平滑石 =====
        registerFamily(tb, "dafang_smoothstone", "平滑石（精製）");
        registerFamily(tb, "dafang_smoothstone_brick1", "平滑石大磚（交錯）");
        registerFamily(tb, "dafang_smoothstone_brick2", "平滑石大磚（x2）");
        registerFamily(tb, "dafang_smoothstone_brick3", "平滑石大磚（x1.5）");
        registerFamily(tb, "dafang_smoothstone_brick4", "平滑石大磚（直紋x2）");
        registerFamily(tb, "dafang_smoothstone_brick5", "平滑石大磚（直紋x1.5）");

        // ===== 現代 =====
        registerFamily(tb, "dafang_modern_1", "現代建築掛板（x2）");
        registerFamily(tb, "dafang_modern_2", "現代建築掛板（x1.5）");
        registerFamily(tb, "dafang_modern_3", "現代建築掛板（直紋x2）");
        registerFamily(tb, "dafang_modern_4", "現代建築掛板（直紋x1.5）");

        // ===== 說明提示 =====
        tb.add("dafang.tooltip.granite_yellowrust", "  黃鏽花崗岩是一種常見用於建材的亮黃色花崗岩，以其獨特的黃色紋理與鏽斑聞名。\\n  在中國，南方以福建鏽石為主，北方山東汶上鏽石較為有名。\\n  可製作磨光板、火燒板、薄板、台面板、環境石、地鋪石、路緣石、小方塊、牆壁石、石製家具、石雕等。");
        tb.add("dafang.tooltip.granite_red", "  泛紅花崗岩是虛構稱法，本作中的泛紅花崗岩帶些許紅斑，質感較粗糙，整體呈灰色。\\n  花崗岩中的紅斑通常來自岩石內含鐵質礦物（如赤鐵礦、褐鐵礦）或鉀長石氧化作用形成。");
        tb.add("dafang.tooltip.granite_galaxygray", "  銀河灰是一種深色花崗岩，亦有同名大理石。\\n  銀河灰質感較光滑，常用於公共建築的光滑面石板。");
        tb.add("dafang.tooltip.granite_gray", "  灰花崗岩是虛構稱法，本作中的灰花崗岩較扁平，整體呈淺灰色。\\n  模仿現實中的芝麻白型花崗岩，火燒面變種質感較粗糙，適用於現代建築。");
        tb.add("dafang.tooltip.dafang_smoothstone", " 平滑石是常規石材的精煉版本，透過熔煉工藝消除表面粗糙顆粒感，呈現絲綢般細緻質感。\\n  其中性灰色調使其成為高階地面、畫廊牆面與結構柱的理想選擇。");
        tb.add("dafang.tooltip.dafang_modern_1", " 大方現代建築系列方塊是以灰花崗岩材質預製的一系列方塊。\\n  帶有微微青色的主色調與青色填縫。");

        // 大理石系列
        registerFamily(tb, "marble", "大理石");
        registerFamily(tb, "marble_black", "暗色大理石");
        registerFamily(tb, "marble_golden", "鑲金大理石");
        registerFamily(tb, "marble_wood", "木紋石");
        registerFamily(tb, "marble_wood_yellow", "褐黃木紋石");

        // 水泥
        registerFamily(tb, "cement", "水泥");
        registerFamily(tb, "cement_plate", "水泥板");
        registerFamily(tb, "cement_plate_2", "水泥板 (x2)");
        registerFamily(tb, "cement_plate_4", "水泥板 (x4)");

        // 羊毛
        registerFamily(tb, "carpet_1", "地毯方塊 (瓦楞海綿)");
        registerFamily(tb, "carpet_2", "地毯方塊 (交錯方塊)");
        registerFamily(tb, "fabric_pale", "素樸布艺方塊");

        // --- 工具提示與標籤 ---
        tb.add("dafang.tooltip.titles.tags", "標籤");
        tb.add("dafang.tooltip.titles.info", "簡介");

        tb.add("dafang.tag.rock", "石材");
        tb.add("dafang.tag.wool", "羊毛");
        tb.add("dafang.tag.wood", "木材");
        tb.add("dafang.tag.metal", "金屬");
        tb.add("dafang.tag.cement", "水泥");
        tb.add("dafang.tag.marble", "大理石");
        tb.add("dafang.tag.raw", "母岩");
        tb.add("dafang.tag.matte", "霧面");
        tb.add("dafang.tag.fire", "火燒面");
        tb.add("dafang.tag.polished", "磨製/拋光");
        tb.add("dafang.tag.vertical", "垂直紋理");
        tb.add("dafang.tag.horizontal", "水平紋理");
        tb.add("dafang.tag.random", "隨機紋理");
        tb.add("dafang.tag.x1", "正常比例");
        tb.add("dafang.tag.x1_5", "1.5x比例");
        tb.add("dafang.tag.x2", "2x比例");
        tb.add("dafang.tag.x4", "4x比例");
        tb.add("dafang.tag.cross", "磚紋");
        tb.add("dafang.tag.artistic", "文藝");
        tb.add("dafang.tag.square", "方塊");
        tb.add("dafang.tag.gold", "黃金");
        tb.add("dafang.tag.flat", "平鋪");
    }

    private void registerFamily(TranslationBuilder tb, String familyKey, String baseName) {
        var f = DafangBlocks.getFamily(familyKey);

        if (f.getBase() != null) tb.add(f.getBase(), baseName);
        if (f.getSlab() != null) tb.add(f.getSlab(), baseName + "台階");
        if (f.getStairs() != null) tb.add(f.getStairs(), baseName + "樓梯");
        if (f.getWall() != null) tb.add(f.getWall(), baseName + "牆壁");
    }
}
