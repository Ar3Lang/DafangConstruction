package ar3lang.dafang.block;

import ar3lang.dafang.DafangConstruction;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class WoodBase extends DafangBlock {
    public WoodBase(String name) {
        super(Material.WOOD);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(DafangConstruction.ARCH_Tab);
        //add the Object to RegisterBufferHasMeta to wait for Registry Event
//        RegisterBlock.RegisterBufferHasMeta.add(this);
    }
}
