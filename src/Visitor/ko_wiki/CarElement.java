package Visitor.ko_wiki;

interface CarElement {
    void accept(CarElementVisitor visitor); // CarElements have to provide accept().
}