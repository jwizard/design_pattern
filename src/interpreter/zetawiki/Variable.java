package Interpreter.zetawiki;

/**
 * Created by jwizard on 2016. 2. 15..
 */
public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public int interpret(java.util.Map<String, Expression> variables) {

        if (null == variables.get(name)) return 0;
        return variables.get(name).interpret(variables);
    }
}
