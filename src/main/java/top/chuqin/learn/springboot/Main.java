package top.chuqin.learn.springboot;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.chuqin.learn.springboot.profile.DemoBean;
import top.chuqin.learn.springboot.profile.ProfileConfig;

/**
 * @auther wengchuqin
 * @create 2018/2/11
 */
public class Main {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();
    }

    /**
     * @author wengchuqin
     * 设置系统参数 -Dspring.profiles.active=dev
     */
    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();
    }
}
