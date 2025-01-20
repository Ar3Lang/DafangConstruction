package ar3lang.dafang.block.stone;

import ar3lang.dafang.DafangConstruction;
import ar3lang.dafang.block.RegisterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public abstract class StoneBase extends Block {
    private final String name;
//    private String unlocalizedName;


    StoneBase(String name) {
        super(Material.ROCK);
        setTranslationKey(name);
        setRegistryName(name);
        setHardness(1F);
        setSoundType(SoundType.STONE);
        setHarvestLevel("pickaxe", 0);
        setCreativeTab(DafangConstruction.ARCH_Tab);
        this.name = name;
        RegisterBlock.RegisterBuffer.add(this);
    }
}
