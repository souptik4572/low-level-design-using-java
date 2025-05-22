package com.example.design.patterns.structural.decorator.pizza;

public class OnionTopping extends PizzaDecorator {
    public OnionTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with additional onions";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 30;
    }
}
