package mode.behavioral.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * @Author ws
 * @Date 2021/5/25 15:02
 */
public class Context {
    private Expression expression;

    public void calculator(String expression) {
        char[] array = expression.toCharArray();
        Stack<Expression> stack = new Stack<>();
        Expression left;
        Expression right;
        // 解析
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(array[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left=stack.pop();
                    right=new VarExpression(String.valueOf(array[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(array[i])));
                    break;
            }
        }
        this.expression=stack.pop();
    }

    public int calculate(Map<String,Integer> map){
        return this.expression.interpret(map);
    }
}
