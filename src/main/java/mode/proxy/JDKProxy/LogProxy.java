package mode.proxy.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author ws
 * @Date 2021/6/1 12:55
 */
public class LogProxy implements InvocationHandler
{
    Object object;  // 被代理的对象Object,达到通用


    public LogProxy(Object object) {
        this.object = object;
    }

    public void logPrint(){
        System.out.println("LogProxy: log.info.-----starting");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 生成的代理类
//        System.out.println(proxy.getClass().getName()+" ======\t"+proxy.getClass().getInterfaces()[0].getName());
        logPrint();
        Object invoke = method.invoke(object, args);
        return invoke;
    }
}
