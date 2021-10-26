package io.zijieliu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class b {
    public static void main(String[] args) throws IOException {
        FileInputStream a=new FileInputStream ( "lianxi\\aaa\\aa.text" );
       int read=a.read();//取出一个字节·循环只能为一个字节循环
        System.out.println ((char) read);  //char字节转换
        int bb;//字节流读取多个字节  如果是空则输出-1
        while ((bb=a.read ())!=-1){
            System.out.println ((char) bb);
        }
        a.close ();
    }
}
