package mode.behavioral.interpreter;

import java.util.Map;

/**
 * @Author ws
 * @Date 2021/5/25 15:03
 */
public class SymbolExpression implements Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public int interpret(Map<String, Integer> map) {
        return 0;
    }
}
