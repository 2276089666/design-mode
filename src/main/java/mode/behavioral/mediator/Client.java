package mode.behavioral.mediator;

import mode.behavioral.mediator.colleague.Alarm;
import mode.behavioral.mediator.colleague.Calender;
import mode.behavioral.mediator.colleague.CoffeePot;
import mode.behavioral.mediator.colleague.Sprinkler;

/**
 * @Author ws
 * @Date 2021/5/26 21:50
 */

/**
 * 解决系统内部间事件相互调用的复杂性，将复杂的依赖结构变成星形结构
 */
public class Client {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        CoffeePot coffeePot = new CoffeePot();
        Calender calender = new Calender();
        Sprinkler sprinkler = new Sprinkler();
        Mediator mediator = new ConcreteMediator(alarm, coffeePot, calender, sprinkler);
        // 闹钟事件到达，调用中介者就可以操作相关对象
        alarm.onEvent(mediator);

        System.out.println("===============");
        sprinkler.onEvent(mediator);
    }
}
