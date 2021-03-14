package principleOfOpeningAndClosing;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author ws
 * @Date 2021/3/14 19:45
 * @Version 1.0
 */
public class MainClass {
    public static void main(String[] args) throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        LoginForm loginForm = new LoginForm();
        loginForm.display();
    }
}
