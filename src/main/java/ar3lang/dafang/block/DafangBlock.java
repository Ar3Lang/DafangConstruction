package ar3lang.dafang.block;

import ar3lang.dafang.block.stone.base.IBlockMeta;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class DafangBlock extends Block {
    private String translationKey;
    protected ArrayList<String> variantType = new ArrayList<>();
    public DafangBlock(Material materialIn) {
        super(materialIn);
    }

    public String getTranslationKey(ItemStack stack){
        return this.translationKey+"_"+ variantType.get(stack.getMetadata());
    }
    public @NotNull Block setTranslationKey(String key){
        translationKey = key; return this;
    }
}
