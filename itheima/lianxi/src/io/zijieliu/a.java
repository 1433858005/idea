package io.zijieliu;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class a {
        public static void main(String[] args) throws IOException {
            //  如果文件夹里没aa.txt会自动创建一个
            //true 加续写·如果原来的文件有内容会不清除·否则会删除以前的数据
        FileOutputStream aa=new FileOutputStream ( "lianxi\\aaa\\a.txt" ,true);
       // String a="那倒是";
       // aa.write( Integer.parseInt ( a ) );
            aa.write ( 88 );
            aa.write ( "\r\n".getBytes () );//“/r/n”换行字符串  getbuyes是转换为字节
            byte[] b={97,98,99};//创建  字节数组
            aa.write ( b );//写入
            aa.write ( "\r\n".getBytes () );
            byte [] c={97,98,99,100,101,102,103};
            aa.write ( c,1,2 );//从第一个索引开始·写2个   为98*99
            aa.close();//释放资源告诉系统·我不要这个文件了·不然在这之前文本处于操作状态不能删除
    }
}
