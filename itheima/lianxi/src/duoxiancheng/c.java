package duoxiancheng;
//使得线程运行变慢///////线程休眠
public class c {
    public static void main(String[] args) {
        myrunnable2 a=new myrunnable2 ();
        Thread aa=new Thread (a);
        myrunnable2 b=new myrunnable2 ();
        Thread bb=new Thread (b);
        aa.start ();
        bb.start ();
    }
}
