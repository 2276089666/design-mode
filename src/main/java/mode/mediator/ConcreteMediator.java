package mode.mediator;

import mode.mediator.colleague.Alarm;
import mode.mediator.colleague.Calender;
import mode.mediator.colleague.CoffeePot;
import mode.mediator.colleague.Sprinkler;

/**
 * @Author ws
 * @Date 2021/5/26 21:46
 */
public class ConcreteMediator extends Mediator {
    private Alarm alarm;
    private CoffeePot coffeePot;
    private Calender calender;
    private Sprinkler sprinkler;

    public ConcreteMediator(Alarm alarm, CoffeePot coffeePot, Calender calender, Sprinkler sprinkler) {
        this.alarm = alarm;
        this.coffeePot = coffeePot;
        this.calender = calender;
        this.sprinkler = sprinkler;
    }

    @Override
    public void doEvent(String eventType) {
        switch (eventType) {
            case "alarm":
                doAlarmEvent();
                break;
            case "coffeePot":
                doCoffeePotEvent();
                break;
            case "calender":
                doCalenderEvent();
                break;
            default:
                doSprinklerEvent();
        }
    }

    public void doAlarmEvent() {
        String alarm = this.alarm.doAlarm();
        String coffeePot = this.coffeePot.doCoffeePot();
        String calender = this.calender.doCalender();
        String sprinkler = this.sprinkler.doSprinkler();
        System.out.println(""+alarm+"->"+coffeePot+"->"+calender+"->"+sprinkler);
    }

    public void doCoffeePotEvent() {
        String coffeePot = this.coffeePot.doCoffeePot();
        String doSprinkler = this.sprinkler.doSprinkler();
        System.out.println(""+coffeePot+"->"+doSprinkler);
    }

    public void doCalenderEvent() {
        String calender = this.calender.doCalender();
        String alarm = this.alarm.doAlarm();
        System.out.println(""+calender+"->"+alarm);
    }

    public void doSprinklerEvent() {
        String sprinkler = this.sprinkler.doSprinkler();
        String calender = this.calender.doCalender();
        String coffeePot = this.coffeePot.doCoffeePot();
        System.out.println(""+sprinkler+"->"+calender+"->"+coffeePot);
    }
}
