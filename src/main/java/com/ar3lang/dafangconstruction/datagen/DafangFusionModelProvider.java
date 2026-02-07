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
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_BRICK_1);
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_BRICK_2);
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_BRICK_3);
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_BRICK_4,
            new Identifier(DafangConstruction.MOD_ID,"block/rotated_block_all"),
            new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(DafangBlocks.GRANITE_YELLOWRUST_BRICK_2).getPath()));
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_BRICK_5,
            new Identifier(DafangConstruction.MOD_ID,"block/rotated_block_all"),
            new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(DafangBlocks.GRANITE_YELLOWRUST_BRICK_3).getPath()));
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_MATTE);
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_POLISHED);
        addBaseModel(DafangBlocks.GRANITE_YELLOWRUST_TILES);
        
        addBaseModel(DafangBlocks.GRANITE_RED);
        addBaseModel(DafangBlocks.GRANITE_RED_BRICK_1);
        addBaseModel(DafangBlocks.GRANITE_RED_BRICK_2);
        addBaseModel(DafangBlocks.GRANITE_RED_BRICK_3);
        addBaseModel(DafangBlocks.GRANITE_RED_BRICK_4,
            new Identifier(DafangConstruction.MOD_ID,"block/rotated_block_all"),
            new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(DafangBlocks.GRANITE_RED_BRICK_2).getPath()));
        addBaseModel(DafangBlocks.GRANITE_RED_BRICK_5,
            new Identifier(DafangConstruction.MOD_ID,"block/rotated_block_all"),
            new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(DafangBlocks.GRANITE_RED_BRICK_3).getPath()));
        addBaseModel(DafangBlocks.GRANITE_RED_MATTE);
        addBaseModel(DafangBlocks.GRANITE_RED_POLISHED);
        addBaseModel(DafangBlocks.GRANITE_RED_TILES);
                
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY);
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_1);
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_2);
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_3);
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_4,
            new Identifier(DafangConstruction.MOD_ID,"block/rotated_block_all"),
            new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_2).getPath()));
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_5,
            new Identifier(DafangConstruction.MOD_ID,"block/rotated_block_all"),
            new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_3).getPath()));
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_MATTE);
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_POLISHED);
        addBaseModel(DafangBlocks.GRANITE_GALAXYGRAY_TILES);
                
        addBaseModel(DafangBlocks.GRANITE_GRAY);
        addBaseModel(DafangBlocks.GRANITE_GRAY_BRICK_1);
        addBaseModel(DafangBlocks.GRANITE_GRAY_BRICK_2);
        addBaseModel(DafangBlocks.GRANITE_GRAY_BRICK_3);
        addBaseModel(DafangBlocks.GRANITE_GRAY_BRICK_4,
            new Identifier(DafangConstruction.MOD_ID,"block/rotated_block_all"),
            new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(DafangBlocks.GRANITE_GRAY_BRICK_2).getPath()));
        addBaseModel(DafangBlocks.GRANITE_GRAY_BRICK_5,
            new Identifier(DafangConstruction.MOD_ID,"block/rotated_block_all"),
            new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(DafangBlocks.GRANITE_GRAY_BRICK_3).getPath()));
        addBaseModel(DafangBlocks.GRANITE_GRAY_MATTE);
        addBaseModel(DafangBlocks.GRANITE_GRAY_POLISHED);
        addBaseModel(DafangBlocks.GRANITE_GRAY_TILES);
    }

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
