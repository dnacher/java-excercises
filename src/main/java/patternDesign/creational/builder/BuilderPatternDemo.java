package patternDesign.creational.builder;

import patternDesign.creational.builder.classes.Meal;

/**
 * Builder pattern builds a complex object using simple objects and using a step by step approach. This type of design
 * pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 *
 * A Builder class builds the final object step by step. This builder is independent of other objects.
 * */
public class BuilderPatternDemo {

    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());
        System.out.println("***-------------------------------------***");

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());
    }
}
