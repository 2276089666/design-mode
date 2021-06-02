package mode.interpreter;

import java.util.Map;

/**
 * @Author ws
 * @Date 2021/5/25 15:01
 */
public interface Expression {
    int interpret(Map<String,Integer> map);
}
