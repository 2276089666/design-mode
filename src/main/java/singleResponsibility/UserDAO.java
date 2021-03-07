package singleResponsibility;

/**
 * @Author ws
 * @Date 2021/3/7 17:58
 * @Version 1.0
 */
public class UserDAO {
    /**
     * 没有spring的自动注入我们自己new一个
     */
    private DBUtil dbUtil=new DBUtil();
    public void findUser(String userName,String userPassword){
        dbUtil.getConnection();
        System.out.println("查询数据库,验证用户");
    }
}
