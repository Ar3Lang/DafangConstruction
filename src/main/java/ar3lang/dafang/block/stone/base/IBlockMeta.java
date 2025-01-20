package ar3lang.dafang.block.stone.base;

import net.minecraft.item.ItemStack;

public interface IBlockMeta {
    String getTranslationKey(ItemStack stack);
    //在注册 meta物品 时候用 stack 获取 translationKey
    String getDesc(ItemStack stack);
}
