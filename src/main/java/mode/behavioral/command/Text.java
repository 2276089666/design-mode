package mode.behavioral.command;

/**
 * @Author ws
 * @Date 2021/10/1 10:34
 */
public class Text {
    public StringBuilder value;

    public Text(StringBuilder value) {
        this.value = value;
    }

    public StringBuilder getValue() {
        return value;
    }

    public void setValue(StringBuilder value) {
        this.value = value;
    }
}
