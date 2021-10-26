package io.zifuliu;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//将用户键盘录入的用户名和密码保存在本地文件中
public class anli {
    public static void main(String[] args) throws IOException {
        Scanner a=new Scanner (System.in);
        System.out.println ("请输入用户名");
        String b=a.next ();
        System.out.println ("请输入密码");
        String c=a.next ();
        FileWriter aa=new FileWriter ( "lianxi\\aaa\\b.txt" );
        aa.write ( b );
        aa.write ( "\r\n" );
        aa.write ( c );
        aa.flush ();
        aa.close ();
    }
}
