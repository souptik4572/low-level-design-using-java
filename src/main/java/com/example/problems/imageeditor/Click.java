package com.example.problems.imageeditor;

public class Click implements Action {
    @Override
    public void perform(Image image) {
        System.out.println("[Image: " + image.getName() + "] has been clicked.");
    }
}
