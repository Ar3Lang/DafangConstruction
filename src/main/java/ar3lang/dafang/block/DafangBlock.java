package ar3lang.dafang.block;

import ar3lang.dafang.block.stone.base.IBlockMeta;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class DafangBlock extends Block {

    protected String name;
    //存储PropertyEnum枚举名字
    public ArrayList<String> variantType = new ArrayList<String>();


    public DafangBlock(Material materialIn) {
        super(materialIn);
    }
    public DafangBlock(Material materialIn,String name) {
        super(materialIn);
        setRegistryName(name);
        setTranslationKey(name);
    }


    public String getTranslationKey(ItemStack stack){
        return this.name +"_"+ variantType.get(stack.getMetadata());
    }
    public @NotNull Block setTranslationKey(String key){
        name = key; return this;
    }
}
