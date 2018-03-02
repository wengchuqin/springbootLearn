package top.chuqin.learn.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wengchuqin
 * @create 2018/2/26
 */
@RestController
public class JsonController {
    @RequestMapping("/getJson")
    public Map<String, Object> getJson() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "楚钦");
        map.put("age", 23);
        return map;
    }
}
