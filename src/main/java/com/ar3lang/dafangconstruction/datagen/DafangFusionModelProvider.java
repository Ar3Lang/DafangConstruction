package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.DafangBlocks;
import com.ar3lang.dafangconstruction.DafangConstruction;
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
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST);
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_BRICK1);
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_BRICK2);
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_BRICK3);
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_BRICK4);
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_BRICK5);
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_MATTE);
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_POLISHED);
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_TILES);
        addSlabModels(DafangBlocks.GRANITE_YELLOWRUST, DafangBlocks.GRANITE_YELLOWRUST_SLAB);
        addSlabModels(DafangBlocks.GRANITE_YELLOWRUST_BRICK1, DafangBlocks.GRANITE_YELLOWRUST_BRICK1_SLAB);
        addSlabModels(DafangBlocks.GRANITE_YELLOWRUST_BRICK2, DafangBlocks.GRANITE_YELLOWRUST_BRICK2_SLAB);
        addSlabModels(DafangBlocks.GRANITE_YELLOWRUST_BRICK3, DafangBlocks.GRANITE_YELLOWRUST_BRICK3_SLAB);
        addSlabModels(DafangBlocks.GRANITE_YELLOWRUST_BRICK4, DafangBlocks.GRANITE_YELLOWRUST_BRICK4_SLAB);
        addSlabModels(DafangBlocks.GRANITE_YELLOWRUST_BRICK5, DafangBlocks.GRANITE_YELLOWRUST_BRICK5_SLAB);
        addSlabModels(DafangBlocks.GRANITE_YELLOWRUST_MATTE, DafangBlocks.GRANITE_YELLOWRUST_MATTE_SLAB);
        addSlabModels(DafangBlocks.GRANITE_YELLOWRUST_POLISHED, DafangBlocks.GRANITE_YELLOWRUST_POLISHED_SLAB);
        addSlabModels(DafangBlocks.GRANITE_YELLOWRUST_TILES, DafangBlocks.GRANITE_YELLOWRUST_TILES_SLAB);
        addStairModels(DafangBlocks.GRANITE_YELLOWRUST,DafangBlocks.GRANITE_YELLOWRUST_STAIRS);
        addStairModels(DafangBlocks.GRANITE_YELLOWRUST_BRICK1, DafangBlocks.GRANITE_YELLOWRUST_BRICK1_STAIRS);
        addStairModels(DafangBlocks.GRANITE_YELLOWRUST_BRICK2, DafangBlocks.GRANITE_YELLOWRUST_BRICK2_STAIRS);
        addStairModels(DafangBlocks.GRANITE_YELLOWRUST_BRICK3, DafangBlocks.GRANITE_YELLOWRUST_BRICK3_STAIRS);
        addStairModels(DafangBlocks.GRANITE_YELLOWRUST_BRICK4, DafangBlocks.GRANITE_YELLOWRUST_BRICK4_STAIRS);
        addStairModels(DafangBlocks.GRANITE_YELLOWRUST_BRICK5, DafangBlocks.GRANITE_YELLOWRUST_BRICK5_STAIRS);
        addStairModels(DafangBlocks.GRANITE_YELLOWRUST_MATTE, DafangBlocks.GRANITE_YELLOWRUST_MATTE_STAIRS);
        addStairModels(DafangBlocks.GRANITE_YELLOWRUST_POLISHED, DafangBlocks.GRANITE_YELLOWRUST_POLISHED_STAIRS);
        addStairModels(DafangBlocks.GRANITE_YELLOWRUST_TILES, DafangBlocks.GRANITE_YELLOWRUST_TILES_STAIRS);
        addWallModels(DafangBlocks.GRANITE_YELLOWRUST, DafangBlocks.GRANITE_YELLOWRUST_WALL);
        addWallModels(DafangBlocks.GRANITE_YELLOWRUST_BRICK1, DafangBlocks.GRANITE_YELLOWRUST_BRICK1_WALL);
        addWallModels(DafangBlocks.GRANITE_YELLOWRUST_BRICK2, DafangBlocks.GRANITE_YELLOWRUST_BRICK2_WALL);
        addWallModels(DafangBlocks.GRANITE_YELLOWRUST_BRICK3, DafangBlocks.GRANITE_YELLOWRUST_BRICK3_WALL);
        addWallModels(DafangBlocks.GRANITE_YELLOWRUST_BRICK4, DafangBlocks.GRANITE_YELLOWRUST_BRICK4_WALL);
        addWallModels(DafangBlocks.GRANITE_YELLOWRUST_BRICK5, DafangBlocks.GRANITE_YELLOWRUST_BRICK5_WALL);
        addWallModels(DafangBlocks.GRANITE_YELLOWRUST_MATTE, DafangBlocks.GRANITE_YELLOWRUST_MATTE_WALL);
        addWallModels(DafangBlocks.GRANITE_YELLOWRUST_POLISHED, DafangBlocks.GRANITE_YELLOWRUST_POLISHED_WALL);
        addWallModels(DafangBlocks.GRANITE_YELLOWRUST_TILES, DafangBlocks.GRANITE_YELLOWRUST_TILES_WALL);

        addBaseModel(DafangBlocks.GRANITE_RED);
        addBaseModel(DafangBlocks.GRANITE_RED_BRICK1);
        addBaseModel(DafangBlocks.GRANITE_RED_BRICK2);
        addBaseModel(DafangBlocks.GRANITE_RED_BRICK3);
        addBaseModel(DafangBlocks.GRANITE_RED_BRICK4,
            new Identifier(DafangConstruction.MOD_ID,"block/rotated_block_all"),
            new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(DafangBlocks.GRANITE_RED_BRICK2).getPath()));
        addBaseModel(DafangBlocks.GRANITE_RED_BRICK5,
            new Identifier(DafangConstruction.MOD_ID,"block/rotated_block_all"),
            new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(DafangBlocks.GRANITE_RED_BRICK3).getPath()));
        addBaseModel(DafangBlocks.GRANITE_RED_MATTE);
        addBaseModel(DafangBlocks.GRANITE_RED_POLISHED);
        addBaseModel(DafangBlocks.GRANITE_RED_TILES);
                
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY);
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_BRICK1);
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_BRICK2);
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_BRICK3);
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_BRICK4,
            new Identifier(DafangConstruction.MOD_ID,"block/rotated_block_all"),
            new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(DafangBlocks.GRANITE_GALAXYGRAY_BRICK2).getPath()));
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_BRICK5,
            new Identifier(DafangConstruction.MOD_ID,"block/rotated_block_all"),
            new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(DafangBlocks.GRANITE_GALAXYGRAY_BRICK3).getPath()));
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_MATTE);
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_POLISHED);
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_TILES);
                
        addBaseModel(DafangBlocks.GRANITE_GRAY);
        addBaseModel(DafangBlocks.GRANITE_GRAY_BRICK1);
        addBaseModel(DafangBlocks.GRANITE_GRAY_BRICK_2);
        addBaseModel(DafangBlocks.GRANITE_GRAY_BRICK3);
        addBaseModel(DafangBlocks.GRANITE_GRAY_BRICK4,
            new Identifier(DafangConstruction.MOD_ID,"block/rotated_block_all"),
            new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(DafangBlocks.GRANITE_GRAY_BRICK_2).getPath()));
        addBaseModel(DafangBlocks.GRANITE_GRAY_BRICK5,
            new Identifier(DafangConstruction.MOD_ID,"block/rotated_block_all"),
            new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(DafangBlocks.GRANITE_GRAY_BRICK3).getPath()));
        addBaseModel(DafangBlocks.GRANITE_GRAY_MATTE);
        addBaseModel(DafangBlocks.GRANITE_GRAY_POLISHED);
        addBaseModel(DafangBlocks.GRANITE_GRAY_TILES);
    }


    // 以下工具方法
    private void addBaseModel(Block block){
        Identifier id = new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(block).getPath());
        var baseData = BaseModelDataBuilder.builder()
            .parent(new Identifier("minecraft","block/cube_all"))
            .texture("all",id)
            .build();
        var baseInstance = ModelInstance.of(DefaultModelTypes.BASE, baseData);
        super.addModel(id,
            baseInstance);
    }    private void addBaseModel(Block block, Identifier modelParent, Identifier texture){
        Identifier id = new Identifier(DafangConstruction.MOD_ID,"block/"+Registries.BLOCK.getId(block).getPath());
        var baseData = BaseModelDataBuilder.builder()
            .parent(modelParent)
            .texture("all",texture)
            .build();
        var baseInstance = ModelInstance.of(DefaultModelTypes.BASE, baseData);
        super.addModel(id,
            baseInstance);
    }
    /**
     * 为台阶生成 Fusion 动态模型
     * @param baseBlock 基础方块（用于获取纹理）
     * @param slabBlock 台阶方块（用于生成模型路径）
     */
    private void addSlabModels(Block baseBlock, Block slabBlock) {
        Identifier baseTextureId = new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(baseBlock).getPath());
        Identifier slabPathId = new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(slabBlock).getPath());
        Identifier slabTopPathId = new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(slabBlock).getPath() + "_top");

        // 1. Bottom
        var bottomData = BaseModelDataBuilder.builder()
            .parent(new Identifier("minecraft", "block/slab")) // 必须使用 slab 父模型
            .texture("bottom", baseTextureId)
            .texture("top", baseTextureId)
            .texture("side", baseTextureId)
            .build();
        super.addModel(slabPathId, ModelInstance.of(DefaultModelTypes.BASE, bottomData));

        // 2. Top
        var topData = BaseModelDataBuilder.builder()
            .parent(new Identifier("minecraft", "block/slab_top")) // 必须使用 slab_top 父模型
            .texture("bottom", baseTextureId)
            .texture("top", baseTextureId)
            .texture("side", baseTextureId)
            .build();
        super.addModel(slabTopPathId, ModelInstance.of(DefaultModelTypes.BASE, topData));
    }
    private void addStairModels(Block baseBlock, Block stairsBlock) {
        Identifier baseId = Registries.BLOCK.getId(baseBlock);
        Identifier stairsId = Registries.BLOCK.getId(stairsBlock);

        // 纹理路径指向基础方块
        Identifier tex = new Identifier(DafangConstruction.MOD_ID, "block/" + baseId.getPath());
        // 模型路径的基础前缀
        String path = "block/" + stairsId.getPath();

        // 定义需要生成的三个 Fusion 模型变体
        String[] variants = {"", "_inner", "_outer"};
        String[] parents = {"stairs", "inner_stairs", "outer_stairs"};

        for (int i = 0; i < 3; i++) {
            var data = BaseModelDataBuilder.builder()
                .parent(new Identifier("minecraft", "block/" + parents[i]))
                .texture("bottom", tex)
                .texture("top", tex)
                .texture("side", tex)
                .build();
            super.addModel(new Identifier(DafangConstruction.MOD_ID, path + variants[i]),
                ModelInstance.of(DefaultModelTypes.BASE, data));
        }
    }

    private void addWallModels(Block baseBlock, Block wallBlock) {
        Identifier baseId = Registries.BLOCK.getId(baseBlock);
        Identifier wallId = Registries.BLOCK.getId(wallBlock);

        Identifier tex = new Identifier(DafangConstruction.MOD_ID, "block/" + baseId.getPath());
        String path = "block/" + wallId.getPath();

        // 墙体四个模型变体 (含 Inventory)
        String[] variants = {"_post", "_side", "_side_tall", "_inventory"};
        String[] parents = {"template_wall_post", "template_wall_side", "template_wall_side_tall", "wall_inventory"};

        for (int i = 0; i < 4; i++) {
            var data = BaseModelDataBuilder.builder()
                .parent(new Identifier("minecraft", "block/" + parents[i]))
                .texture("wall", tex)
                .build();
            super.addModel(new Identifier(DafangConstruction.MOD_ID, path + variants[i]),
                ModelInstance.of(DefaultModelTypes.BASE, data));
        }
    }
//    @Override
//   protected void generate() {
//      var modelData = ConnectingModelDataBuilder.builder()
//            .parent(new ResourceLocation("minecraft", "block/cube_all"))
//            .texture("all", new ResourceLocation("mymod", "block/oak_tiles"))
//            .connection(DefaultConnectionPredicates.isSameBlock())
//            .build();
//      var modelInstance = ModelInstance.of(DefaultModelTypes.CONNECTING, modelData);
//      this.addModel(new ResourceLocation("mymod", "block/oak_tiles"), modelInstance);
//   }
//    {
//  "loader": "fusion:model",
//  "type": "fusion:connecting",
//  "parent": "minecraft:block/cube_all",
//  "textures": {
//    "all": "mymod:block/oak_tiles"
//  },
//  "connections": [
//    {
//      "type": "fusion:is_same_block"
//    }
//  ]
//}
}
