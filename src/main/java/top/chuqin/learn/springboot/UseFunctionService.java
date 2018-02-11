package top.chuqin.learn.springboot;

/**
 * @auther wengchuqin
 * @create 2018/2/11
 */
public class UseFunctionService {
    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String sayHelloWord(){
        return functionService.sayHello("word");
    }
}
