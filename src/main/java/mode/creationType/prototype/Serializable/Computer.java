package mode.creationType.prototype.Serializable;


import java.io.Serializable;

/**
 * @Author ws
 * @Date 2021/4/22 11:02
 * @Version 1.0
 */
public class Computer implements Serializable {
    private int order;
    private String color;
    private String brand;

    public Computer(int order, String color, String brand) {
        this.order = order;
        this.color = color;
        this.brand = brand;
    }

    public int getOrder() {
        return order;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

}
