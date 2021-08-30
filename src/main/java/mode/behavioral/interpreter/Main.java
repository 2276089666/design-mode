package mode.behavioral.interpreter;

import java.util.HashMap;

/**
 * @Author ws
 * @Date 2021/5/26 20:32
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("x",12);
        map.put("y",15);
        map.put("z",1);
        Context context = new Context();
        context.calculator("x+y-z");
        int calculate = context.calculate(map);
        System.out.println("x+y-z计算的结果为:\t"+calculate);
    }
}
