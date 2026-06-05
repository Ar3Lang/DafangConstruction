package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.DafangConstruction;
import com.ar3lang.dafangconstruction.block.DafangBlockFamily;
import com.ar3lang.dafangconstruction.block.DafangBlocks;
import com.supermartijn642.fusion.api.model.DefaultModelTypes;
import com.supermartijn642.fusion.api.model.ModelInstance;
import com.supermartijn642.fusion.api.model.data.BaseModelDataBuilder;
import com.supermartijn642.fusion.api.provider.FusionModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class DafangFusionModelProvider extends FusionModelProvider {
    public DafangFusionModelProvider(FabricDataOutput output) {
        super(DafangConstruction.MOD_ID, output);
    }

    @Override
    protected void generate() {

        for (DafangBlockFamily family : DafangBlocks.getAllFamilies()) {

            if (family.getId().startsWith("granite") || family.getId().startsWith("cement") || family.getId().startsWith("marble") || family.getId().startsWith("dafang_modern") || family.getId().startsWith("dafang_smoothstone")) {
                addBaseModel(family.getBase(), "stone");
                addSlabModels(family.getBase(), family.getSlab(), "stone");
                addStairModels(family.getBase(), family.getStairs(), "stone");
                addWallModels(family.getBase(), family.getWall(), "stone");
            } else if (family.getId().startsWith("carpet") || family.getId().startsWith("fabric")) {
                addBaseModel(family.getBase(), "cloth");
                addSlabModels(family.getBase(), family.getSlab(), "cloth");
                addStairModels(family.getBase(), family.getStairs(), "cloth");
                addWallModels(family.getBase(), family.getWall(), "cloth");
            } else if (family.getBase() != null) {
                addBaseModel(family.getBase());
                addSlabModels(family.getBase(), family.getSlab());
                addStairModels(family.getBase(), family.getStairs());
                addWallModels(family.getBase(), family.getWall());
            }
        }
    }

    // --- 以下保持你的私有工具方法逻辑不变，确保兼容性 ---

    private void addBaseModel(Block block) {
        Identifier id = new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(block).getPath());
        var baseData = BaseModelDataBuilder.builder()
            .parent(new Identifier("minecraft", "block/cube_all"))
            .texture("all", id)
            .build();
        super.addModel(id, ModelInstance.of(DefaultModelTypes.BASE, baseData));
    }
    private void addBaseModel(Block block, String cata) {
        Identifier txid = new Identifier(DafangConstruction.MOD_ID, "block/" + cata + "/" + Registries.BLOCK.getId(block).getPath());
        Identifier modelId = new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(block).getPath());
        var baseData = BaseModelDataBuilder.builder()
            .parent(new Identifier("minecraft", "block/cube_all"))
            .texture("all", txid)
            .build();
        super.addModel(modelId, ModelInstance.of(DefaultModelTypes.BASE, baseData));
    }

    private void addSlabModels(Block baseBlock, Block slabBlock) {
        Identifier baseTextureId = new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(baseBlock).getPath());
        Identifier slabPathId = new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(slabBlock).getPath());
        Identifier slabTopPathId = new Identifier(DafangConstruction.MOD_ID, slabPathId.getPath() + "_top");

        var bottomData = BaseModelDataBuilder.builder()
            .parent(new Identifier("minecraft", "block/slab"))
            .texture("bottom", baseTextureId).texture("top", baseTextureId).texture("side", baseTextureId)
            .build();
        super.addModel(slabPathId, ModelInstance.of(DefaultModelTypes.BASE, bottomData));

        var topData = BaseModelDataBuilder.builder()
            .parent(new Identifier("minecraft", "block/slab_top"))
            .texture("bottom", baseTextureId).texture("top", baseTextureId).texture("side", baseTextureId)
            .build();
        super.addModel(slabTopPathId, ModelInstance.of(DefaultModelTypes.BASE, topData));
    }
    private void addSlabModels(Block baseBlock, Block slabBlock,String cata) {
        Identifier baseTextureId = new Identifier(DafangConstruction.MOD_ID, "block/" + cata + "/" + Registries.BLOCK.getId(baseBlock).getPath());
        Identifier slabPathId = new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(slabBlock).getPath());
        Identifier slabTopPathId = new Identifier(DafangConstruction.MOD_ID, slabPathId.getPath() + "_top");

        var bottomData = BaseModelDataBuilder.builder()
            .parent(new Identifier("minecraft", "block/slab"))
            .texture("bottom", baseTextureId).texture("top", baseTextureId).texture("side", baseTextureId)
            .build();
        super.addModel(slabPathId, ModelInstance.of(DefaultModelTypes.BASE, bottomData));

        var topData = BaseModelDataBuilder.builder()
            .parent(new Identifier("minecraft", "block/slab_top"))
            .texture("bottom", baseTextureId).texture("top", baseTextureId).texture("side", baseTextureId)
            .build();
        super.addModel(slabTopPathId, ModelInstance.of(DefaultModelTypes.BASE, topData));
    }

    private void addStairModels(Block baseBlock, Block stairsBlock) {
        Identifier tex = new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(baseBlock).getPath());
        String path = "block/" + Registries.BLOCK.getId(stairsBlock).getPath();
        String[] variants = {"", "_inner", "_outer"};
        String[] parents = {"stairs", "inner_stairs", "outer_stairs"};

        for (int i = 0; i < 3; i++) {
            var data = BaseModelDataBuilder.builder()
                .parent(new Identifier("minecraft", "block/" + parents[i]))
                .texture("bottom", tex).texture("top", tex).texture("side", tex)
                .build();
            super.addModel(new Identifier(DafangConstruction.MOD_ID, path + variants[i]), ModelInstance.of(DefaultModelTypes.BASE, data));
        }
    }
        private void addStairModels(Block baseBlock, Block stairsBlock,String cata) {
        Identifier tex = new Identifier(DafangConstruction.MOD_ID, "block/" +cata+"/"+ Registries.BLOCK.getId(baseBlock).getPath());
        String path = "block/" + Registries.BLOCK.getId(stairsBlock).getPath();
        String[] variants = {"", "_inner", "_outer"};
        String[] parents = {"stairs", "inner_stairs", "outer_stairs"};

        for (int i = 0; i < 3; i++) {
            var data = BaseModelDataBuilder.builder()
                .parent(new Identifier("minecraft", "block/" + parents[i]))
                .texture("bottom", tex).texture("top", tex).texture("side", tex)
                .build();
            super.addModel(new Identifier(DafangConstruction.MOD_ID, path + variants[i]), ModelInstance.of(DefaultModelTypes.BASE, data));
        }
    }


    private void addWallModels(Block baseBlock, Block wallBlock) {
        Identifier tex = new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(baseBlock).getPath());
        String path = "block/" + Registries.BLOCK.getId(wallBlock).getPath();
        String[] variants = {"_post", "_side", "_side_tall", "_inventory"};
        String[] parents = {"template_wall_post", "template_wall_side", "template_wall_side_tall", "wall_inventory"};

        for (int i = 0; i < 4; i++) {
            var data = BaseModelDataBuilder.builder()
                .parent(new Identifier("minecraft", "block/" + parents[i]))
                .texture("wall", tex)
                .build();
            super.addModel(new Identifier(DafangConstruction.MOD_ID, path + variants[i]), ModelInstance.of(DefaultModelTypes.BASE, data));
        }
    }
    private void addWallModels(Block baseBlock, Block wallBlock, String cata) {
        Identifier tex = new Identifier(DafangConstruction.MOD_ID, "block/" + cata + "/" + Registries.BLOCK.getId(baseBlock).getPath());
        String path = "block/" + Registries.BLOCK.getId(wallBlock).getPath();
        String[] variants = {"_post", "_side", "_side_tall", "_inventory"};
        String[] parents = {"template_wall_post", "template_wall_side", "template_wall_side_tall", "wall_inventory"};

        for (int i = 0; i < 4; i++) {
            var data = BaseModelDataBuilder.builder()
                .parent(new Identifier("minecraft", "block/" + parents[i]))
                .texture("wall", tex)
                .build();
            super.addModel(new Identifier(DafangConstruction.MOD_ID, path + variants[i]), ModelInstance.of(DefaultModelTypes.BASE, data));
        }

    }
}
