package io.zifuliu;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class r {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输出流对象
        FileWriter bbb=new FileWriter ( "lianxi\\aaa\\a.text" );
        BufferedWriter a=new BufferedWriter ( bbb );
        //写出数据
        //写一个字符
        a.write(97);
        a.write(98);
        a.write(99);
        //符缓冲输出流特有换行效果
        a.newLine ();
        //写出一个字符数组
        char[] b={97,98,99,100,101};
        a.write ( b );
        a.write(99);
        //符缓冲输出流特有换行效果
        a.newLine ();
        //写出字符数组的一部分
        char[] c={97,98,99,100,101,102};
        a.write ( b,0,3 );
        //符缓冲输出流特有换行效果
        a.newLine ();
        //写一个字符串
        String cc="黑马程序员";
        a.write ( cc );
        //符缓冲输出流特有换行效果
        a.newLine ();
        //写一个字符串的一部分
        String dd="黑马程序员";
        a.write ( dd,0,2);
        //符缓冲输出流特有换行效果
        a.newLine ();
        //写数据的注意事项·写字符串int值97
        String ee="97";
        a.write ( ee );
        //释放资源
        a.close ();
    }
}
