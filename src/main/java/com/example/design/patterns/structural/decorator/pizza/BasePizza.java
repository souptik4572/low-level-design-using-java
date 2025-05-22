package com.example.design.patterns.structural.decorator.pizza;

public class BasePizza implements Pizza {
    private final String description;
    private final double cost;

    public BasePizza(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    public BasePizza(BasePizza basePizza) {
        this.description = basePizza.getDescription();
        this.cost = basePizza.getCost();
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
