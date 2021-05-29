package mode.stateMode;

/**
 * @Author ws
 * @Date 2021/5/27 10:21
 */
public class HolidayState extends AbstractState{
    @Override
    void action(Context context) {
        System.out.println("state 变为假期状态");
    }
}
