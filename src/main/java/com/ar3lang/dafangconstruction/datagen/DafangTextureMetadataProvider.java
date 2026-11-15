package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.block.DafangTextureType;
import com.ar3lang.dafangconstruction.block.DafangBlockFamily;
import com.ar3lang.dafangconstruction.block.DafangBlocks;
import com.ar3lang.dafangconstruction.DafangConstruction;
import com.supermartijn642.fusion.api.provider.FusionTextureMetadataProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class DafangTextureMetadataProvider extends FusionTextureMetadataProvider {
    public DafangTextureMetadataProvider(FabricDataOutput output) {
        super(DafangConstruction.MOD_ID, output);
    }

    // --- 核心修改在这里 ---
    private void addTextureMetadata(Identifier id, DafangTextureType type) {
        // 1. 调用工厂类，获取包装好的 Fusion 数据
        FusionTextureFactory.FusionTextureData fusionData = FusionTextureFactory.build(type);

        // 2. 解包并注册给 Provider
        super.addTextureMetadata(
            id,
            fusionData.type(),
            fusionData.data()
        );
    }

    private void addTextureMetadata(DafangBlockFamily family) {
        Block block = family.getBase();
        if (block == null) return;

        DafangTextureType type = family.getTextureType();
        if (type == null) return;

        String cata = null;
        if (family.getId().startsWith("granite") || family.getId().startsWith("cement") || family.getId().startsWith("marble") || family.getId().startsWith("dafang_modern") || family.getId().startsWith("dafang_smoothstone")) {
            cata = "stone";
        } else if (family.getId().startsWith("carpet") || family.getId().startsWith("fabric")) {
            cata = "cloth";
        }

        Identifier id = cata != null
            ? new Identifier(DafangConstruction.MOD_ID, "block/" + cata + "/" + Registries.BLOCK.getId(block).getPath())
            : new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(block).getPath());

        System.out.println("生成纹理元数据: " + id);
        // 调用上面的方法
        addTextureMetadata(id, type);
    }

    @Override
    protected void generate() {
        for (DafangBlockFamily family : DafangBlocks.getAllFamilies()) {
            DafangTextureType type = family.getTextureType();
            if (type == null) continue;
            addTextureMetadata(family);
        }
    }
}
