package io.zifuliu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//字符缓冲流·输出
public class e {
    public static void main(String[] args) throws IOException {
        BufferedReader a=new BufferedReader (new FileReader ( "lianxi\\aaa\\a.txt" )  );
        String aaa;
        //读取一行文字
        while ((aaa=a.readLine ())!=null){
            System.out.println (aaa);
        }
        a.close ();

    }
}
