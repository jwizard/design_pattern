package Visitor.ko_wiki;

/**
 * Created by jwizard on 2016. 2. 29..
 */
public class VisitorDemo {
    static public void main(String[] args) {
//        Wheel car = new Wheel();
        Car car = new Car();
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}
