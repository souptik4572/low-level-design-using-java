package com.example.design.patterns.structural.decorator.pizza;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
