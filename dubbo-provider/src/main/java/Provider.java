import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by morriswang on 3/17/19.
 */
public class Provider {
    public static void main(String[] args){
        System.out.println("begin...");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println("context name: "  + context.getDisplayName());
        context.start();
        System.out.println("服务已启动。。。。。");

        while (true) {

        }
    }
}
