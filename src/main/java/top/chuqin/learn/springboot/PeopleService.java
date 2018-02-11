package top.chuqin.learn.springboot;

import org.springframework.stereotype.Service;

/**
 * @auther wengchuqin
 * @create 2018/2/11
 */
@Service
public class PeopleService {
    @AspectAction(name = "拦截add")
    public void add(){
        System.out.println("add People");
    }
}
