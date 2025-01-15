package ar3lang.dafang.block.cloth;

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

public class FlatFabricVintage extends Block {
    public static final PropertyEnum<FlatFabricVintage.EnumType> VARIANT = PropertyEnum.create("variant", FlatFabricVintage.EnumType.class);
    public FlatFabricVintage(String name)
    {
        super(Material.CLOTH);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(DafangConstruction.ARCH_Tab);
        setHardness(1F);
        setSoundType(SoundType.CLOTH);
        setHarvestLevel("shear",0);
        setHarvestLevel("axe",0);

        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, FlatFabricVintage.EnumType.DEFAULT));
        this.setCreativeTab(DafangConstruction.ARCH_Tab);

        RegisterBlock.RegisterBufferHasMeta.add(this);
    }

    public int damageDropped(@NotNull IBlockState state)
    {
        return state.getValue(VARIANT).getMetadata();
    }
    public void getSubBlocks(CreativeTabs creativeTabs, NonNullList<ItemStack> list)
    {
        for (FlatFabricVintage.EnumType b : FlatFabricVintage.EnumType.values())
        {
            list.add(new ItemStack(this, 1, b.getMetadata()));
        }
    }
    @Override
    public @NotNull IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(VARIANT, FlatFabricVintage.EnumType.values()[meta]);
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
        DEFAULT(0, "pale", "flatfabric_pale"),//75878a 苍色
        CARROT(1,"carrot","flatfabric_carrot"),//f79078 胡罗贝
        LOTUS(2, "lotus", "flatfabric_lotus"),//edd1d8 藕色
        MARIGOLD(3,"marigold","flatfabric_marigold"),//fcc307 金盏黄
        FAINTYELLOW(4,"faintyellow","flatfabric_faintyellow"),//f8e58c 淡黄
        LIME(5,"lime","flatfabric_lime"),//b8d200 黄绿
        MINT(6,"mint","flatfabric_mint"),//#98fd97 薄荷绿
        EMERALD(7,"emerald","flatfabric_emerald"),//38b48b 翡翠色
        OMESHICHA(8,"omeshicha","flatfabric_omeshicha"),//43676b 御召茶
        BRIGHT(9, "bright", "flatfabric_bright"),//e3f9fd 莹白
        NEONBLUE(10,"neonblue","flatfabric_neonblue"),//04d9ff 霓虹蓝
        ULTRAMARINE(11,"ultramarine","flatfabric_ultramarine"),//4c6cb3 群青
        LILAC(12, "lilac", "flatfabric_lilac"),//cca4e3 丁香
        WISTERIA(13,"wisteria","flatfabric_wisteria"),//a59aca 紫藤
        GRAPE(14, "grape", "flatfabric_grape"),//725e82 乌色
        YANHONG(15, "yanhong", "flatfabric_yanhong");//#854c51 烟红

        private static final FlatFabricVintage.EnumType[] META_LOOKUP = new FlatFabricVintage.EnumType[values().length];
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
        public static FlatFabricVintage.EnumType byMetadata(int meta)
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
            for (FlatFabricVintage.EnumType blockstone$enumtype : values())
            {
                META_LOOKUP[blockstone$enumtype.getMetadata()] = blockstone$enumtype;
            }
        }
    }
}