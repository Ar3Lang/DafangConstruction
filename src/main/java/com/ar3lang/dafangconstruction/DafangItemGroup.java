package com.ar3lang.dafangconstruction;

import com.ar3lang.dafangconstruction.block.DafangBlockFamily;
import com.ar3lang.dafangconstruction.block.DafangBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class DafangItemGroup {
    public static final RegistryKey<ItemGroup> DAFANG_ITEMGROUP = RegistryKey.of(
        RegistryKeys.ITEM_GROUP,
        new Identifier(DafangConstruction.MOD_ID, "dafangconstruction")
    );

    public static void init() {
        // 注册物品栏
        Registry.register(Registries.ITEM_GROUP, DAFANG_ITEMGROUP, FabricItemGroup.builder()
            .displayName(Text.translatable("dafang.itemgroup"))
            // 这里可以换一个更通用的图标或者保留原来的逻辑
            .icon(() -> new ItemStack(DafangBlocks.getFamily("granite_yellowrust").getBase()))
            .build()
        );

        // 动态添加所有 Family 中的内容
        ItemGroupEvents.modifyEntriesEvent(DAFANG_ITEMGROUP).register((entries) -> {
            for (DafangBlockFamily family : DafangBlocks.getAllFamilies()) {
                // 按顺序添加：本体、台阶、楼梯、墙
                if (family.getBase() != null) entries.add(family.getBase());
                if (family.getSlab() != null) entries.add(family.getSlab());
                if (family.getStairs() != null) entries.add(family.getStairs());
                if (family.getWall() != null) entries.add(family.getWall());
            }
        });
    }
}
