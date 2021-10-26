package duoxiancheng;
//共有100张票·有三个窗口卖·
public class anli1 {
    public static void main(String[] args) {
        anli1a a=new anli1a ();
        Thread aa=new Thread (a);
        Thread bb=new Thread (a);
        Thread cc=new Thread (a);
        aa.setName ( "窗口1" );
        bb.setName ( "窗口2" );
        cc.setName ( "窗口3" );
        aa.start ();
        bb.start ();
        cc.start ();
    }
}
