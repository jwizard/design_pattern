package Interpreter.zetawiki;

/**
 * Created by jwizard on 2016. 2. 15..
 */
public class Plus implements Expression {
    Expression leftOperand;
    Expression rightOperand;

    public Plus(Expression left, Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret(java.util.Map<String, Expression> variables) {

        return leftOperand.interpret(variables) - rightOperand.interpret(variables);
    }
}
