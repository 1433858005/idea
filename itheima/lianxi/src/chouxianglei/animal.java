package chouxianglei;
import org.w3c.dom.ls.LSOutput;
//抽象类的定义 abstract
//将共性的行为（方法）抽取到父类之后·发现该方法的实现逻辑无法在父类中
//给出具体明确·该方法就可以定义为抽象方法·
public abstract class animal {
    public  abstract  void eat();//抽象方法的定义`不能实例化（不能创建方法）像空参构造一样·
    public void drink(){
      kk();
    }
    public void kk(){
        System.out.println("喝水");
    }
//*********************************************
    public void ko(){
        System.out.println("锄禾日当午");
        kl();
        System.out.println("谁知盘中餐");
    }
    public abstract void kl();//抽象方法的定义
    //首先这是一个共性的子类都有需求·
    //从这首诗理解·假如kl是小学考试填空题·你无法知道学生会在这个填啥（有对有错）
    public animal() { }//空参构造
}