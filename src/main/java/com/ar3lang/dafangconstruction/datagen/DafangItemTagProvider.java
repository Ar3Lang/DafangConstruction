package com.ar3lang.dafangconstruction.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;


import java.util.concurrent.CompletableFuture;

public class DafangItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public DafangItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    public DafangItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
    }
}
