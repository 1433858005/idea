//// 1．程序的功能读取d:/test.txt文件内容并输出到控制台。
// import java.io.FileReader;
//// import java.io._________FileReader;//第1题：补充导入具体的类
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//    public class a {
//        public static void main(String[] args) {
//            //FileReader类从InputStreamReader类继承而来。该类按字符读取流中数据
//            FileReader fileReader = null;
//            try {
//                fileReader =new FileReader ( "d:/test.txt" );
//            } catch (FileNotFoundException e) {
//                //第2题：捕获文件未找到异常 FileNotFoundException
//                e.printStackTrace ();
//            }
//
//            try {
//                BufferedReader bufferedReader = new BufferedReader(_________fileReader);
//                //第3题：使用BufferedReader包装FileReader
//                String line;
//                line = bufferedReader._________readLine();
//                 //第4题：读取文件中一行内容
//                while (line != null)
//                {
//                    System.out.println(line);
//                    line = bufferedReader.readLine();
//                }
//                _________bufferedReader.close();
//                //第5题：关闭文件的输入流；
//            }catch (_________IOException e) {
//                //第6题：捕获IO异常
//                e.printStackTrace();
//            }
//            System.out.println("safds");
//        }
//}
