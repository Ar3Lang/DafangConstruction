package ar3lang.dafang;

import ar3lang.dafang.block.cloth.FlatFabricVintage;
import ar3lang.dafang.block.stone.*;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static ar3lang.dafang.block.RegisterBlock.*;
import static ar3lang.dafang.proxy.ClientProxy.registerRenderSlab;
import static ar3lang.dafang.proxy.ClientProxy.registerRenderVariant;

@Mod.EventBusSubscriber(modid = DafangConstruction.MODID)
public class ModelRegInit {
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void modelRegMetaInit(ModelRegistryEvent event){
        registerRenderVariant(ROCK_GRANITE_YELLOWRUST,0, GraniteYellowrust.EnumType.values()[0].getName());
        registerRenderVariant(ROCK_GRANITE_YELLOWRUST,1, GraniteYellowrust.EnumType.values()[1].getName());
        registerRenderVariant(ROCK_GRANITE_YELLOWRUST,2, GraniteYellowrust.EnumType.values()[2].getName());
        registerRenderVariant(ROCK_GRANITE_YELLOWRUST,3, GraniteYellowrust.EnumType.values()[3].getName());
        registerRenderVariant(ROCK_GRANITE_YELLOWRUST,4, GraniteYellowrust.EnumType.values()[4].getName());
        registerRenderVariant(ROCK_GRANITE_YELLOWRUST,5, GraniteYellowrust.EnumType.values()[5].getName());
        registerRenderVariant(ROCK_GRANITE_YELLOWRUST,6, GraniteYellowrust.EnumType.values()[6].getName());
        registerRenderVariant(ROCK_GRANITE_YELLOWRUST,7, GraniteYellowrust.EnumType.values()[7].getName());
        registerRenderVariant(ROCK_GRANITE_GRAY,0, GraniteGray.EnumType.values()[0].getName());
        registerRenderVariant(ROCK_GRANITE_GRAY,1, GraniteGray.EnumType.values()[1].getName());
        registerRenderVariant(ROCK_GRANITE_GRAY,2, GraniteGray.EnumType.values()[2].getName());
        registerRenderVariant(ROCK_GRANITE_GRAY,3, GraniteGray.EnumType.values()[3].getName());
        registerRenderVariant(ROCK_GRANITE_GRAY,4, GraniteGray.EnumType.values()[4].getName());
        registerRenderVariant(ROCK_GRANITE_GRAY,5, GraniteGray.EnumType.values()[5].getName());
        registerRenderVariant(ROCK_GRANITE_GRAY,6, GraniteGray.EnumType.values()[6].getName());
        registerRenderVariant(ROCK_GRANITE_GRAY,7, GraniteGray.EnumType.values()[7].getName());
        registerRenderVariant(ROCK_GRANITE_RED,0, GraniteRed.EnumType.values()[0].getName());
        registerRenderVariant(ROCK_GRANITE_RED,1, GraniteRed.EnumType.values()[1].getName());
        registerRenderVariant(ROCK_GRANITE_RED,2, GraniteRed.EnumType.values()[2].getName());
        registerRenderVariant(ROCK_GRANITE_RED,3, GraniteRed.EnumType.values()[3].getName());
        registerRenderVariant(ROCK_GRANITE_RED,4, GraniteRed.EnumType.values()[4].getName());
        registerRenderVariant(ROCK_GRANITE_RED,5, GraniteRed.EnumType.values()[5].getName());
        registerRenderVariant(ROCK_GRANITE_RED,6, GraniteRed.EnumType.values()[6].getName());
        registerRenderVariant(ROCK_GRANITE_RED,7, GraniteRed.EnumType.values()[7].getName());
        registerRenderVariant(ROCK_GRANITE_GALAXYGRAY,0, GraniteGalaxyGray.EnumType.values()[0].getName());
        registerRenderVariant(ROCK_GRANITE_GALAXYGRAY,1, GraniteGalaxyGray.EnumType.values()[1].getName());
        registerRenderVariant(ROCK_GRANITE_GALAXYGRAY,2, GraniteGalaxyGray.EnumType.values()[2].getName());
        registerRenderVariant(ROCK_GRANITE_GALAXYGRAY,3, GraniteGalaxyGray.EnumType.values()[3].getName());
        registerRenderVariant(ROCK_GRANITE_GALAXYGRAY,4, GraniteGalaxyGray.EnumType.values()[4].getName());
        registerRenderVariant(ROCK_GRANITE_GALAXYGRAY,5, GraniteGalaxyGray.EnumType.values()[5].getName());
        registerRenderVariant(ROCK_GRANITE_GALAXYGRAY,6, GraniteGalaxyGray.EnumType.values()[6].getName());
        registerRenderVariant(ROCK_GRANITE_GALAXYGRAY,7, GraniteGalaxyGray.EnumType.values()[7].getName());
        for (int i = 0; i < ConcreteVintage.EnumType.values().length; i++) {
            registerRenderVariant(ROCK_CONCRETE_VINTAGE,i, ConcreteVintage.EnumType.values()[i].getName());
        }
        for (int i = 0; i < FlatFabricVintage.EnumType.values().length; i++) {
            registerRenderVariant(CLOTH_FLATFABRIC_VINTAGE,i, FlatFabricVintage.EnumType.values()[i].getName());
        }
        registerRenderSlab(METAL_ALUMINUM_CEILING,0, EnumFacing.SOUTH,false);
        registerRenderSlab(METAL_ALUMINUM_CEILING,1, EnumFacing.NORTH,false);
        registerRenderSlab(METAL_ALUMINUM_CEILING,2, EnumFacing.EAST,false);
        registerRenderSlab(METAL_ALUMINUM_CEILING,3, EnumFacing.WEST,false);
        registerRenderSlab(METAL_ALUMINUM_CEILING,4, EnumFacing.SOUTH,true);
        registerRenderSlab(METAL_ALUMINUM_CEILING,5, EnumFacing.NORTH,true);
        registerRenderSlab(METAL_ALUMINUM_CEILING,6, EnumFacing.EAST,true);
        registerRenderSlab(METAL_ALUMINUM_CEILING,7, EnumFacing.WEST,true);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void modelRegInit(ModelRegistryEvent event) {
    }
}
