package io.zhuanhuanliu;

import java.io.Serializable;
//anli1
public class student implements Serializable {
    private static final long  serialVersionUID=2L;
  //  private static final long serialVersionUID = 8683452581122892189L;

    private String name;
    private int age;

    public student() {
    }

    public student(String name, int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
