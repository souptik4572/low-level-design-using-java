package com.example.problems.imageeditor;

public class ImageEditor {
    private Image image;
    private final ActionApplier actionApplier;
    private final Persistence persistence;

    public ImageEditor(Persistence persistence) {
        this.persistence = persistence;
        actionApplier = new ActionApplier();
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void clickImage() {
        actionApplier.applyAction(image, ActionType.CLICK);
    }

    public void cropImage() {
        actionApplier.applyAction(image, ActionType.CROP);
    }

    public void sharpenImage() {
        actionApplier.applyAction(image, ActionType.SHARPEN);
    }

    public void applyColor(String color) {
        actionApplier.applyFilter(image, color);
    }

    public void saveImage() {
        persistence.save(image);
    }

}
