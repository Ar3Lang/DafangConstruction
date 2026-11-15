package com.ar3lang.dafangconstruction.block;

import net.minecraft.block.Block;

public class DafangBlockFamily {

    private final String id;

    private Block base, slab, stairs, wall;
    private DafangTextureType type;

    public DafangBlockFamily(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public DafangTextureType getTextureType(){
        return type;
    }

    // ===== Getter =====
    public Block getBase() { return base; }
    public Block getSlab() { return slab; }
    public Block getStairs() { return stairs; }
    public Block getWall() { return wall; }

    // ===== Setter =====
    public void setBase(Block block) { this.base = block; }
    public void setSlab(Block block) { this.slab = block; }
    public void setStairs(Block block) { this.stairs = block; }
    public void setWall(Block block) { this.wall = block; }
    public void setTextureType(DafangTextureType type){
        this.type = type;
    }
}
