import com.alibaba.fastjson.JSON;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by morriswang on 3/19/19.
 */
public class Consumer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        applicationContext.start();
        DemoService demoService = applicationContext.getBean(DemoService.class);
        System.out.println(JSON.toJSONString(demoService.getNames()));
    }
}
