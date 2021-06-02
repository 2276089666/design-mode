package mode.iterator;

import java.util.Arrays;

/**
 * @Author ws
 * @Date 2021/6/2 9:28
 */
public class MyArrayList<E> implements MyCollection<E> {

    Object[] elementData;
    private int pos;

    public MyArrayList() {
        elementData = new Object[10];
    }

    public MyArrayList(int initSize) {
        if (initSize > 0) {
            elementData = new Object[initSize];
        } else {
            throw new UnsupportedOperationException("容量不能小于0");
        }
    }

    @Override
    public void add(E e) {
        if (pos == elementData.length) {
            elementData = Arrays.copyOf(elementData, pos + pos >> 1);
        }
        elementData[pos++]=e;
    }

    @Override
    public int size() {
        return pos;
    }

    @Override
    public Iterator iterator() {
        return new Iter();
    }

    // 使用私有内部类实现我们的迭代器,封装性更好
    private class Iter<E> implements Iterator<E>{

        int curIndex=0;

        @Override
        public boolean hasNext() {
            return curIndex<pos;
        }

        @Override
        public E next() {
            return (E) elementData[curIndex++];
        }
    }
}
