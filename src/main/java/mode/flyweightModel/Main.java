package mode.flyweightModel;

/**
 * @Author ws
 * @Date 2021/5/6 22:13
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Flyweight flyweight = FlyweightFactory.getFlyweight("1");
        flyweight.operate(5);

        Flyweight flyweight2 = FlyweightFactory.getFlyweight("1");
        flyweight.operate(6);

        Flyweight unsharedFlyweight = new UnsharedConcreteFlyweight("1");
        unsharedFlyweight.operate(10);
    }
}
