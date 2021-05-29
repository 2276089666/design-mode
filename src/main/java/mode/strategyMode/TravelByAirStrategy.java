package mode.strategyMode;

/**
 * @Author ws
 * @Date 2021/5/27 10:45
 */
public class TravelByAirStrategy implements TravelStrategy{
    @Override
    public void travelMode() {
        System.out.println("搭飞机");
    }
}
