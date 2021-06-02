package mode.proxy.staticProxy;

/**
 * @Author ws
 * @Date 2021/5/6 22:36
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // 代理类和被代理类实现了同一个接口
        // 代理类有一个聚合,是被代理类的接口引用Subject subject
        // 达到代理套代理,实现静态代理(此处开始有点像装饰者模式了)
        TimeProxy proxy = new TimeProxy(new RealSubject());
        LogProxy logProxy = new LogProxy(proxy);
        logProxy.request();
    }
}
