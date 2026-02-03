package com.ar3lang.dafangconstruction;

import com.ar3lang.dafangconstruction.datagen.DafangLangEnUsProvider;
import com.ar3lang.dafangconstruction.datagen.DafangLangZhCnProvider;
import com.ar3lang.dafangconstruction.datagen.DafangModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DafangConstructionDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(DafangLangEnUsProvider::new);
        pack.addProvider(DafangLangZhCnProvider::new);
        pack.addProvider(DafangModelProvider::new);
	}
}
