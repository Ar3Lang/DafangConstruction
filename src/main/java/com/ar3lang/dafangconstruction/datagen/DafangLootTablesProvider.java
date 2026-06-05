package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.block.DafangBlockFamily;
import com.ar3lang.dafangconstruction.block.DafangBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;

public class DafangLootTablesProvider extends FabricBlockLootTableProvider {
    public DafangLootTablesProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        for (DafangBlockFamily family : DafangBlocks.getAllFamilies()) {
            // 1. 注册基础方块
            if (family.getBase() != null) {
                addDrop(family.getBase());
            }

            // 2. 注册台阶 (使用专门的 slabDrops 方法)
            if (family.getSlab() != null) {
                addDrop(family.getSlab(), this.slabDrops(family.getSlab()));
            }

            // 3. 注册楼梯 (通常直接掉落)
            if (family.getStairs() != null) {
                addDrop(family.getStairs());
            }

            // 4. 注册墙 (通常直接掉落)
            if (family.getWall() != null) {
                addDrop(family.getWall());
            }
        }
    }
}
