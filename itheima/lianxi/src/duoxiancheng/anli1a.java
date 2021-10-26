package duoxiancheng;

public class anli1a implements Runnable{
    private int piao=100;
    private Object qqq=new Object ();//这个随便写
    @Override
    public void run() {
        while (true) {
            //同步代码块
            synchronized (qqq) {
                if (piao == 0) {
                    //卖完了
                    break;
                } else {
                    try {
                        Thread.sleep ( 100 );
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                    piao--;
                    System.out.println ( Thread.currentThread ().getName () + "在卖票，还剩下" + piao );
                }
            }
        }
    }
}
