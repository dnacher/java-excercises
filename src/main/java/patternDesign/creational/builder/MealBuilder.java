package patternDesign.creational.builder;


import patternDesign.creational.builder.classes.Meal;
import patternDesign.creational.builder.classes.bottle.Coke;
import patternDesign.creational.builder.classes.bottle.Pepsi;
import patternDesign.creational.builder.classes.burger.ChickenBurger;
import patternDesign.creational.builder.classes.burger.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
