package staticfangfa;

public class jintai {
    public static void main(String[] args) {
        student.school="传智学院";//static可以类名调用也可以对象名进行调用
        student a=new student ();
        //student.school="传智学院";static优先对象存在·但测试中不优先也可用
        a.name="张三";//非静态对象只能对象调用
        a.age=23;
        a.show ();
        student bb=new student ();//每创建一个对象就对类的方法进行构造一次
        bb.show ();//此时没有对student类中的数据赋值都为空·
                   // 但是school是静态类·被所有的对象共享
                   //这里被bb这个对象共享
        extracted ();//静态方法中只能调用静态方法
    }

    private static void extracted() {
        System.out.println (1112);
    }
}
