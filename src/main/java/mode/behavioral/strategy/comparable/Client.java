package mode.behavioral.strategy.comparable;

import java.util.Arrays;

/**
 * @Author ws
 * @Date 2021/5/29 14:55
 */
public class Client {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(2, "黑猫"), new Cat(1, "白猫"), new Cat(5, "花猫")};
        Sorter.bubbleSort(cats);
        System.out.println(Arrays.toString(cats));
        // 此时我们想换一种排序的方法，按weight从大到小排序，由于MyComparable的方法我们只能重写一次，要想换排序只有改Cat类的MyComparable的接口实现
        // 这违背了开闭原则，由此我们引进策略模式，请看下面的comparator
    }
}
