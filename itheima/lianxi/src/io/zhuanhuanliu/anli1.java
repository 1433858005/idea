package io.zhuanhuanliu;

import java.io.*;

//创建多个Javabean类对象写到文件中·再次读取到内存·
public class anli1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        student a=new student ("张三",23);
        student b=new student ("李四",24);
        student c=new student ("嘛五",25);
        ObjectOutputStream aa=new ObjectOutputStream ( new FileOutputStream ( "lianxi\\aaa\\e.txt" ) );
       aa.writeObject ( a );
       aa.writeObject ( b );
       aa.writeObject ( c );
       aa.close ();
        ObjectInputStream bb=new ObjectInputStream (new FileInputStream (  "lianxi\\aaa\\e.txt") );
        Object cc;
        while (true){
            try {
                Object dd=bb.readObject ();
                System.out.println (dd);
            } catch (EOFException e) {
               break;
            }
        }
        bb.close ();
    }
}
