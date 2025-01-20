package ar3lang.dafang.block.stone;

import ar3lang.dafang.block.stone.base.VariantBase1;


public class GraniteYellowrust extends VariantBase1 {
    public GraniteYellowrust(String name) {
        super(name);
    }
}
//public class GraniteYellowrust extends VariantBase1
//{

//    public static final PropertyEnum<VariantBase1.EnumType1> VARIANT = PropertyEnum.create("variant", VariantBase1.EnumType1.class);
//    public GraniteYellowrust(String name) {
//        super(name);
//    }
//
//    public int damageDropped(@NotNull IBlockState state)
//    {
//        return state.getValue(VARIANT).getMetadata();
//    }
//
//
//    public void getSubBlocks(CreativeTabs creativeTabs,NonNullList<ItemStack> list)
//    {
//        for (EnumType1 b : EnumType1.values())
//        {
//            list.add(new ItemStack(this, 1, b.getMetadata()));
//        }
//    }
//    @Override
//    public @NotNull IBlockState getStateFromMeta(int meta)
//    {
//        return this.getDefaultState().withProperty(VARIANT, EnumType1.values()[meta]);
//    }
//    @Override
//    public int getMetaFromState(IBlockState state)
//    {
//        return state.getValue(VARIANT).getMetadata();
//    }
//
//    protected @NotNull BlockStateContainer createBlockState()
//    {
//        return new BlockStateContainer(this, new IProperty[] {VARIANT});
//    }
//    public enum EnumType1
//    {
//        DEFAULT(0, "default", +name),
//        BRICK1(1, "brick1", "granite_yellowrust_brick_1"),
//        BRICK2(2, "brick2", "granite_yellowrust_brick_2"),
//        BRICK3(3, "brick3", "granite_yellowrust_brick_3"),
//        MATTE(4, "matte", "granite_yellowrust_matte"),
//        POLISHED(5, "polished", "granite_yellowrust_polished"),
//        TILE(6, "tile", "granite_yellowrust_tile"),
//        MUSHROOM(7,"brick_mushroom","granite_yellowrust_mushroom");
//
//        private static final EnumType1[] META_LOOKUP = new EnumType1[values().length];
//        private final int meta;
//        private final String name;
//        private final String translationKey;
//
//        private EnumType1(int meta, String name, String unlocalizedName)
//        {
//            this.meta = meta;
//            this.name = name;
//            this.translationKey = unlocalizedName;
//        }
//
//        public int getMetadata()
//        {
//            return this.meta;
//        }
//
////        public String toString()
////        {
////            return this.name;
////        }
//
//        public static EnumType1 byMetadata(int meta)
//        {
//            if (meta < 0 || meta >= META_LOOKUP.length)
//            {
//                meta = 0;
//            }
//
//            return META_LOOKUP[meta];
//        }
//
//        public @NotNull String getName()
//        {
//            return this.name;
//        }
//
//        public String getTranslationKey()
//        {
//            return this.translationKey;
//        }
//
//        static
//        {
//            for (EnumType1 blockstone$enumtype : values())
//            {
//                META_LOOKUP[blockstone$enumtype.getMetadata()] = blockstone$enumtype;
//            }
//        }
//    }
//}