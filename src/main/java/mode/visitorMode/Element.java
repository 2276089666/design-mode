package mode.visitorMode;

/**
 * @Author ws
 * @Date 2021/5/27 12:33
 */
public interface Element {
    void accept(Visitor visitor);
}
