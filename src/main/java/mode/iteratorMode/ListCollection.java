package mode.iteratorMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ws
 * @Date 2021/5/26 21:05
 */
public class ListCollection implements Collection{
    List list=new ArrayList();
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public Object get(int index) {
        return list.get(index);
    }

    @Override
    public boolean add(Object data) {
        list.add(data);
        return true;
    }

    @Override
    public int size() {
        return list.size();
    }
}
