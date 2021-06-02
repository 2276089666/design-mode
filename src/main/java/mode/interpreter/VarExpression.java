package mode.interpreter;

import java.util.Map;

/**
 * @Author ws
 * @Date 2021/5/26 20:12
 */
public class VarExpression implements Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpret(Map<String, Integer> map) {
        return map.get(key);
    }
}
