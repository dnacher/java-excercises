package patternDesign.creational.builder.classes.bottle;

import patternDesign.creational.builder.classes.Item;
import patternDesign.creational.builder.classes.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
