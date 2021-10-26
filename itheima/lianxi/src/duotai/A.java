package duotai;

public class A {
    public static void main(String[] args) {
    //当前事物是    一个猫
        cat b=new cat();
    //当前事物是  一个动物
        //向上转型···父类引用指向子类对象
        animal a=new cat();
        //变量  编译看左边 执行看左边  //打印10
        System.out.println(a.aa);
        //方法 编译看左边 执行看右边 //打印子类的猫吃鱼
        a.eat();
       // 不能调用子类有的·父类没有的方法  除非用向下转型
        // a.aaa();
        cat q=(cat)a; //向下转型
        q.aaa();
    }
}
class animal{
    int aa=10;
public void eat(){
    System.out.println("动物吃饭");
}
}
class cat extends animal{
    int aa=20;
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void aaa(){
        System.out.println("猫中特有方法");
    }
}
class dog extends animal{
    public void eat(){
        System.out.println("狗吃肉");
    }
}