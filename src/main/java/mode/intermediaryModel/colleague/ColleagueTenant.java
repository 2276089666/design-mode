package mode.intermediaryModel.colleague;

import mode.intermediaryModel.Colleague;

/**
 * @Author ws
 * @Date 2021/5/26 21:45
 */
public class ColleagueTenant extends Colleague {
    @Override
    public boolean operation(String message) {
        System.out.println("中介者对租户说:\t"+message);
        return true;
    }
}
