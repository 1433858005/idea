package io.zifuliu;
import java.io.FileNotFoundException;//filereader异常调用，当有了IOException就没用了
// IOException是总的异常包 包含了这个包
import java.io.FileReader;//filereader调用包
import java.io.IOException;//io总异常
//异常有两种解决方式·要么抛出异常·要么用try catch
public class w {
    public static void main(String[] args) throws IOException {
        //创建字符输出流的对象
        //filereader有异常·需要抛出异常
        FileReader a=new FileReader ( "lianxi\\aaa\\a.txt" );
        int b;
        while ((b=a.read ())!=-1){
            System.out.println ((char)b);
        }
        a.close ();
    }
}
