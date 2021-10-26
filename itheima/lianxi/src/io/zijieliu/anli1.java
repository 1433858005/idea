package io.zijieliu;

import java.io.*;

//复制文件·把panpan文件夹下的牛奶.jpg复制在aa文件夹里面·
public class anli1 {
    public static void main(String[] args) throws IOException {
        FileInputStream aa=new FileInputStream (  "c:\\panpan\\牛奶.jpg");
        FileOutputStream bb=new FileOutputStream ( "c:\\panpan\\aa\\9999.jpg" );
        int b;
        while ((b=aa.read())!=-1){
                  bb.write ( b );
        }
        aa.close ();
        bb.close ();
    }
}
