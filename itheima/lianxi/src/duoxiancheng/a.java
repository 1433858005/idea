package duoxiancheng;
//多线程主方法·多线程是随机的·打印结果每次不一样
public class a {
    public static void main(String[] args) {
        //第一个线程
        thread c=new thread ();
        //第二个线程
        thread b=new thread ();
        //开启第一个线程
        c.start ();
        //开启第二个线程
        b.start ();
    }
}
