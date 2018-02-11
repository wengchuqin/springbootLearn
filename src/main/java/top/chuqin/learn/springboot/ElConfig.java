package top.chuqin.learn.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @auther wengchuqin
 * @create 2018/2/11
 */
@Configuration
@ComponentScan("top")
@PropertySource("classpath:test.properties")
public class ElConfig {
    @Value("normal")
    private String normal;

//    @Value("#{systemProperties[os.name]}")
    private String osName;

    /*
     * 从其他Bean获取属性
     */
    @Value("#{demoService.another}")
    private String fromAnother;

    /*
     * 从资源文件获取属性
     */
    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(fromAnother);
        System.out.println(bookName);
        System.out.println(environment);
    }
}
