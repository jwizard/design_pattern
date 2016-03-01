package Interpreter.javacodegeeks;

import java.util.Stack;

/**
 * Created by jwizard on 2016. 2. 17..
 */
public class TestInterpreterPattern {
    public static void main(String[] args) {

        String tokenString = "7 3 - 2 1 + *";
//        String tokenString = "7 5 3 - 19 22 + + 2 1 + *";
        Stack<Expression> stack = new Stack<>();
        String[] tokenArray = tokenString.split(" ");
        for (String s : tokenArray) {
            System.out.println("s:"+s);
            if (ExpressionUtils.isOperator(s)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = ExpressionUtils.getOperator(s, leftExpression, rightExpression);
                int result = operator.interpret();
                System.out.println("result:"+result);
                stack.push(new Number(result));
            } else {
                Expression i = new Number(Integer.parseInt(s));
                stack.push(i);
            }
        }
        System.out.println("( "+tokenString+" ): "+stack.pop().interpret());
    }
}