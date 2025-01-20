package ar3lang.dafang.block.itemblock;

import ar3lang.dafang.block.cloth.FlatFabricVintage;
import ar3lang.dafang.block.stone.*;
import ar3lang.dafang.block.stone.base.VariantBase1;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class ItemBlockMeta extends ItemBlock {
	//父类有一个protected fianl BLOCK 对象
	public ItemBlockMeta(Block block) {
		super(block);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setNoRepair();
	}
	@Override
	public int getMetadata(int damage) {
		return damage;
	}
	@SideOnly(Side.CLIENT)
	@Override
	public @NotNull String getTranslationKey(@NotNull ItemStack stack) {
		switch (block.getTranslationKey()){
//			case "tile.granite_yellowrust":
//				return block.getTranslationKey();
			case "tile.granite_gray":
				return GraniteGray.EnumType.values()[getMetadata(stack)].getTranslationKey();
			case "tile.granite_red":
				return GraniteRed.EnumType.values()[getMetadata(stack)].getTranslationKey();
			case "tile.granite_galaxygray":
				return GraniteGalaxyGray.EnumType.values()[getMetadata(stack)].getTranslationKey();
			case "tile.flatfabric_vintage":
				return FlatFabricVintage.EnumType.values()[getMetadata(stack)].getTranslationKey();
			case "tile.concrete_vintage":
				return ConcreteVintage.EnumType.values()[getMetadata(stack)].getTranslationKey();
			case "tile.aluminum_ceiling":
			default:
				return block.getTranslationKey();
		}
    }
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(@NotNull ItemStack stack, @Nullable World worldIn, List<String> tooltip, @NotNull ITooltipFlag flagIn) {
		tooltip.add(I18n.format(getTranslationKey(stack)+".desc"));
		if(block.getTranslationKey().equals("tile.flatfabric_vintage")&&stack.getMetadata()==13){
			tooltip.add("\u00A75Under wisteria tree..");
		}
	}
}
