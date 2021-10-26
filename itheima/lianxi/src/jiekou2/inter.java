package jiekou2;

public interface inter {
    //接口中定义非抽象方法 用default修饰
     default void aa(){
        System.out.println("aa执行了");
        bb();
    }
    //私有bb方法
  private void bb(){
        System.out.println("bb里的代码");
    }
    //接口允许定义静态方法  要用接口名调用
    static void cc(){
        System.out.println("cc执行了");
        dd();
    }
    //静态方法只能只能调用静态方法·cc调用dd使dd变成静态方法
   //私有dd方法
    private static void dd(){
        System.out.println("dd里的代码");
    }
    public default void ss(){
        System.out.println("接口代码");
    }
    public default void pp(){
        System.out.println("intr中pp里的代码");
    }
}
