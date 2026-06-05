package com.ar3lang.dafangconstruction;

public enum DafangTags {
    //材质
    ROCK("dafang.tag.rock"),
    WOOL("dafang.tag.wool"),
    WOOD("dafang.tag.wood"),
    METAL("dafang.tag.metal"),

    //纹理
    RAW("dafang.tag.raw"),
    POLISHED("dafang.tag.polished"),
    MATTE("dafang.tag.matte"),
    FIRE("dafang.tag.fire"),
    VERTICAL("dafang.tag.vertical"),
    HORIZONTAL("dafang.tag.horizontal"),
    RANDOM("dafang.tag.random"),
    x1("dafang.tag.x1"),
    x1_5("dafang.tag.x1_5"),
    x2("dafang.tag.x2"),
    CROSS("dafang.tag.cross"),
    FLAT("dafang.tag.flat"),
    CEMENT("dafang.tag.cement"),
    MARBLE("dafang.tag.marble"),
    GOLD("dafang.tag.gold"),
    SQUARE("dafang.tag.square"),
    ARTISTIC("dafang.tag.artistic"),
    x4("dafang.tag.x4");

    private final String transKey;
    public String getTransKey(){
        return transKey;
    }
    DafangTags(String transKey){
        this.transKey = transKey;
    }
}
