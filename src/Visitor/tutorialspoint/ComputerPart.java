package Visitor.tutorialspoint;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
