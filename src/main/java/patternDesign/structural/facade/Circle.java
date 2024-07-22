package patternDesign.structural.facade;

/**
 * Daniel Nacher
 * 2024-07-22
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape::Circle");
    }
}
