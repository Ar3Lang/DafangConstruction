package ar3lang.dafang.block.stone.base;

@FunctionalInterface
public interface IBlockMeta {
    /*
    这个方法需要开发者手动绑定枚举类，并手动在构造方法里调用，来对DafangBlock类的数组进行写入。
    例：
    @Override
    public void writeVariantType() {
        for (EnumType1 s: EnumType1.values()) {variantType.add(s.getName());}
    }
     */
    void writeVariantType();
}
