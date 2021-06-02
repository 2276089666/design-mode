package mode.visitor;

import mode.visitor.visitors.People;
import mode.visitor.visitors.StudentVisitor;
import mode.visitor.visitors.VipVisitor;

/**
 * @Author ws
 * @Date 2021/6/2 14:20
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 针对于不同用户我们电脑的部件可以打不同的折扣
         * 不必在部件类里面写if判断不同的用户去给出不同的价格
         * 将if判断的逻辑抽象出来Visitor接口,然后每个Visitor的实现类给出不同的折扣
         */
        // 缺点:有新的电脑部件增加时,所有得代码都得改很麻烦,所以只适用于结构不怎么变得场景上
        Computer computer = new Computer();
        People people = new People();
        computer.accept(people);
        System.out.println(people.getPrice());

        StudentVisitor studentVisitor = new StudentVisitor();
        computer.accept(studentVisitor);
        System.out.println(studentVisitor.getPrice()    );

        VipVisitor vipVisitor = new VipVisitor();
        computer.accept(vipVisitor);
        System.out.println(vipVisitor.getPrice());
    }
}
