package top.chuqin.learn.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther wengchuqin
 * @create 2018/2/11
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHelloWord());

        context.close();
    }
}
