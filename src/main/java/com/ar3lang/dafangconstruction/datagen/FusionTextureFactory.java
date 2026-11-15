package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.block.DafangTextureType;
import com.supermartijn642.fusion.api.texture.DefaultTextureTypes;
import com.supermartijn642.fusion.api.texture.TextureType;
import com.supermartijn642.fusion.api.texture.types.base.BaseTextureData;
import com.supermartijn642.fusion.api.texture.types.continuous.ContinuousTextureData;
import com.supermartijn642.fusion.api.texture.types.random.RandomTextureData;

public class FusionTextureFactory {

    /**
     * 将解耦的 DafangTextureType 转换为 Fusion 所需的 TextureType 和 BaseTextureData
     */
    public static FusionTextureData build(DafangTextureType type) {
        DafangTextureType.Props props = type.getProperties();

        if (type.getMode() == DafangTextureType.TextureMode.CONTINUOUS) {
            BaseTextureData data = ContinuousTextureData.builder()
                .rows(props.getInt("rows", 1))
                .columns(props.getInt("columns", 1))
                .build();
            return new FusionTextureData(DefaultTextureTypes.CONTINUOUS, data);

        } else if (type.getMode() == DafangTextureType.TextureMode.RANDOM) {
            BaseTextureData data = RandomTextureData.builder()
                .rows(props.getInt("rows", 1))
                .columns(props.getInt("columns", 1))
                .build();
            return new FusionTextureData(DefaultTextureTypes.RANDOM, data);
        }

        throw new IllegalArgumentException("Unknown Texture Mode: " + type.getMode());
    }

    /**
     * 简单的数据包装类，用于同时返回两个 Fusion 对象
     */
    public record FusionTextureData(TextureType type, BaseTextureData data) {}
}
