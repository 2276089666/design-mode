package mode.creationType.prototype.clone;

/**
 * @Author ws
 * @Date 2021/4/22 11:09
 * @Version 1.0
 */
public class Main {
    // 业务代码，经常要各种DTO、BO、DO、VO转换
    public static void main(String[] args) throws CloneNotSupportedException {
        // 深拷贝
        System.out.println("深克隆：");
        Person person = new Person(5456,"张三", new Computer(564,"黑", "联想"));
        Person clone = (Person) person.clone();
        System.out.println("原型类：\t"+person.hashCode());
        System.out.println("克隆类：\t"+clone.hashCode());
        System.out.println("原型的name:\t"+person.getName().hashCode());
        System.out.println("克隆的name\t"+clone.getName().hashCode());
        System.out.println("原型的int\t"+person.getId().hashCode());
        System.out.println("克隆的int\t"+clone.getId().hashCode());
        System.out.println("原型的Computer"+person.getComputer().hashCode());
        System.out.println("克隆的Computer"+clone.getComputer().hashCode());

        // 浅拷贝
        System.out.println();
        System.out.println("浅拷贝：");
        Computer computer = new Computer(5464,"白", "苹果");
        Computer computerClone = (Computer) computer.clone();
        System.out.println("原型类：\t"+computer.hashCode());
        System.out.println("克隆类：\t"+computerClone.hashCode());
        System.out.println("原型类的brand:\t"+computer.getBrand().hashCode());
        System.out.println("克隆类的brand:\t"+computerClone.getBrand().hashCode());

    }
}
