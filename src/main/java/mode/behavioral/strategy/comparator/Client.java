package mode.behavioral.strategy.comparator;


import java.util.Arrays;

/**
 * @Author ws
 * @Date 2021/5/29 15:19
 */
public class Client {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(2, "黑猫"), new Cat(1, "白猫"), new Cat(5, "花猫")};
        Sorter<Cat> sorter = new Sorter<>();

        WeightComparator weightComparator = new WeightComparator();
        sorter.bubbleSort(cats, weightComparator);
        System.out.println(Arrays.toString(cats));

        // 在不改变原代码的情况下，换了一种排序策略，此为策略模式
        ColorComparator colorComparator = new ColorComparator();
        sorter.bubbleSort(cats, colorComparator);
        System.out.println(Arrays.toString(cats));

        // 只有一个抽象方法的函数式接口，直接可以用lambda
        sorter.bubbleSort(cats, (o1, o2) -> {
            return o2.getWeight() - o1.getWeight();
        });
        System.out.println(Arrays.toString(cats));
    }
}
