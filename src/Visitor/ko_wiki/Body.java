package Visitor.ko_wiki;

/**
 * Created by jwizard on 2016. 2. 29..
 */
public class Body implements CarElement {
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
