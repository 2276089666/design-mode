package mode.builder;

/**
 * @Author ws
 * @Date 2021/6/2 18:14
 */
// 复杂的PersonBuilder
public class ComplexPersonBuilder implements PersonBuilder{
    private Person person=new Person();
    @Override
    public PersonBuilder buildLocation(String street, String roomNo) {
         person.loc=new Location(street,roomNo);
         return this;
    }

    @Override
    public PersonBuilder buildInfo(int id, String name) {
        person.id=id;
        person.name=name;
        return this;
    }

    @Override
    public PersonBuilder weight(double weight) {
        person.weight=weight;
        return this;
    }

    @Override
    public PersonBuilder score(int score) {
        person.score=score;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
