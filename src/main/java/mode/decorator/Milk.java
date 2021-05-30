package mode.decorator;

/**
 * @Author ws
 * @Date 2021/5/30 12:31
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 3 + beverage.cost();
    }
}
