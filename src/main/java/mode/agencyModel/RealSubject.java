package mode.agencyModel;

/**
 * @Author ws
 * @Date 2021/5/6 22:34
 * @Version 1.0
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("真正干活的");
    }
}
