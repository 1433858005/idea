package duoxiancheng;
//获取线程名称
public class threadbbb  extends Thread{
//使用第二种方式必须要构造这两个函数
    public threadbbb() {
    }
    public threadbbb(String name) {
        super ( name );
    }
//
    public void run(){
        for (int i=0; i < 100; i++) {
            System.out.println (getName ()+"@@@@"+i);
        }
    }
}
