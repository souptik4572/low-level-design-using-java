package com.example.problems.imageeditor;

public class ImageEditorDriver {
    public static void main(String[] args) {
        Image image = new Image("Sunday Blues", null, "The description of a sunday afternoon under a blue sky");
        ImageEditor imageEditor = new ImageEditor(new SaveToDB("natural_scenery"));

        imageEditor.setImage(image);
        imageEditor.clickImage();
        imageEditor.cropImage();
        imageEditor.sharpenImage();
        imageEditor.applyColor("Red");
        imageEditor.saveImage();

    }
}
