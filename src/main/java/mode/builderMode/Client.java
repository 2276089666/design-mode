package mode.builderMode;

import mode.builderMode.builder.MealBuilder;
import mode.builderMode.builder.builderImpl.SubMealBuildA;

/**
 * @Author ws
 * @Date 2021/4/12 17:00
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        MealBuilder builder = new SubMealBuildA();
        KFCWaiter kfcWaiter = new KFCWaiter(builder);
        Meal meal = kfcWaiter.construct();
    }
}
