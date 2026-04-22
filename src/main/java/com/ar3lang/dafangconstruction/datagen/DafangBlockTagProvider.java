package com.ar3lang.dafangconstruction.datagen;

import com.ar3lang.dafangconstruction.DafangBlocks;
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
        //石材要在这注册一下，要不然挖不了
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(DafangBlocks.GRANITE_YELLOWRUST)
            .add(DafangBlocks.GRANITE_YELLOWRUST_BRICK1)
            .add(DafangBlocks.GRANITE_YELLOWRUST_BRICK2)
            .add(DafangBlocks.GRANITE_YELLOWRUST_BRICK3)
            .add(DafangBlocks.GRANITE_YELLOWRUST_BRICK4)
            .add(DafangBlocks.GRANITE_YELLOWRUST_BRICK5)
            .add(DafangBlocks.GRANITE_YELLOWRUST_MATTE)
            .add(DafangBlocks.GRANITE_YELLOWRUST_POLISHED)
            .add(DafangBlocks.GRANITE_YELLOWRUST_TILES)
            .add(DafangBlocks.GRANITE_RED)
            .add(DafangBlocks.GRANITE_RED_BRICK1)
            .add(DafangBlocks.GRANITE_RED_BRICK2)
            .add(DafangBlocks.GRANITE_RED_BRICK3)
            .add(DafangBlocks.GRANITE_RED_BRICK4)
            .add(DafangBlocks.GRANITE_RED_BRICK5)
            .add(DafangBlocks.GRANITE_RED_MATTE)
            .add(DafangBlocks.GRANITE_RED_POLISHED)
            .add(DafangBlocks.GRANITE_RED_TILES)
            .add(DafangBlocks.GRANITE_GALAXYGRAY)
            .add(DafangBlocks.GRANITE_GALAXYGRAY_BRICK1)
            .add(DafangBlocks.GRANITE_GALAXYGRAY_BRICK2)
            .add(DafangBlocks.GRANITE_GALAXYGRAY_BRICK3)
            .add(DafangBlocks.GRANITE_GALAXYGRAY_BRICK4)
            .add(DafangBlocks.GRANITE_GALAXYGRAY_BRICK5)
            .add(DafangBlocks.GRANITE_GALAXYGRAY_MATTE)
            .add(DafangBlocks.GRANITE_GALAXYGRAY_POLISHED)
            .add(DafangBlocks.GRANITE_GALAXYGRAY_TILES)
            .add(DafangBlocks.GRANITE_GRAY)
            .add(DafangBlocks.GRANITE_GRAY_BRICK1)
            .add(DafangBlocks.GRANITE_GRAY_BRICK_2)
            .add(DafangBlocks.GRANITE_GRAY_BRICK3)
            .add(DafangBlocks.GRANITE_GRAY_BRICK4)
            .add(DafangBlocks.GRANITE_GRAY_BRICK5)
            .add(DafangBlocks.GRANITE_GRAY_MATTE)
            .add(DafangBlocks.GRANITE_GRAY_POLISHED)
            .add(DafangBlocks.GRANITE_GRAY_TILES);
            
    }
}
