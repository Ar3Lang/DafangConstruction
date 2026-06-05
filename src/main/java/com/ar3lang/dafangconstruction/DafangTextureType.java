package com.ar3lang.dafangconstruction;

import com.supermartijn642.fusion.api.texture.DefaultTextureTypes;
import com.supermartijn642.fusion.api.texture.TextureType;
import com.supermartijn642.fusion.api.texture.data.BaseTextureData;
import com.supermartijn642.fusion.api.texture.data.ContinuousTextureData;
import com.supermartijn642.fusion.api.texture.data.RandomTextureData;

public enum DafangTextureType {
    PATTERN1_5(
        DefaultTextureTypes.CONTINUOUS,
        ContinuousTextureData.builder().rows(3).columns(3).build()
    ),
    PATTERN2(
        DefaultTextureTypes.CONTINUOUS,
        ContinuousTextureData.builder().rows(2).columns(2).build()
    ),
    PATTERN4(
        DefaultTextureTypes.CONTINUOUS,
        ContinuousTextureData.builder().rows(4).columns(4).build()
    ),
    PATTERN8(
        DefaultTextureTypes.CONTINUOUS,
        ContinuousTextureData.builder().rows(8).columns(8).build()
    ),
    RECTANGLE4_2(
        DefaultTextureTypes.CONTINUOUS,
        ContinuousTextureData.builder().columns(4).rows(2).build()
    ),
    RANDOM2(
        DefaultTextureTypes.RANDOM,
        RandomTextureData.builder().rows(2).columns(2).count(2).build()
    ),
    RANDOM3(
        DefaultTextureTypes.RANDOM,
        RandomTextureData.builder().rows(3).columns(3).count(3).build()
    );

    private final TextureType textureType;
    private final BaseTextureData data;
    public TextureType getType(){
        return textureType;
    }
    public BaseTextureData getData(){
        return  data;
    }

    DafangTextureType(TextureType textureType, BaseTextureData data) {
        this.textureType = textureType;
        this.data = data;
    }
}
