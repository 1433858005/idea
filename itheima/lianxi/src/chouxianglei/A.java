package chouxianglei;
//49定义猫类 eat(猫吃鱼) drink（喝水）狗类eat 肉 drink 喝水利用抽象类 animal 猫狗继承 抽象喝水方法
//控制台输出狗吃肉 喝水   猫吃鱼 喝水
public class A {
    public static void main(String[] args) {
        cat aa=new cat();
        aa.eat();
        aa.drink();
        aa.ko();
        dog bb=new dog();
        bb.eat();
        bb.drink();
    }
}