package jiekou2;
//接口直接可以继承
public interface oo extends kk,inter{
    @Override
    //当inter和kk中有相同方法·在oo继承时会报错·要oo自己创建pp方法并赋值
    default void pp() {
        System.out.println("oo中pp的方法");
    }
}
