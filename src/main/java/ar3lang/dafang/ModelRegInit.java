package ar3lang.dafang;

import ar3lang.dafang.block.DafangBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static ar3lang.dafang.block.RegisterBlock.*;
import static ar3lang.dafang.proxy.ClientProxy.*;

@Mod.EventBusSubscriber(modid = DafangConstruction.MODID)
public class ModelRegInit {
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void modelRegMetaInit(ModelRegistryEvent event){
        for (DafangBlock b: RegisterBufferHasMeta) {
            int i = 0;
            for (String nameVariant: b.variantType) {
                registerRenderVariant(b,i,nameVariant);
                i++;
            }
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void modelRegInit(ModelRegistryEvent event) {
    }
}
