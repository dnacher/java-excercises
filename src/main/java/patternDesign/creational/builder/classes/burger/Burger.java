package patternDesign.creational.builder.classes.burger;

import patternDesign.creational.builder.classes.Item;
import patternDesign.creational.builder.classes.Packing;
import patternDesign.creational.builder.classes.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
