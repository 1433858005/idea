package io.zhuanhuanliu;

import java.io.*;

public class b {
    public static void main(String[] args) throws IOException {
        //对象要被序列化·
        bb a=new bb ("张三","23");
        //对象操作流··写入数据进行加密  对象序列化流
        ObjectOutputStream c=new ObjectOutputStream ( new FileOutputStream ( "lianxi\\aaa\\a.txt"));
        c.writeObject ( a );
        c.close ();
    }
}
