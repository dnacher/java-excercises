package patternDesign.structural.facade;

/**
 * Daniel Nacher
 * 2024-07-22
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape::Square");
    }
}
