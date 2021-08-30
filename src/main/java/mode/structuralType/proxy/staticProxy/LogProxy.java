package mode.structuralType.proxy.staticProxy;

/**
 * @Author ws
 * @Date 2021/6/1 10:36
 */
// 静态代理必须实现Subject接口才能对实现了Subject接口的类代理,无法达到通用
public class LogProxy implements Subject{
    private Subject subject;

    public LogProxy(Subject realSubject) {
        this.subject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("LogProxy: log.info.-----starting");
        subject.request();
        System.out.println("LogProxy: log.info.------end");
    }
}
