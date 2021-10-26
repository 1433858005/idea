package io.file;

import java.io.File;

import java.io.IOException;
//在当前模块下的aaa文件夹中创建一个a.text文件
public class anli1 {
    public static void main(String[] args) throws IOException {
        File a=new File ( "lianxi\\aaa" );//在模块下操作
        //如果没路径直接报错·所以要创建路径但没用啊·直接写 a.mkdirs ();就算创建了aaa文件夹也不会报错
//        if (!a.exists ()){
////            a.mkdirs ();
////        }
        a.mkdirs ();
       File b=new File ( "lianxi\\aaa\\aa.text" );//在模块下操作
       b.createNewFile ();
    }
}
