package io.file;
import java.io.File;
public class c {
    public static void main(String[] args) {
        File f=new File ( "lianxi\\aaa" );
        boolean a =f.isFile ();//是否为文件
        boolean b =f.isDirectory ();//是否为目录
        String  c =f.getName ();//获取文件或目录名称
        boolean d =f.exists ();//判断文件或文件名是否存在
        System.out.println (a);
        System.out.println (b);
        System.out.println (c);
        System.out.println (d);
        File ff=new File ( "c:\\panpan" );
        File[] fff=ff.listFiles ();
        //返回路径名下的所有文件和文件夹名
        //路径名下的所有文件夹里的文件或文件夹不会显示；
        for (File path:fff){
            System.out.println (path);
        }
    }
}
