package com.example.design.patterns.structural.decorator.pizza;

public class CheeseTopping extends PizzaDecorator {
    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with additional cheese topping";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }
}
