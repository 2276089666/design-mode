package mode.singletonMode;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author ws
 * @Date 2021/4/19 17:04
 * @Version 1.0
 */
public class SingletonBuilder {
    /// volatile解决线程可见和指令重排,避免对象创建的3大主要过程乱序:1.new(申请空间变量,会有默认值) 2.invokeSpecial(调用构造函数赋初值) 3.astore(建立栈中和堆中的引用连接)
    // 当2和3乱序时就会出现问题
    private static volatile Singleton singleton=null;
    public static Singleton getSingleton(){
        if (singleton==null){    // 避免一上来就锁竞争,DCL double check lock
            synchronized (SingletonBuilder.class){
                if (singleton==null){
                    try {
                        Class<Singleton> singletonClass = Singleton.class;
                        Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();
                        // 对于私有构造函数的对象我们利用反射拿到最高访问权限,创建对象
                        declaredConstructor.setAccessible(true);
                        singleton=declaredConstructor.newInstance();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return singleton;
    }
}
