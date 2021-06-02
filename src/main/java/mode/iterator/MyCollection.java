package mode.iterator;

/**
 * @Author ws
 * @Date 2021/6/2 9:18
 */
public interface MyCollection<E> {
    void add(E e);
    int size();
    Iterator iterator();
}
