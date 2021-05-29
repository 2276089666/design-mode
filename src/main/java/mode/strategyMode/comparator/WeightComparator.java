package mode.strategyMode.comparator;

/**
 * @Author ws
 * @Date 2021/5/29 15:22
 */
public class WeightComparator implements MyComparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getWeight()-o2.getWeight();
    }
}
