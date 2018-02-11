package top.chuqin.learn.springboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @auther wengchuqin
 * @create 2018/2/11
 */
@Configuration
@ComponentScan("top.chuqin.learn.springboot")
@EnableAspectJAutoProxy
public class AopConfig {

}
