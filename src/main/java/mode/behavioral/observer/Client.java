package mode.behavioral.observer;

import mode.behavioral.observer.observers.Dad;
import mode.behavioral.observer.observers.Mom;
import mode.behavioral.observer.source.Child;
import mode.behavioral.observer.source.Daughter;

/**
 * @Author ws
 * @Date 2021/5/31 20:42
 */
public class Client {
    public static void main(String[] args) {
        // observer
        Mom mom = new Mom();
        Dad dad = new Dad();

        Thread t1 = new Thread(() -> {
            // source
            Child child = new Child();
            child.add(mom);
            child.add(dad);
            child.wakeUp();
        });

        Thread t2 = new Thread(() -> {
            // source
            Daughter daughter = new Daughter();
            daughter.add(mom);
            daughter.add(dad);
            daughter.play();
        });

        t1.start();
        t2.start();

    }
}
