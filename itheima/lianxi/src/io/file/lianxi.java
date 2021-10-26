package io.file;

import java.io.File;
import java.io.IOException;

//50.io流·创建一个文件夹“qqq\www\eee”在io流模块下·在eee文件夹下创建aa.txtwww文件夹下创建 bb.txt的文件·删除aa.txt文件删除eee文件夹
public class lianxi {
    public static void main(String[] args) throws IOException {
        File a=new File ( "lianxi\\qqq\\www\\eee" );
        a.mkdirs ();
        File b=new File ( "lianxi\\qqq\\www\\eee\\aa.txt" );
        File c=new File ( "lianxi\\qqq\\www\\bb.txt" );
        b.createNewFile ();
        c.createNewFile ();
        System.out.println ( b.isFile () );
        System.out.println ( b.isDirectory () );
        System.out.println ( a.isFile () );
        System.out.println ( a.isDirectory () );
        System.out.println ( a.getName () );
        b.delete ();
        a.delete ();
        System.out.println ( a.exists () );
        System.out.println ( c.exists () );
        File ff=new File ( "lianxi");
        File[] fff=ff.listFiles ();
        for (File path:fff){
            System.out.println (path);
        }
    }
}
