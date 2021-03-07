package singleResponsibility;

/**
 * @Author ws
 * @Date 2021/3/7 18:07
 * @Version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.init();
        loginForm.validate();
        loginForm.display();
    }
}
