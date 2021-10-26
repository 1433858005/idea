package io.huanchongliu;
import java.io.*;
//字节缓冲流
public class anli1 {
    public static void main(String[] args) throws IOException {
        //相当于底层创建8192字节的数组
        BufferedInputStream a=new BufferedInputStream ( new FileInputStream ( "c:\\panpan\\华尔街之狼_BD中英双字重制版.mp4" ) );
        //底层也创建了一个8192的数组
        BufferedOutputStream b=new BufferedOutputStream ( new FileOutputStream ( "c:\\panpan\\aa\\华尔街之狼4.mp4" ) );
        byte [] qq=new byte[10240];
        int c;  //本次读到的有限个个数·
        while ((c=a.read (qq))!=-1){
            b.write ( qq,0,c );
        }
        a.close ();
        b.close ();
    }
}
