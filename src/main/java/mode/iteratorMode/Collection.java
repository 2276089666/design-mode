package mode.iteratorMode;

/**
 * @Author ws
 * @Date 2021/5/26 20:58
 */
public interface Collection {
    Iterator iterator();
    Object get(int index);
    boolean add(Object data);
    int size();
}
