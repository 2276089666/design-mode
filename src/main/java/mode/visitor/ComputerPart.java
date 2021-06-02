package mode.visitor;

/**
 * @Author ws
 * @Date 2021/6/2 14:05
 */
public abstract class ComputerPart {
   public abstract void accept(Visitor v);

    //some other operations eg:getName getBrand
   public abstract double getPrice();
}
