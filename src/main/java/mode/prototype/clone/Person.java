package mode.prototype.clone;

/**
 * @Author ws
 * @Date 2021/4/22 11:04
 * @Version 1.0
 */
public class Person implements Cloneable {
    Integer id;
    private String name;
    private Computer computer;

    public Person(Integer id, String name, Computer computer) {
        this.id = id;
        this.name = name;
        this.computer = computer;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Computer getComputer() {
        return computer;
    }

    @Override
    protected Object clone() {
        Person person = null;
        try {
            person = (Person) super.clone();
            person.computer = (Computer) this.computer.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }
}
