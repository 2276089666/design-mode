package mode.intermediaryModel;

import mode.intermediaryModel.colleague.ColleagueLandlord;
import mode.intermediaryModel.colleague.ColleagueTenant;

/**
 * @Author ws
 * @Date 2021/5/26 21:50
 */
public class Main {
    public static void main(String[] args) {
        ColleagueTenant colleagueTenant = new ColleagueTenant();
        ColleagueLandlord colleagueLandlord = new ColleagueLandlord();
        ConcreteMediator mediator = new ConcreteMediator(colleagueTenant, colleagueLandlord);
        boolean res = mediator.notifyColleagueTenant("想租房吗？");
        if (res){
            mediator.notifyColleagueLandlord("包租婆有人要租房！！！");
        }else {
            mediator.notifyColleagueLandlord("人家不想租房");
        }
    }
}
