package ar3lang.dafang;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

@Mod(modid = DafangConstruction.MODID, name = DafangConstruction.NAME, version = DafangConstruction.VERSION)
public class DafangConstruction
{
    //info
    public static final String MODID = "dafangconstruction";
    public static final String NAME = "Dafang Construction";
    public static final String VERSION = "1.0a";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
//        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    //setCreativeTab() here
    public static CreativeTabs ARCH_Tab = new CreativeTabs("DafangConstruction") {
        public @NotNull ItemStack createIcon() {
            return new ItemStack(Blocks.BRICK_BLOCK);
        }
    };
}
