package mode.behavioral.interpreter;

import java.util.Map;

/**
 * @Author ws
 * @Date 2021/5/26 20:04
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret(Map<String, Integer> map) {
        return left.interpret(map) - right.interpret(map);
    }
}
