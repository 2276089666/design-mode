package mode.behavioral.strategy.comparator;


/**
 * @Author ws
 * @Date 2021/5/29 15:23
 */
public class ColorComparator implements MyComparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
