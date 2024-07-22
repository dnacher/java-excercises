package patternDesign.structural.decorator;

/**
 * Daniel Nacher
 * 2024-07-22
 */
public abstract class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
