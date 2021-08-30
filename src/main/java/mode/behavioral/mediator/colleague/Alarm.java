package mode.behavioral.mediator.colleague;

import mode.behavioral.mediator.Colleague;
import mode.behavioral.mediator.Mediator;

/**
 * @Author ws
 * @Date 2021/5/30 10:07
 */
public class Alarm extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("alarm");
    }

    public String doAlarm() {
       return "doAlarm";
    }
}
