package com.example.design.patterns.creational.builder;

import java.util.List;

public class BurgerMeal {
    // Mandatory fields
    private String bun;
    private String patty;

    // Optional Fields
    private boolean hasCheese;
    private List<String> toppings;
    private List<String> sides;
    private String softDrink;

    private BurgerMeal(BurgerMealBuilder burgerMealBuilder) {
        this.bun = burgerMealBuilder.bun;
        this.patty = burgerMealBuilder.patty;
        this.hasCheese = burgerMealBuilder.hasCheese;
        this.toppings = burgerMealBuilder.toppings;
        this.sides = burgerMealBuilder.sides;
        this.softDrink = burgerMealBuilder.softDrink;
    }

    public static class BurgerMealBuilder {
        private String bun;
        private String patty;

        private boolean hasCheese;
        private List<String> toppings;
        private List<String> sides;
        private String softDrink;

        public BurgerMealBuilder(String patty, String bun) {
            this.patty = patty;
            this.bun = bun;
        }

        public BurgerMealBuilder withCheese(boolean hasCheese) {
            this.hasCheese = hasCheese;
            return this;
        }

        public BurgerMealBuilder withToppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public BurgerMealBuilder withSides(List<String> sides) {
            this.sides = sides;
            return this;
        }

        public BurgerMealBuilder withSoftDrink(String softDrink) {
            this.softDrink = softDrink;
            return this;
        }

        public BurgerMeal build() {
            return new BurgerMeal(this);
        }
    }

    @Override
    public String toString() {
        return "BurgerMeal{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", hasCheese=" + hasCheese +
                ", toppings=" + toppings +
                ", sides=" + sides +
                ", softDrink='" + softDrink + '\'' +
                '}';
    }
}
