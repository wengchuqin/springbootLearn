package top.chuqin.learn.springboot.conditional;

/**
 * @auther wengchuqin
 * @create 2018/2/24
 */
public class WindowsListService implements ListService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}
