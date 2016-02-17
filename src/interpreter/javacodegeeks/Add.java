package interpreter.javacodegeeks;

/**
 * Created by jwizard on 2016. 2. 17..
 */
public class Add implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public Add(Expression leftExpression, Expression rightExpression) {
        System.out.println(leftExpression.interpret()+"+"+rightExpression.interpret());
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
