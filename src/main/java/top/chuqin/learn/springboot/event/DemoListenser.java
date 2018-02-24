package top.chuqin.learn.springboot.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @auther wengchuqin
 * @create 2018/2/24
 */
@Component
public class DemoListenser implements ApplicationListener<DemoEvent>{
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println(String.format("收到信息了:[%s]", demoEvent.getMsg()));
    }
}
