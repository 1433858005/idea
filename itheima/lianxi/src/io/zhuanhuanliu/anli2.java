package io.zhuanhuanliu;
import java.io.*;
import java.util.ArrayList;
//第二种存到集合中的方式·
public class anli2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        student a=new student ("张三",23);
        student b=new student ("李四",24);
        student c=new student ("嘛五",25);
        ObjectOutputStream aa=new ObjectOutputStream ( new FileOutputStream ( "lianxi\\aaa\\e.txt" ) );
        ArrayList<student> qq=new ArrayList<> ();
        qq.add ( a );
        qq.add ( b );
        qq.add ( c );
//        aa.writeObject ( a );
//        aa.writeObject ( b );
 //       aa.writeObject ( c );
        //往本地文件中写的就是一个集合
        aa.writeObject ( qq );
        aa.close ();
        ObjectInputStream bb=new ObjectInputStream (new FileInputStream (  "lianxi\\aaa\\e.txt") );
        ArrayList<student> ww=(ArrayList<student>) bb.readObject ();
      for (student ee :ww){
          System.out.println (ee);
      }
        bb.close ();
    }
}
