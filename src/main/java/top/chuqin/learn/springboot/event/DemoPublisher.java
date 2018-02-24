package top.chuqin.learn.springboot.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @auther wengchuqin
 * @create 2018/2/24
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext context;

    public void publish(){
        context.publishEvent(new DemoEvent(this, "hello"));
    }
}
