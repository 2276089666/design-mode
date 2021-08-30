package mode.behavioral.mediator.colleague;

import mode.behavioral.mediator.Colleague;
import mode.behavioral.mediator.Mediator;

/**
 * @Author ws
 * @Date 2021/5/30 10:10
 */
public class Calender extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("calender");
    }

    public String doCalender() {
        return "doCalender";
    }
}
