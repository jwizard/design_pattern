package interpreter.javacodegeeks;

/**
 * Created by jwizard on 2016. 2. 17..
 */
public class Number implements Expression {
    private final int n;

    public Number(int n) {
        this.n = n;
    }

    @Override
    public int interpret() {
        return n;
    }
}
