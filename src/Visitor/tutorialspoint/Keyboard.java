package Visitor.tutorialspoint;

/**
 * Created by jwizard on 2016. 2. 29..
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
