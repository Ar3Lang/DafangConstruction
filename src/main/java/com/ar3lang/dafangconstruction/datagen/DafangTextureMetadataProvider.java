package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.DafangTextureType;
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

    private void addTextureMetadata(Block block, DafangTextureType type) {
        Identifier id = new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(block).getPath());
        System.out.println(id);
        super.addTextureMetadata(
            id,
            type.getType(),
            type.getData()
        );
    }

    private void addTextureMetadata(DafangBlockFamily family) {
        Identifier id;
        String cata = null;
        Block block = family.getBase();

        DafangTextureType type = family.getTextureType();

        if (family.getId().startsWith("granite") || family.getId().startsWith("cement") || family.getId().startsWith("marble") || family.getId().startsWith("dafang_modern") || family.getId().startsWith("dafang_smoothstone")) {
            cata = "stone";
        } else if (family.getId().startsWith("carpet") || family.getId().startsWith("fabric")) {
            cata = "cloth";
        }

        if (cata != null){
            id = new Identifier(DafangConstruction.MOD_ID, "block/" +cata +"/"+ Registries.BLOCK.getId(block).getPath());
        }else{
            id = new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(block).getPath());
        }

        System.out.println(id);
        super.addTextureMetadata(
            id,
            type.getType(),
            type.getData()
        );
//        addTextureMetadata(family.getBase(), family.getTextureType());
    }

    @Override
    protected void generate() {
        for (DafangBlockFamily family : DafangBlocks.getAllFamilies()) {
            System.out.println("当前运行texturemetagen："+family.getBase());
            DafangTextureType type = family.getTextureType();
            if (type == null) continue;
            addTextureMetadata(family);
//            addTextureMetadata(family.getSlab(), type);
//            addTextureMetadata(family.getStairs(), type);
//            addTextureMetadata(family.getWall(), type);
        }
    }
}
