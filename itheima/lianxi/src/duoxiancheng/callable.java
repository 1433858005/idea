package duoxiancheng;

import java.util.concurrent.Callable;

public  class callable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i=0; i < 100; i++) {
            System.out.println ("运行"+i);
        }
        //返回值表示线程运行完后的结果
        return "运行完成";
    }
}
