package com.ar3lang.dafangconstruction;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DafangTooltipBlockItem extends BlockItem {
    private final String Info;
    private final DafangTags[] Tags;
    private final Boolean hasTag;
    private final Boolean hasInfo;

    public DafangTooltipBlockItem(Block block, Settings settings, DafangTags[] tags,String id) {
        super(block, settings);
        this.hasTag = true;
        this.Tags = tags;
        this.hasInfo = false;
        this.Info = null;
    }
    public DafangTooltipBlockItem(Block block, Settings settings, DafangTags[] tags, Boolean info,String id) {
        super(block, settings);
        this.hasTag = true;
        this.Tags = tags;
        this.hasInfo = info;
        this.Info = "dafang.tooltip."+id;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        //添加标签tooltip
        if(hasTag){
            tooltip.add(Text.translatable("dafang.tooltip.titles.tags").formatted(Formatting.DARK_GRAY,Formatting.BOLD));
            String tags = "";
            for (DafangTags tag: Tags) {
                tags += Text.translatable(tag.getTransKey()).getString() + ", ";
            }
            tooltip.add(Text.literal(tags).formatted(Formatting.GRAY));
            tooltip.add(Text.literal(""));
        }
        //添加简介tooltip
        if (hasInfo){
            tooltip.add(Text.translatable("dafang.tooltip.titles.info").formatted(Formatting.DARK_GRAY,Formatting.BOLD));
            tooltip.add(Text.translatable(Info).formatted(Formatting.DARK_PURPLE,Formatting.ITALIC));
            tooltip.add(Text.literal(""));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
