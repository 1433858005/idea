package duoxiancheng;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
//线程调度
public class d {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
      //setPriority优先级1-10
        callableddd a=new callableddd ();
        FutureTask<String> b= new FutureTask ( a );
        Thread aa=new Thread (b);
        aa.setName ( "飞机" );
        aa.setPriority ( 1 );
        aa.start ();
        int c=aa.getPriority ();
        System.out.println (c);
        ////////////////////////
        callableddd q=new callableddd ();
        FutureTask<String> w= new FutureTask ( q );
        Thread bb=new Thread (w);
        bb.setName ( "坦克" );
        bb.setPriority ( 9);
        bb.start ();
        int cc=bb.getPriority ();
        System.out.println (cc);
    }
}
