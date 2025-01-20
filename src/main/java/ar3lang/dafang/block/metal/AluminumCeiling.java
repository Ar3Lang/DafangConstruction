package ar3lang.dafang.block.metal;

import ar3lang.dafang.DafangConstruction;
import ar3lang.dafang.block.DafangBlock;
import ar3lang.dafang.block.RegisterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;

public class AluminumCeiling extends DafangBlock {
    public static final PropertyBool TOP = PropertyBool.create("top");
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    public AluminumCeiling(String name) {
        super(Material.IRON);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(DafangConstruction.ARCH_Tab);
        setHardness(1F);
        setSoundType(SoundType.METAL);
        setHarvestLevel("pickaxe",0);

        this.setDefaultState(this.blockState.getBaseState().withProperty(TOP, false).withProperty(FACING,EnumFacing.SOUTH));
        this.setCreativeTab(DafangConstruction.ARCH_Tab);

//        RegisterBlock.RegisterBufferHasMeta.add(this);
    }
    @Override
    public IBlockState getStateFromMeta(int meta){
        EnumFacing facing = EnumFacing.SOUTH;
        boolean top = false;
        switch (meta){
            case 0:
                break;
            case 1:
                facing = EnumFacing.NORTH;
                break;
            case 2:
                facing = EnumFacing.EAST;
                break;
            case 3:
                facing = EnumFacing.WEST;
                break;
            case 4:
                top = true;
                break;
            case 5:
                facing = EnumFacing.NORTH;
                top = true;
                break;
            case 6:
                facing = EnumFacing.EAST;
                top = true;
                break;
            case 7:
                facing = EnumFacing.WEST;
                top = true;
                break;
        }
        return this.getDefaultState()
                .withProperty(FACING,facing)
                .withProperty(TOP,top);
    }
    @Override
    public int getMetaFromState(IBlockState state) {
        int facing = 0;
        switch (state.getValue(FACING)) {
            case SOUTH:
                break;
            case NORTH:
                facing = 1;
                break;
            case EAST:
                facing = 2;
                break;
            case WEST:
                facing = 3;
                break;
            case UP:
            case DOWN:
            default:
                break;
        }
        int top = state.getValue(TOP) ? 4 : 0;
        return facing|top;
    }
    public void getSubBlocks(CreativeTabs creativeTabs, NonNullList<ItemStack> list) {
            list.add(new ItemStack(this, 1, 0));
            list.add(new ItemStack(this, 1, 1));
            list.add(new ItemStack(this, 1, 2));
            list.add(new ItemStack(this, 1, 3));
            list.add(new ItemStack(this, 1, 4));
            list.add(new ItemStack(this, 1, 5));
            list.add(new ItemStack(this, 1, 6));
            list.add(new ItemStack(this, 1, 7));
    }
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {TOP,FACING});
    }
}
