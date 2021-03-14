package principleOfOpeningAndClosing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * @Author ws
 * @Date 2021/3/14 19:26
 * @Version 1.0
 */
public class LoginForm {
    private AbstractButton button = null;

    public void display() throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties properties = new Properties();
        // 使用InPutStream流读取properties文件
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\main\\java\\principleOfOpeningAndClosing\\config.properties"));
        properties.load(bufferedReader);
        // 获取key对应的value值
        String className = properties.getProperty("className");
//        System.out.println(className);
        //要类的全限定名,这里我把包名写死
        Class<?> aClass = Class.forName("principleOfOpeningAndClosing.button." + className);
        //拿到无参构造函数
        Constructor<?> constructor = aClass.getConstructor();
        //创建各种button的实例,并将我们的虚基类的引用指向他
        button = (AbstractButton) constructor.newInstance();
        button.view();
    }
}

