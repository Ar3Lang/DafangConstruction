package ar3lang.dafang.item;

import ar3lang.dafang.DafangConstruction;
import ar3lang.dafang.block.itemblock.ItemBlockMeta;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
@Mod.EventBusSubscriber(modid = DafangConstruction.MODID)
public class RegisterItem {
    public static ArrayList<Item> RegisterBuffer = new ArrayList<>();
    public static ArrayList<ItemBlockMeta> RegisterBufferHasMeta = new ArrayList<>();
    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> event){
        for (Item item: RegisterBuffer) {
            event.getRegistry().register(item);
        }
        for (Item item: RegisterBufferHasMeta) {
            event.getRegistry().register(item);
        }
    }
}
