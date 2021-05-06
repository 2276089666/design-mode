package mode.decorativePattern.decorator;

import mode.decorativePattern.Component;
import mode.decorativePattern.Decorator;

/**
 * @Author ws
 * @Date 2021/5/6 19:30
 * @Version 1.0
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }
    private void method(){
        System.out.println("加点颜色");
    }

    @Override
    public void operation() {
        method();
        super.operation();
    }
}
