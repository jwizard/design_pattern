package Template_method.choipattern;

/**
 * Created by jwizard on 2016. 3. 1..
 */
public class Main {

    public static void main(String[] args) {

        AbstractDisplay d1 = new CharDisplay('H');

        AbstractDisplay d2 = new StringDisplay("hello, world.");

        AbstractDisplay d3 = new StringDisplay("안녕하세요.");

        d1.display();

        d2.display();

        d3.display();
    }
}
