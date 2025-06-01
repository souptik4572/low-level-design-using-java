package com.example.problems.imageeditor;

import java.util.HashMap;
import java.util.Map;

public class ActionApplier {
    private Map<ActionType, Action> actionMap;
    private final Filter filter;

    public ActionApplier() {
        loadActionMap();
        this.filter = new Filter();
    }

    private void loadActionMap() {
        actionMap = new HashMap<>();
        actionMap.put(ActionType.CLICK, new Click());
        actionMap.put(ActionType.CROP, new Crop());
        actionMap.put(ActionType.SHARPEN, new Sharpen());
    }

    public void applyAction(Image image, ActionType actionType) {
        actionMap.get(actionType).perform(image);
    }

    public void applyFilter(Image image, String color) {
        filter.apply(image, color);
    }

}
