package com.example.design.patterns.structural.decorator;

import com.example.design.patterns.structural.decorator.pizza.BasePizza;
import com.example.design.patterns.structural.decorator.pizza.CheeseTopping;
import com.example.design.patterns.structural.decorator.pizza.OnionTopping;
import com.example.design.patterns.structural.decorator.pizza.Pizza;

public class DecoratorDriver {
    public static void main(String[] args) {
        Pizza margheritaPizza = new BasePizza("Margharita Pizza", 100);
        Pizza margheritaPizzaWithOnion = new OnionTopping(margheritaPizza);
        System.out.println(margheritaPizzaWithOnion.getDescription() + " - " + margheritaPizzaWithOnion.getCost());

        System.out.println();

        Pizza vegPizza = new BasePizza("Veg Pizza", 90);
        Pizza vegPizzaWithCheeseAndOnion = new CheeseTopping(new OnionTopping(vegPizza));
        System.out.println(vegPizzaWithCheeseAndOnion.getDescription() + " - " + vegPizzaWithCheeseAndOnion.getCost());

    }
}
