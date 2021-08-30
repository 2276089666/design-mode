package mode.behavioral.mediator.colleague;

import mode.behavioral.mediator.Colleague;
import mode.behavioral.mediator.Mediator;

/**
 * @Author ws
 * @Date 2021/5/30 10:09
 */
public class CoffeePot extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("coffeePot");
    }

    public String doCoffeePot() {
        return "doCoffeePot";
    }
}
