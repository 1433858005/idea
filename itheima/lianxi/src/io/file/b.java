package io.file;

import java.io.File;
import java.io.IOException;
//这是java的输入输出异常包，导入这个包，可以方便对你的程序的输入输入进行很好的检测，
// 如果程序涉及到的输入输出没有问题，程序正常运行；否则，在控制台可以抛出你的输入输出错误。

public class b {
    public static void main(String[] args) throws IOException {
        //创建文件夹和文件
        // chuangjianwenjian ();
     //  chuangjianwenjianjia ();
        //删除文件和文件夹
      //  shanchuwenjian ();
        //shanchuwenjianjia ();
    }

    private static void shanchuwenjianjia() {
        File f= new File ( "c:\\panpan\\aa\\ee\\ww" );
        boolean a=f.delete ();//删除文件夹ww
        System.out.println (a);
    }

    private static void shanchuwenjian() {
        File f= new File ( "c:\\panpan\\aaa.txt" );
        boolean a=f.delete ();//删除文件
        System.out.println (a);
    }

    private static void chuangjianwenjianjia() {
        File f=new File ( "c:\\panpan\\aa\\ee\\ww"  );
        boolean a=f.mkdirs ();
        System.out.println (a);
    }

    private static void chuangjianwenjian() throws IOException {
        File f=new File ( "c:\\panpan\\aaa.txt" );//创建文件
        boolean a =f.createNewFile();//这里会出错·选择import java.io.IOException;
        System.out.println (a);
    }

}
