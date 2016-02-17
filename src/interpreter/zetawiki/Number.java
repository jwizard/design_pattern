package interpreter.zetawiki;

/**
 * Created by jwizard on 2016. 2. 15..
 */
public class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int interpret(java.util.Map<String, Expression> variables) {
        return number;
    }
}
