package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.block.DafangBlockFamily;
import com.ar3lang.dafangconstruction.block.DafangBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class DafangBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public DafangBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture);
    }

    public DafangBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // 创建标签构建器
        var pickaxeBuilder = getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE);
        var wallBuilder = getOrCreateTagBuilder(BlockTags.WALLS);

        // 遍历所有 Family 自动注入
        for (DafangBlockFamily family : DafangBlocks.getAllFamilies()) {
            // 所有方块都需要能够被镐子挖掘
            if (family.getBase() != null) pickaxeBuilder.add(family.getBase());
            if (family.getSlab() != null) pickaxeBuilder.add(family.getSlab());
            if (family.getStairs() != null) pickaxeBuilder.add(family.getStairs());
            if (family.getWall() != null) pickaxeBuilder.add(family.getWall());

            // 只有墙需要加入到 WALLS 标签中
            if (family.getWall() != null) wallBuilder.add(family.getWall());
        }
    }
}
