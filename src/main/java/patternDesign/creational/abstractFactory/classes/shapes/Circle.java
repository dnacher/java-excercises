package patternDesign.creational.abstractFactory.classes.shapes;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw method.");
    }
}
