package patternDesign.creational.builder.classes.bottle;

import patternDesign.creational.builder.classes.Packing;

public class Bottle implements Packing {


    @Override
    public String pack() {
        return "Bottle";
    }
}
