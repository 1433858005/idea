package ceshi;

public class student {//方法构造

    private String name;
    private int age;

    public student() {  //无参构造
    }

    public student(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }
}
