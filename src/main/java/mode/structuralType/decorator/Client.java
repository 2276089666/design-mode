package mode.structuralType.decorator;

/**
 * @Author ws
 * @Date 2021/5/30 12:32
 */
public class Client {
    // public DataOutputStream(OutputStream out)
    // public FilterOutputStream(OutputStream out)
    // public BufferedOutputStream(OutputStream out)
    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend(); // 自己本身花费2,被装饰的对象
        houseBlend = new Mocha(houseBlend);  // mocha装饰花费4，装饰者1
        houseBlend = new Whip(houseBlend);   // milk装饰花费3，装饰者2
        System.out.println(houseBlend.cost());  // milk的cost调mocha的cost，mocha的cost调houseBlend的cost

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.cost());
    }
}
