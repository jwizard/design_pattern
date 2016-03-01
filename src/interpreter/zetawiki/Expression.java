package Interpreter.zetawiki;

/**
 * Created by jwizard on 2016. 2. 15..
 */
public interface Expression {
    public int interpret(java.util.Map<String, Expression> variables);
}
