package mode.iteratorMode;

/**
 * @Author ws
 * @Date 2021/5/26 21:02
 */
public class ConcreteIterator implements Iterator{
    private Collection collection;
    private int pos=-1;

    public ConcreteIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public Object pre() {
        if (pos>0){
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if (pos<collection.size()-1){
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if (pos<collection.size()-1){
            return true;
        }else {
            return false;
        }
    }
}
