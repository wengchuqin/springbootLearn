package top.chuqin.learn.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.chuqin.learn.springboot.conditional.ConditionConfig;
import top.chuqin.learn.springboot.conditional.ListService;

/**
 * @auther wengchuqin
 * @create 2018/2/11
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(listService.showListCmd());
    }
}
