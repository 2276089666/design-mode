package mode.stateMode;

/**
 * @Author ws
 * @Date 2021/5/27 10:24
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new WorkState());
        context.action();
        context.setAbstractState(new HolidayState());
        context.action();
    }
}
