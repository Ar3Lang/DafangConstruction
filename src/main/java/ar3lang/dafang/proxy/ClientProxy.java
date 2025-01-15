package ar3lang.dafang.proxy;

import ar3lang.dafang.DafangConstruction;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.client.model.ModelLoader;



public class ClientProxy {
    public static void registerRender(Block block, int meta, String path) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta,
                new ModelResourceLocation(DafangConstruction.MODID+":"+path, "inventory"));
    }
    public static void registerRenderVariant(Block block, int meta, String variantName){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta,
                new ModelResourceLocation(block.getRegistryName(), "variant="+variantName));
        ModelLoader.registerItemVariants(Item.getItemFromBlock(block));
    }
    public static void registerRenderSlab(Block block, int meta, boolean top){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),meta,
                new ModelResourceLocation(block.getRegistryName(),"top="+top));
    }
    public static void registerRenderSlab(Block block, int meta, EnumFacing direction, boolean top){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),meta,
                new ModelResourceLocation(block.getRegistryName(),"facing="+direction+",top="+top));
    }
}
