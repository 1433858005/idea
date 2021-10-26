package duoxiancheng;

import java.util.concurrent.Callable;
//连接d·线程调度
public  class callableddd  implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i=0; i < 100; i++) {
            System.out.println (Thread.currentThread ().getName ()+"运行"+i);
        }
        //返回值表示线程运行完后的结果
        return "运行完成";
    }
}
