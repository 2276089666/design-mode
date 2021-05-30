package mode.mediator.colleague;

import mode.mediator.Colleague;
import mode.mediator.Mediator;

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
