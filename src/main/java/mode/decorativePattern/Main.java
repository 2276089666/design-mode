package mode.decorativePattern;

import mode.decorativePattern.decorated.ConcreteComponent;
import mode.decorativePattern.decorator.ConcreteDecoratorA;

/**
 * @Author ws
 * @Date 2021/5/6 19:33
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(concreteComponent);
        concreteDecoratorA.operation();
    }
}
