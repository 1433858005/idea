package duoxiancheng;
//继承thread类的方式进行实现
public class thread extends Thread {

    //run是继承父类Hhread的方法进行重写
    public void run(){
        for (int i=0; i < 100; i++) {
            System.out.println ("线程进行"+i);
        }
    }
}
