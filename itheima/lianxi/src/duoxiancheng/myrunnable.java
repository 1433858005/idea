package duoxiancheng;
//myrunnable方式创建线程
public class myrunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0; i < 100; i++) {
//            System.out.println ("第二种线程实现方式"+i);
            //第二种线程获取名字的方式
            System.out.println (Thread.currentThread ().getName () + "第二种线程实现方式"+i);
            //问题·小明·小花名字式子搞不了啊
        }
    }
}
