package mode.behavioral.mediator.colleague;

import mode.behavioral.mediator.Colleague;
import mode.behavioral.mediator.Mediator;

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