package io.zifuliu;
import java.io.*;
import java.util.Arrays;
//读取文件中的数据·排序后再次写到本地
public class anli2 {
    public static void main(String[] args) throws IOException {
        //读取本地文件夹
       BufferedReader a=new BufferedReader ( new FileReader ( "lianxi\\aaa\\c.txt" ) );
       String b=a.readLine ();
       System.out.println ("读取到的数据为"+b);
        a.close ();
        //按照空格进行切换
        String[] c=b.split ( " " );
       //把字符串类型的数组变成int类型
        int [] d=new int[c.length];
        //遍历d数组·可以进行类型转换
        for (int i=0; i < c.length; i++) {

            String e=c[i];
            //类型转换
            int f=Integer.parseInt ( e );
            //把转换后的结果存入d数组中
            d[i]=f;
        }
        //进行排序
        Arrays.sort ( d );
        System.out.println (Arrays.toString ( d ));
        //把排序后的结果写入到本地
        BufferedWriter qq=new BufferedWriter ( new FileWriter ( "lianxi\\aaa\\c.txt" ) );
        for (int i=0; i < d.length; i++) {
            qq.write ( d[i] +" ");
            qq.flush ();
        }
        qq.close ();
    }
}
