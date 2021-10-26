package io.zijieliu;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//完美解决传输速度慢的问题
public class anli2 {
    public static void main(String[] args) throws IOException {
        FileInputStream aa=new FileInputStream (  "c:\\panpan\\华尔街之狼_BD中英双字重制版.mp4");
        FileOutputStream bb=new FileOutputStream ( "c:\\panpan\\aa\\华尔街之狼3.mp4" );
        byte[] qq=new byte[40960];
        int b;
        while ((b=aa.read(qq))!=-1){
            bb.write ( qq ,0,b);
        }
        aa.close ();
        bb.close ();
    }
}
