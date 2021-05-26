package mode.memoMode;

/**
 * @Author ws
 * @Date 2021/5/26 22:20
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
