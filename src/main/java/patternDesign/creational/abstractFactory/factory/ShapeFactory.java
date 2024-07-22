package patternDesign.creational.abstractFactory.factory;

import patternDesign.creational.abstractFactory.classes.colors.Color;
import patternDesign.creational.abstractFactory.classes.shapes.Circle;
import patternDesign.creational.abstractFactory.classes.shapes.Rectangle;
import patternDesign.creational.abstractFactory.classes.shapes.Shape;
import patternDesign.creational.abstractFactory.classes.shapes.Square;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        if(shape== null){
            return null;
        }
        if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else if (shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
