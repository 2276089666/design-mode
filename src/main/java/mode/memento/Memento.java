package mode.memento;

/**
 * @Author ws
 * @Date 2021/5/26 22:20
 */
// 真正存储值的
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
