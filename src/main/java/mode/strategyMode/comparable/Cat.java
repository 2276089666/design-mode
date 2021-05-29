package mode.strategyMode.comparable;

/**
 * @Author ws
 * @Date 2021/5/29 14:53
 */
public class Cat implements MyComparable<Cat> {

    private int weight;
    private String color;

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    @Override
    public int compareTo(Cat o) {
        return this.weight - o.weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
