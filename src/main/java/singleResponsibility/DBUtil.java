package singleResponsibility;

/**
 * @Author ws
 * @Date 2021/3/7 17:57
 * @Version 1.0
 */
public class DBUtil {
    /**
     * 拿到连接(其实应该是静态的,返回值这里就不单独创建jdbc的连接了)
     */
    public void getConnection(){
        System.out.println("连接数据库");
    }
}
