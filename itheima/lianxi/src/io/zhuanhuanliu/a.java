package io.zhuanhuanliu;

import java.io.*;
import java.nio.charset.Charset;

public class a {
    public static void main(String[] args) throws IOException {
        //读取gbk形式的代码·因为d.txt是utf-8形式所以是乱码
        //jdk11之前
     //   InputStreamReader a=new InputStreamReader (new  FileInputStream("lianxi\\aaa\\d.txt"), Charset.forName ( "gbk" )  );
       //jdk11之后 可以不使用转换流·直接用charset.forname
        FileReader a=new FileReader ( "lianxi\\aaa\\d.txt" ,Charset.forName ( "gbk" ) );
        int b;
        while ((b=a.read ())!=-1){
            System.out.println ((char)b);
        }
        a.close ();
    }
}
