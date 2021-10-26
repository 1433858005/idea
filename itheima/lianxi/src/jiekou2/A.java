package jiekou2;
public class A {
    public static void main(String[] args) {
        q a=new q();
        a.aa();
        //调用cc（cc是静态方法）必须要用接口名调用
        inter.cc();
        //当父类和接口一起被q引用 里面有相同方法 会调用父类的方法
        a.ss();
        a.pp();
    }
}
class q  extends afuu implements oo {}
class afuu {
    public void ss(){
        System.out.println("父类代码");
    }
}
