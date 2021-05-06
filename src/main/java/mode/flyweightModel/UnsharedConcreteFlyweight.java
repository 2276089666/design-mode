package mode.flyweightModel;

/**
 * @Author ws
 * @Date 2021/5/6 22:11
 * @Version 1.0
 */
public class UnsharedConcreteFlyweight extends Flyweight{
    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("不共享的具体Flyweight:" + extrinsic);
    }
}
