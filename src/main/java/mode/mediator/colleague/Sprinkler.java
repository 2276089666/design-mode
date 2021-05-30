package mode.mediator.colleague;

import mode.mediator.Colleague;
import mode.mediator.Mediator;

/**
 * @Author ws
 * @Date 2021/5/30 10:10
 */
public class Sprinkler extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("sprinkler");
    }

    public String doSprinkler() {
        return "doSprinklers";
    }
}