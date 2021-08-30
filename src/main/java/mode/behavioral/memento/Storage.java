package mode.behavioral.memento;

/**
 * @Author ws
 * @Date 2021/5/26 22:23
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

}
