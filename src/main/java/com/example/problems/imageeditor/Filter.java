package com.example.problems.imageeditor;

public class Filter {
    public void apply(Image image, String color) {
        System.out.println("[Color: " + color + "] has been applied on top of [Image: " + image.getName() + "]");
    }
}
