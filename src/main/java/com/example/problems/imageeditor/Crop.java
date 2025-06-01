package com.example.problems.imageeditor;

public class Crop implements Action {
    @Override
    public void perform(Image image) {
        System.out.println("[Image: " + image.getName() + "] has been cropped to new dimensions.");
    }
}
