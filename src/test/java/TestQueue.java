import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StopWatch;

import java.util.HashMap;
import java.util.Map;

public class TestQueue {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

        AmqpTemplate amqpTemplate = ac.getBean("amqpTemplate",AmqpTemplate.class);

        Map<String, Object> msg = new HashMap<>();
        msg.put("data", "hello,rabbitmq!");
        StopWatch watch = new StopWatch();
        watch.start("mq");
        for (int i = 0; i < 100000; i++) {
            amqpTemplate.convertAndSend("my.topic.exchange", "test321.hello.test123", msg);
        }
        watch.stop();
        System.out.println(watch.getTotalTimeMillis());
    }
}