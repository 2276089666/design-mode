package mode.flyweightModel;

/**
 * @Author ws
 * @Date 2021/5/6 22:10
 * @Version 1.0
 */
public class ConcreteFlyweight extends Flyweight{
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("具体Flyweight:" + extrinsic);
    }
}
