package com.ar3lang.dafangconstruction;

import com.ar3lang.dafangconstruction.block.DafangBlocks;
import com.ar3lang.dafangconstruction.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DafangConstructionDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

//        DafangBlocks.init();

        pack.addProvider(DafangLangEnUsProvider::new);
        pack.addProvider(DafangLangZhCnProvider::new);
        pack.addProvider(DafangModelProvider::new);
        //最好在客户端执行本数据生成器
        pack.addProvider(DafangFusionModelProvider::new);
        pack.addProvider(DafangTextureMetadataProvider::new);

        pack.addProvider(DafangItemTagProvider::new);
        pack.addProvider(DafangBlockTagProvider::new);
        pack.addProvider(DafangLootTablesProvider::new);
        pack.addProvider(DafangCraftingRecipeProvider::new);
        pack.addProvider(DafangStonecuttingRecipeProvider::new);
        pack.addProvider(DafangFurnaceRecipeProvider::new);

	}
}
