package duoxiancheng;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class a3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       //线程开启后需要执行里面的call方法
        callable a=new callable ();
        //可以获取线程完毕的结果。也可以作为参数传递给thread对象
        FutureTask<String> b= new FutureTask ( a );
        //创建线程对象
        Thread aa=new Thread (b);
        aa.start ();
        //获取线程运行后的结果·如果线程还没有运行结束·那么get方法会在这等
        String c=b.get ();
        System.out.println (c);
    }
}
