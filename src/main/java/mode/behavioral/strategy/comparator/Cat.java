package mode.behavioral.strategy.comparator;


/**
 * @Author ws
 * @Date 2021/5/29 14:53
 */
public class Cat {
    private int weight;
    private String color;

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
