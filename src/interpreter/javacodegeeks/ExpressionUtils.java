package Interpreter.javacodegeeks;

/**
 * Created by jwizard on 2016. 2. 17..
 */
public class ExpressionUtils {

    public static boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*"))
            return true;
        else
            return false;
    }

    public static Expression getOperator(String s, Expression left, Expression right) {
        System.out.println("getOperator s:"+s);
        switch (s) {
            case "+":
                return new Add(left, right);
            case "-":
                return new Substract(left, right);
            case "*":
                return new Product(left, right);
        }
        return null;
    }
}
