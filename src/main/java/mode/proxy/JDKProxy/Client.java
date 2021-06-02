package mode.proxy.JDKProxy;

import java.lang.reflect.Proxy;

/**
 * @Author ws
 * @Date 2021/6/1 13:00
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 如果想让LogProxy可以重用，不仅可以代理Tank，还可以代理任何其他可以代理的类型
         * （毕竟日志记录，时间计算是很多方法都需要的东西），这时该怎么做呢？
         * 分离代理行为与被代理对象
         * 使用jdk的动态代理
         */
        Subject realSubject = new RealSubject();
        // 把动态代理的那个类生成出来,src目录下$Proxy0.class
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), new Class[]{Subject.class}, new LogProxy(realSubject));
        proxyInstance.request();

        // 此时LogProxy可以复用了
        Subject2 realSubject2 = new RealSubject2();
        Subject2 proxyInstance1 = (Subject2) Proxy.newProxyInstance(RealSubject2.class.getClassLoader(), new Class[]{Subject2.class}, new LogProxy(realSubject2));
        int play = proxyInstance1.play();
        System.out.println(play);
    }
}
