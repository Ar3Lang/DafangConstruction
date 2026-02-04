package com.ar3lang.dafangconstruction;

import com.ar3lang.dafangconstruction.datagen.DafangLangEnUsProvider;
import com.ar3lang.dafangconstruction.datagen.DafangLangZhCnProvider;
import com.ar3lang.dafangconstruction.datagen.DafangModelProvider;
import com.ar3lang.dafangconstruction.datagen.DafangTextureMetadataProvider;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DafangConstructionClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

//        ItemTooltipCallback.EVENT.register((stack, context, lines) -> {
//            // 判断物品类型
//            if (stack.isOf(BlockusBlocks.WHITE_OAK_LOG.asItem())) {
//                // 添加灰色提示文本
//                lines.add(Text.literal("白橡木原木").formatted(Formatting.GRAY));
//                // 或者使用翻译键（推荐，支持多语言）
//                lines.add(Text.translatable("tooltip.blockus.white_oak_log").formatted(Formatting.DARK_GRAY));
//            }
//
//            // 也可以给整个物品组或带特定 NBT 的物品添加
//            if (stack.hasNbt() && stack.getNbt().contains("Special")) {
//                lines.add(Text.literal("✦ 特殊物品").formatted(Formatting.GOLD));
//            }
//        });
    }
}
