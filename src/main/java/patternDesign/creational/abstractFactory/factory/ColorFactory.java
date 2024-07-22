package patternDesign.creational.abstractFactory.factory;

import patternDesign.creational.abstractFactory.classes.colors.Blue;
import patternDesign.creational.abstractFactory.classes.colors.Color;
import patternDesign.creational.abstractFactory.classes.colors.Green;
import patternDesign.creational.abstractFactory.classes.colors.Red;
import patternDesign.creational.abstractFactory.classes.shapes.Shape;

public class ColorFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color== null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
