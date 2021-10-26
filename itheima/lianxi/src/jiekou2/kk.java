package jiekou2;
public interface kk  {
    //接口中可以定义非抽象类的方法·但要用default修饰
    public default void pp(){
        System.out.println("kk中pp里的代码");
    }
}
