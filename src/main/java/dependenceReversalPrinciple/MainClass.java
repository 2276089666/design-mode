package dependenceReversalPrinciple;

import principleOfOpeningAndClosing.AbstractButton;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * @Author ws
 * @Date 2021/3/14 20:21
 * @Version 1.0
 */
public class MainClass {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties properties = new Properties();
        // 使用InPutStream流读取properties文件
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\main\\java\\dependenceReversalPrinciple\\config.properties"));
        properties.load(bufferedReader);

        // 获取key对应的value值
        String sourceName = properties.getProperty("sourceName");
        //要类的全限定名,这里我把包名写死
        Class<?> aClass = Class.forName("dependenceReversalPrinciple.source." + sourceName);
        //拿到无参构造函数
        Constructor<?> aconstructor = aClass.getConstructor();
        //创建各种button的实例,并将我们的虚基类的引用指向他
        AbstractSource abstractSource = (AbstractSource) aconstructor.newInstance();
        abstractSource.Source();


        String transformerName = properties.getProperty("transformerName");
        //要类的全限定名,这里我把包名写死
        Class<?> bClass = Class.forName("dependenceReversalPrinciple.transformer." + transformerName);
        //拿到无参构造函数
        Constructor<?> bconstructor = bClass.getConstructor();
        //创建各种button的实例,并将我们的虚基类的引用指向他
        AbstractTransformer abstractTransformer = (AbstractTransformer) bconstructor.newInstance();

        abstractTransformer.transformer();
    }
}
