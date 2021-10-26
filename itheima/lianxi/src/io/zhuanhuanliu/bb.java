package io.zhuanhuanliu;

import java.io.Serializable;
//类·
//如果想要这个类的对象能被序列化·那么这个类必须要实现一个接口·Serializable
////如果想要这个类的对象能被序列化,那么这个类必须要实现一个接口.Serializable
////Serializable接口的意义
////称之为是一个标记性接口,里面没有任何的抽象方法
//只要一个类实现了这个serializable接口,那么就表示这个类的对象可以被序列化
public class bb  implements Serializable {
    private String username;
    private String password;
    public bb() {
    }
    @Override
    public String toString() {
        return "bb{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username=username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password=password;
    }

    public bb(String username, String password) {
        this.username=username;
        this.password=password;
    }
}
