package ar3lang.dafang.block.stone;

import ar3lang.dafang.DafangConstruction;
import ar3lang.dafang.block.RegisterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import org.jetbrains.annotations.NotNull;

public class GraniteRed extends Block {

    public static final PropertyEnum<GraniteRed.EnumType> VARIANT = PropertyEnum.create("variant", GraniteRed.EnumType.class);
    public GraniteRed(String name) {
        super(Material.ROCK);

        setTranslationKey(name);
        setRegistryName(name);
        setHardness(1F);
        setSoundType(SoundType.STONE);
        setHarvestLevel("pickaxe",0);

        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, GraniteRed.EnumType.DEFAULT));
        setCreativeTab(DafangConstruction.ARCH_Tab);

        RegisterBlock.RegisterBufferHasMeta.add(this);
    }

    public int damageDropped(@NotNull IBlockState state)
    {
        return state.getValue(VARIANT).getMetadata();
    }


    public void getSubBlocks(CreativeTabs creativeTabs,NonNullList<ItemStack> list)
    {
        for (GraniteRed.EnumType b : GraniteRed.EnumType.values())
        {
            list.add(new ItemStack(this, 1, b.getMetadata()));
        }
    }
    @Override
    public @NotNull IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(VARIANT, GraniteRed.EnumType.values()[meta]);
    }
    @Override
    public int getMetaFromState(IBlockState state)
    {
        return state.getValue(VARIANT).getMetadata();
    }

    protected @NotNull BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {VARIANT});
    }

    public static enum EnumType implements IStringSerializable
    {
        DEFAULT(0, "default", "granite_red"),
        BRICK1(1, "brick1", "granite_red_brick_1"),
        BRICK2(2, "brick2", "granite_red_brick_2"),
        BRICK3(3, "brick3", "granite_red_brick_3"),
        MATTE(4, "matte", "granite_red_matte"),
        POLISHED(5, "polished", "granite_red_polished"),
        TILE(6, "tile", "granite_red_tile"),
        MUSHROOM(7, "brick_mushroom", "granite_red_mushroom");

        private static final GraniteRed.EnumType[] META_LOOKUP = new GraniteRed.EnumType[values().length];
        private final int meta;
        private final String name;
        private final String translationKey;

        private EnumType(int meta, String name, String unlocalizedName)
        {
            this.meta = meta;
            this.name = name;
            this.translationKey = unlocalizedName;
        }

        public int getMetadata()
        {
            return this.meta;
        }

//        public String toString()
//        {
//            return this.name;
//        }

        public static GraniteRed.EnumType byMetadata(int meta)
        {
            if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }
            return META_LOOKUP[meta];
        }

        public @NotNull String getName()
        {
            return this.name;
        }

        public String getTranslationKey()
        {
            return this.translationKey;
        }

        static
        {
            for (GraniteRed.EnumType b : values())
            {
                META_LOOKUP[b.getMetadata()] = b;
            }
        }
    }
}
