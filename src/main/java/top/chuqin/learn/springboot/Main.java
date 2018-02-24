package top.chuqin.learn.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.chuqin.learn.springboot.event.DemoPublisher;
import top.chuqin.learn.springboot.event.EventConfig;

/**
 * @auther wengchuqin
 * @create 2018/2/11
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish();
        context.close();
    }
}
