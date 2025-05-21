package com.example.problems.documenteditor.v1;

public class ImageElement implements Element {
    private final String imagePath;

    public ImageElement(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String render() {
        return "[Image Path: " + imagePath + "]";
    }
}
