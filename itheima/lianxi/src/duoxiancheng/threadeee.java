package duoxiancheng;
//辅助线程·第二个线程
public class threadeee extends Thread {
    //为了使效果明显把i<1000
    public void run(){
        for (int i=0; i < 1000; i++) {
            System.out.println (getName ()+"我是辅助线程"+i);
        }
    }
}
