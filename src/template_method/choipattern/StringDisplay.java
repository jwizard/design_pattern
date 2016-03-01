package Template_method.choipattern;

/**
 * Created by jwizard on 2016. 3. 1..
 */
public class StringDisplay extends AbstractDisplay {

    private String string;

    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    public void open() {
        printLine();
    }

    public void print() {
        System.out.println("l" + string + "l");
    }

    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
