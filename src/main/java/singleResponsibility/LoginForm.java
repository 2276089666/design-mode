package singleResponsibility;

/**
 * @Author ws
 * @Date 2021/3/7 18:03
 * @Version 1.0
 */
public class LoginForm {
    /**
     * 没有spring的自动注入,我们自己初始化一个
     */
    private UserDAO userDAO=new UserDAO();
    public void init(){
        System.out.println("初始化");
    }
    public void display(){
        System.out.println("显示");
    }

    public void validate(){
        userDAO.findUser(null,null);
    }
}
