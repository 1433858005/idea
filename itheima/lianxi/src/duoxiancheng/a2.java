package duoxiancheng;
public class a2 {
    public static void main(String[] args) {
        //创建一个参数对象
        myrunnable a=new myrunnable ();
        //创建了一个线程对象·并把参数传递给这个线程·
        //在线程启动后执行的就是参数里面run方法
        Thread aa=new Thread (a);
        myrunnable b=new myrunnable ();
        Thread bb=new Thread (b);
        //开启线程
        aa.start ();
        bb.start ();
    }
}
