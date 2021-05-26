package mode.intermediaryModel;

/**
 * @Author ws
 * @Date 2021/5/26 21:46
 */
public class ConcreteMediator extends Mediator{
    public ConcreteMediator(Colleague colleagueTenant, Colleague colleagueLandlord) {
        super(colleagueTenant, colleagueLandlord);
    }

    @Override
    public boolean notifyColleagueTenant(String message) {
        if (colleagueTenant!=null){
            return colleagueTenant.operation(message);
        }
        return false;
    }

    @Override
    public boolean notifyColleagueLandlord(String message) {
        if (colleagueLandlord!=null){
            return colleagueLandlord.operation(message);
        }
        return false;
    }
}
