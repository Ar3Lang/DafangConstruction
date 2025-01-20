package ar3lang.dafang.block.stone.base;

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


public class VariantBase1 extends Block implements IBlockMeta {
    private static final PropertyEnum<EnumType1> VARIANT = PropertyEnum.create("variant", EnumType1.class);
    private String name;

    public VariantBase1(String name) {
        super(Material.ROCK);
        init(name);
    }
    private void init(String name) {
        setRegistryName(name);
        setTranslationKey(name);
        setHardness(1F);
        setSoundType(SoundType.STONE);
        setHarvestLevel("pickaxe", 0);
        setCreativeTab(DafangConstruction.ARCH_Tab);
        this.name = name;
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumType1.DEFAULT));
        RegisterBlock.RegisterBufferHasMeta.add(this);
    }

    public int damageDropped(@NotNull IBlockState state) {
        return state.getValue(VARIANT).getMetadata();
    }
    public void getSubBlocks(CreativeTabs creativeTabs, NonNullList<ItemStack> list) {
        for (EnumType1 b : EnumType1.values()) {
            list.add(new ItemStack(this, 1, b.getMetadata()));
        }
    }


    protected @NotNull BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {VARIANT});
    }
    @Override
    public @NotNull IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumType1.values()[meta]);
    }
    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(VARIANT).getMetadata();
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return this.name+
                "_"+
                EnumType1.getSpecialNameFromMeta(stack.getItemDamage());
    }

    @Override
    public String getDesc(ItemStack stack) {
        return getTranslationKey()+".desc";
    }


    public enum EnumType1 implements IStringSerializable {
        DEFAULT(0, "default"),
        BRICK1(1, "brick1"),
        BRICK2(2, "brick2"),
        BRICK3(3, "brick3"),
        MATTE(4, "matte"),
        POLISHED(5, "polished"),
        TILE(6, "tile"),
        MUSHROOM(7, "brick_mushroom");
        EnumType1(int meta, String specialName) {
            this.meta = meta;
            this.specialName = specialName;
        }
        private static final EnumType1[] META_LOOKUP = new EnumType1[values().length];
        static {
//            META_LOOKUP[01234] = EnumType1.DEFAULT...;
            for (EnumType1 b : values()) { META_LOOKUP[b.getMetadata()] = b; }
        }

        final int meta;
        final String specialName;

        public static String getSpecialNameFromMeta(int meta) {
            return values()[meta].getName();
//            for (EnumType1 e : EnumType1.values()) { if (e.meta == meta) return e.specialName; }
        }
        @Override
        public @NotNull String getName() {
            return specialName;
        }

        public int getMetadata() {
            return this.meta;
        }
    }
}


