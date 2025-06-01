package com.example.problems.imageeditor;

public class SaveToDB implements Persistence {

    private final String tablename;

    public SaveToDB(String tablename) {
        this.tablename = tablename;
    }

    @Override
    public void save(Image image) {
        System.out.println("[Image: " + image.getName() + "] has been saved to DB [" + this.tablename + "].");
    }
}
