package mode.structuralType.decorator;

/**
 * @Author ws
 * @Date 2021/5/30 12:31
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 4 + beverage.cost();
    }
}