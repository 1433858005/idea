import java.io.FileReader;
//import java.io._________FileReader;//第1题：补充导入具体的类
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
//程序的功能读取d:/test.txt文件内容并输出到控制台。
public class b {
    public static void main(String[] args)  {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("kaoshiti//a.txt");
        } catch (FileNotFoundException e) { //第2题：捕获文件未找到异常
            e.printStackTrace();//printStackTrace()方法的意思是：在命令行打印异常信息在程序中出错的位置及原因
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //第3题：使用BufferedReader包装FileReader
            String line;
            line = bufferedReader.readLine();//第4题：读取文件中一行内容
            while (line != null)
            {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close(); //第5题：关闭文件的输入流
        }catch (IOException e) {//第6题：捕获IO异常
            e.printStackTrace();
        }
        System.out.println("safds");
    }
}

