package mode.creationType.builder;

/**
 * @Author ws
 * @Date 2021/6/2 18:05
 */
public interface PersonBuilder {
    PersonBuilder buildLocation(String street, String roomNo);
    PersonBuilder buildInfo(int id, String name);
    PersonBuilder weight(double weight);
    PersonBuilder score(int score);
    Person build();
}
