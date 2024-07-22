package patternDesign.structural.decorator;

/**
 * Daniel Nacher
 * 2024-07-22
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
