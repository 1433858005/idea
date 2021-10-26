package duoxiancheng;
//接c.java
public class myrunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i=0; i < 100; i++) {
            try {
                Thread.sleep ( 1000 );//慢1秒
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            System.out.println (Thread.currentThread ().getName () + "第二种线程实现方式"+i);

        }
    }
}
