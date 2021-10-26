package ceshi;

public class student2 {
   // 利用private·私有年龄和姓名· 用面向对象进行设置名字·年龄·并在创建方法中设置打印名字年龄 最后在主方中设置打印名字+“...”+年龄
    private String name;
    private int age;
 public void abc(){
     System.out.println( getName()+".........."+getAge());

 }
    public student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
