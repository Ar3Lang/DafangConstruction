package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.DafangBlocks;
import com.ar3lang.dafangconstruction.DafangConstruction;
import com.supermartijn642.fusion.api.provider.FusionTextureMetadataProvider;
import com.supermartijn642.fusion.api.texture.DefaultTextureTypes;
import com.supermartijn642.fusion.api.texture.TextureType;
import com.supermartijn642.fusion.api.texture.data.BaseTextureData;
import com.supermartijn642.fusion.api.texture.data.ContinuousTextureData;
import com.supermartijn642.fusion.api.texture.data.RandomTextureData;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;


public class DafangTextureMetadataProvider extends FusionTextureMetadataProvider {
    public DafangTextureMetadataProvider(FabricDataOutput output) {
        super(DafangConstruction.MOD_ID, output);
    }
    private enum EnumType {
        PATTERN1_5(
            DefaultTextureTypes.CONTINUOUS,
            ContinuousTextureData.builder().rows(3).columns(3).build()
        ),
        PATTERN2(
            DefaultTextureTypes.CONTINUOUS,
            ContinuousTextureData.builder().rows(2).columns(2).build()
        ),
        RANDOM2(
            DefaultTextureTypes.RANDOM,
            RandomTextureData.builder().rows(2).columns(2).build()
        ),
        RANDOM3(
            DefaultTextureTypes.RANDOM,
            RandomTextureData.builder().rows(3).columns(3).count(3).build()
        );
        private final TextureType textureType;
        private final BaseTextureData data;

        EnumType(TextureType textureType, BaseTextureData data) {
            this.textureType = textureType;
            this.data = data;
        }
    }

    private void addTextureMetadata(Block block, EnumType type) {
        Identifier id = new Identifier(DafangConstruction.MOD_ID, "block/" + Registries.BLOCK.getId(block).getPath());
            super.addTextureMetadata(
                id,
                type.textureType,
                type.data
            );
    }
    @Override
    protected void generate() {
        addTextureMetadata(DafangBlocks.GRANITE_YELLOWRUST, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_YELLOWRUST_BRICK_1, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_YELLOWRUST_BRICK_2, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_YELLOWRUST_BRICK_3, EnumType.PATTERN1_5);
        addTextureMetadata(DafangBlocks.GRANITE_YELLOWRUST_BRICK_4, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_YELLOWRUST_BRICK_5, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_YELLOWRUST_MATTE, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_YELLOWRUST_POLISHED, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_YELLOWRUST_TILES, EnumType.RANDOM3);
        
        addTextureMetadata(DafangBlocks.GRANITE_RED, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_RED_BRICK_1, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_RED_BRICK_2, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_RED_BRICK_3, EnumType.PATTERN1_5);
        addTextureMetadata(DafangBlocks.GRANITE_RED_BRICK_4, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_RED_BRICK_5, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_RED_MATTE, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_RED_POLISHED, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_RED_TILES, EnumType.RANDOM3);
        
        addTextureMetadata(DafangBlocks.GRANITE_GALAXYGRAY, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_1, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_2, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_3, EnumType.PATTERN1_5);
        addTextureMetadata(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_4, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_GALAXYGRAY_BRICK_5, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_GALAXYGRAY_MATTE, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_GALAXYGRAY_POLISHED, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_GALAXYGRAY_TILES, EnumType.RANDOM3);
                
        addTextureMetadata(DafangBlocks.GRANITE_GRAY, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_GRAY_BRICK_1, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_GRAY_BRICK_2, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_GRAY_BRICK_3, EnumType.PATTERN1_5);
        addTextureMetadata(DafangBlocks.GRANITE_GRAY_BRICK_4, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_GRAY_BRICK_5, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_GRAY_MATTE, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_GRAY_POLISHED, EnumType.PATTERN2);
        addTextureMetadata(DafangBlocks.GRANITE_GRAY_TILES, EnumType.RANDOM3);
        
    }
//
//        assets/mymod/textures/block/flowing_magma.png.mcmeta:
//        {
//            "fusion": {
//            "type": "scrolling",
//                "from": "top_left",
//                "to": "top_right",
//                "frame_width": 8,
//                "frame_height": 8,
//                "loop_type": "reverse"
//        }
//        }
}
