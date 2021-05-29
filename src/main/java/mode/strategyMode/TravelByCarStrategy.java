package mode.strategyMode;

/**
 * @Author ws
 * @Date 2021/5/27 10:46
 */
public class TravelByCarStrategy implements TravelStrategy{
    @Override
    public void travelMode() {
        System.out.println("搭车");
    }
}
