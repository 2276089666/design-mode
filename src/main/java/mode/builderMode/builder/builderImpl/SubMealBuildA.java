package mode.builderMode.builder.builderImpl;

import mode.builderMode.builder.MealBuilder;

/**
 * @Author ws
 * @Date 2021/4/12 16:50
 * @Version 1.0
 */
public class SubMealBuildA extends MealBuilder {
    @Override
    public void buildFood() {
        System.out.println("SubMealBuildA==========buildFood");
    }

    @Override
    public void buildDrink() {
        System.out.println("SubMealBuildA==========buildDrink");
    }
}
