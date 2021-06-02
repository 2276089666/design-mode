package mode.template;

/**
 * @Author ws
 * @Date 2021/5/27 11:12
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("服务1：");
        AbstractTemplate saveMoney = new SaveMoney();
        saveMoney.templateMethod();
        System.out.println();
        System.out.println("服务2：");
        AbstractTemplate takeMoney = new TakeMoney();
        takeMoney.templateMethod();
    }
}
