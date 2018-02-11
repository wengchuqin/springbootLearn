package top.chuqin.learn.springboot;

import java.lang.annotation.*;

/**
 * @auther wengchuqin
 * @create 2018/2/11
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AspectAction {
    String name();
}
