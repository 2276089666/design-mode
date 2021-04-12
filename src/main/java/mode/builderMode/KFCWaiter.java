package mode.builderMode;

import mode.builderMode.builder.MealBuilder;

/**
 * @Author ws
 * @Date 2021/4/12 16:54
 * @Version 1.0
 */
public class KFCWaiter {
    MealBuilder mealBuilder;

    public KFCWaiter(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct(){
        mealBuilder.buildDrink();;
        mealBuilder.buildFood();
        return mealBuilder.getMeal();
    }
}
