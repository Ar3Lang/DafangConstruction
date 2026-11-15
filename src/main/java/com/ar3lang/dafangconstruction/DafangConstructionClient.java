package com.ar3lang.dafangconstruction;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class DafangConstructionClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // 检测是否安装了 Fusion
        if (!FabricLoader.getInstance().isModLoaded("fusion")) {
            // 这里会抛出异常，导致客户端启动失败并报错
            throw new RuntimeException("Dafang Construction requires 'Fusion' mod on the CLIENT side!");
        }
    }
}
