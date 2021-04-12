package mode.builderMode.builder.builderImpl;

import mode.builderMode.builder.MealBuilder;

/**
 * @Author ws
 * @Date 2021/4/12 16:51
 * @Version 1.0
 */
public class SubMealBuildB extends MealBuilder {
    @Override
    public void buildFood() {
        System.out.println("SubMealBuildB============buildFood");
    }

    @Override
    public void buildDrink() {
        System.out.println("SubMealBuildB============buildDrink");
    }
}
