package mode.mediator.colleague;

import mode.mediator.Colleague;
import mode.mediator.Mediator;

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
