package mode.strategyMode;

/**
 * @Author ws
 * @Date 2021/5/27 10:47
 */
public class Context {
    private TravelStrategy travelStrategy;

    public Context(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public TravelStrategy getTravelStrategy() {
        return travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travelMode(){
        this.travelStrategy.travelMode();
    }
}
