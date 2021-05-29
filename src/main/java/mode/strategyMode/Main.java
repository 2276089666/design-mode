package mode.strategyMode;

/**
 * @Author ws
 * @Date 2021/5/27 10:48
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("出行策略为：");
        Context context = new Context(new TravelByAirStrategy());
        context.travelMode();
        System.out.println("改变之前的策略，现在的策略为：");
        context.setTravelStrategy(new TravelByCarStrategy());
        context.travelMode();
    }
}
