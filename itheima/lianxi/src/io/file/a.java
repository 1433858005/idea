package io.file;

import java.io.File;

public class a {
    public static void main(String[] args) {
        //3种创建file的方法(只是传入路径·没啥大用)
        aaa ();
        bbb ();
        ccc ();
    }

    private static void ccc() {
        File f=new File ( "c:\\panpan" );
        String dd="a.txt";
        File ff=new File ( f,dd );//从父抽象名和字路径名字符串创建
        System.out.println (ff);
    }

    private static void bbb() {
        String bb="c:\\panpan";
        String cc="a.txt";
        File f=new File ( bb,cc );//父路径名和子路径名字符串创建
        System.out.println (f);//打印出路径名c:\panpan\a.txt
    }

    private static void aaa() {
        String aa = "c:\\panpan\\a.txt";//用字符串的形式抽象为路径名
        File f = new File (aa);
        System.out.println (f);/* 打印出路径名 */
    }
}
