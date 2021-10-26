package io.zhuanhuanliu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class b2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //读出·解密  对象反序列化
        ObjectInputStream a=new ObjectInputStream ( new FileInputStream ( "lianxi\\aaa\\a.txt" ) );
        bb c=(bb) a.readObject ();
        System.out.println (c);
        a.close ();
    }
}
