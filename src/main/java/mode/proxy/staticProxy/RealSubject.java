package mode.proxy.staticProxy;

/**
 * @Author ws
 * @Date 2021/5/6 22:34
 * @Version 1.0
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("do something.....");
    }
}
