package ar3lang.dafang.block;

import ar3lang.dafang.DafangConstruction;
import ar3lang.dafang.block.ceiling.AluminumCeiling;
import ar3lang.dafang.block.cloth.FlatFabricVintage;
import ar3lang.dafang.block.itemblock.ItemBlockMeta;
import ar3lang.dafang.block.stone.*;
import ar3lang.dafang.item.RegisterItem;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = DafangConstruction.MODID)
public class RegisterBlock {
    //Receive Block from BlockBase.It is used to add the Object to RegisterBufferHasMeta to wait for Registry Event
    public static ArrayList<Block> RegisterBuffer = new ArrayList<>();
    public static ArrayList<Block> RegisterBufferHasMeta = new ArrayList<>();
    //define ROCK
    public static Block ROCK_GRANITE_YELLOWRUST;
    public static Block ROCK_GRANITE_GRAY;
    public static Block ROCK_GRANITE_RED;
    public static Block ROCK_GRANITE_GALAXYGRAY;
    public static Block ROCK_CONCRETE_VINTAGE;
    //define WOOD
    //define WOOL
    public static Block CLOTH_FLATFABRIC_VINTAGE;
    //define METAL
    public static Block METAL_ALUMINUM_CEILING;

    @SubscribeEvent
    public static void blockInit(RegistryEvent.Register<Block> event){
        ROCK_GRANITE_YELLOWRUST = new GraniteYellowrust("granite_yellowrust");
        ROCK_GRANITE_GRAY = new GraniteGray("granite_gray");
        ROCK_GRANITE_RED = new GraniteRed("granite_red");
        ROCK_GRANITE_GALAXYGRAY = new GraniteGalaxyGray("granite_galaxygray");
        ROCK_CONCRETE_VINTAGE = new ConcreteVintage("concrete_vintage");

        CLOTH_FLATFABRIC_VINTAGE = new FlatFabricVintage("flatfabric_vintage");
        METAL_ALUMINUM_CEILING = new AluminumCeiling("aluminum_ceiling");



            for (Block b: RegisterBuffer){
                event.getRegistry().register(b);
                ItemBlock item = new ItemBlock(b);
                item.setRegistryName(b.getRegistryName());
                RegisterItem.RegisterBuffer.add(item);
            }
            for (Block b: RegisterBufferHasMeta){
                event.getRegistry().register(b);
                ItemBlockMeta item = new ItemBlockMeta(b);
                item.setRegistryName(b.getRegistryName());
                RegisterItem.RegisterBufferHasMeta.add(item);
            }

    }
}
