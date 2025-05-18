package com.example.design.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderDriver {
    public static void main(String[] args) {
        BurgerMeal paneerBurger = new BurgerMeal.BurgerMealBuilder("paneer", "wheat").build();
        System.out.println(paneerBurger);
        BurgerMeal paneearBurgerCompleteMeal = new BurgerMeal.BurgerMealBuilder("paneer", "flour")
                .withCheese(true)
                .withSides(List.of("Fries", "Veg Stripes"))
                .withToppings(List.of("Lettuce", "Tomatoes", "Onion", "Mayonnaise"))
                .withSoftDrink("Sprite")
                .build();
        System.out.println(paneearBurgerCompleteMeal.toString());
    }
}
