package patternDesign.creational.abstractFactory.factory;

import patternDesign.creational.abstractFactory.classes.colors.Color;
import patternDesign.creational.abstractFactory.classes.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
