package patternDesign.creational.abstractFactory;


import patternDesign.creational.abstractFactory.classes.colors.Color;
import patternDesign.creational.abstractFactory.classes.shapes.Shape;
import patternDesign.creational.abstractFactory.factory.AbstractFactory;
import patternDesign.creational.abstractFactory.factory.FactoryProducer;

/**
 * Abstract Factory patterns works around a super-factory which creates other factories. This factory is also called as
 * Factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the
 * best ways to create an object.
 *
 * In Abstract Factory pattern an interface is responsible for creating a factory of related objects, without explicitly
 * specifying their classes. Each generated factory can give the objects as per the Factory pattern.
 * */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("SQUARE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("CIRCLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();

    }
}
