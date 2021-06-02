package mode.proxy.staticProxy;

/**
 * @Author ws
 * @Date 2021/5/6 22:33
 * @Version 1.0
 */
// 静态代理必须实现Subject接口才能对实现了Subject接口的类代理,无法达到通用
public class TimeProxy implements Subject{
    private Subject subject;

    public TimeProxy(Subject realSubject) {
        this.subject = realSubject;
    }
    @Override
    public void request() {
        long start = System.currentTimeMillis();
        subject.request();
        System.out.println("TimeProxy: do something cost time is:\t"+(System.currentTimeMillis()-start));
    }
}
