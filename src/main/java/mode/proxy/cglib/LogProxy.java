package mode.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author ws
 * @Date 2021/6/1 14:10
 */
public class LogProxy implements MethodInterceptor {

    public void logPrint(){
        System.out.println("LogProxy: log.info.-----starting");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // Object o生成的代理类
//        System.out.println(o.getClass().getSuperclass().getName());
        logPrint();
        Object res = methodProxy.invokeSuper(o, objects);
        return res;
    }
}
