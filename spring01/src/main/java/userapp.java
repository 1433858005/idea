import ceshi01.user;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class userapp {
    public static void main(String[] args) {
        //2.加载配置文件
      ApplicationContext ctx=  new ClassPathXmlApplicationContext("applicationContext.xml");
       //3.获取资源
       user useraa =(user)ctx.getBean("useraa");
       useraa.save();

        
    }
}
