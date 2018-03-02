package top.chuqin.learn.springboot.domain;

/**
 * @author wengchuqin
 * 服务器向浏览器发送此类的消息
 */
public class WiselyResponse {
    private String responseMessage;
    public WiselyResponse(String responseMessage){
        this.responseMessage = responseMessage;
    }
    public String getResponseMessage(){
        return responseMessage;
    }
}