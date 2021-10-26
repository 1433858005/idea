package chouxianglei;

public class cat extends animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
    //;抽象类的子类要有所有父类中的抽象方法
    @Override
    public void kl() {
        System.out.println("汗滴禾下土");
    }
}