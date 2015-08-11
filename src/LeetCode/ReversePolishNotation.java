package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by guangyw on 8/10/15.
 */
public class ReversePolishNotation {
    public static Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (operators.contains(tokens[i])) {
                int op2 = stack.pop();
                int op1 = stack.pop();
                stack.push(eval(op1, op2, tokens[i]));
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }

    public int eval(int x, int y, String operator) {
        switch(operator) {
            case "+" :return x + y;
            case "-" : return x - y;
            case "*" : return x * y;
            default: return x / y;
        }
    }
}
