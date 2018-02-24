package top.chuqin.learn.springboot.event;

import org.springframework.context.ApplicationEvent;

/**
 * @auther wengchuqin
 * @create 2018/2/24
 */
public class DemoEvent extends ApplicationEvent{
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
