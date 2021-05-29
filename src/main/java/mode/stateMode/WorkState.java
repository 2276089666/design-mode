package mode.stateMode;

/**
 * @Author ws
 * @Date 2021/5/27 10:22
 */
public class WorkState extends AbstractState{
    @Override
    void action(Context context) {
        System.out.println("state 变为工作状态");
    }
}
