package mode.prototypeMode.Serializable;



/**
 * @Author ws
 * @Date 2021/4/22 11:09
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args)  {
        // 深拷贝
        System.out.println("深克隆：");
        Person person = new Person(5456,"张三", new Computer(564,"黑", "联想"));
        Person clone = person.deepCloneBySerializable();
        System.out.println("原型类：\t"+person.hashCode());
        System.out.println("克隆类：\t"+clone.hashCode());
        System.out.println("原型的name:\t"+person.getName().hashCode());
        System.out.println("克隆的name\t"+clone.getName().hashCode());
        System.out.println("原型的int\t"+person.getId().hashCode());
        System.out.println("克隆的int\t"+clone.getId().hashCode());
        System.out.println("原型的Computer"+person.getComputer().hashCode());
        System.out.println("克隆的Computer"+clone.getComputer().hashCode());

    }
}
