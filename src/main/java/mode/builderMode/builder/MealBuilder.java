package mode.builderMode.builder;

import mode.builderMode.Meal;

/**
 * @Author ws
 * @Date 2021/4/12 16:47
 * @Version 1.0
 */
public abstract class MealBuilder {
    Meal meal=new Meal();
    public abstract void buildFood();
    public abstract void buildDrink();
    public Meal getMeal(){
        return meal;
    }
}
