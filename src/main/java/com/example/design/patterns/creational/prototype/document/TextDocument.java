package com.example.design.patterns.creational.prototype.document;

import java.util.HashMap;
import java.util.Map;

public class TextDocument implements Document {
    private String title;
    private final Map<String, String> metadata = new HashMap<>();

    public void setTitle(String title) {
        this.title = title;
    }

    public void addMetadata(String key, String value) {
        this.metadata.put(key, value);
    }

    @Override
    public Document clone() {
        try {
            return (TextDocument) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException("Cloning failed " + exception.getMessage());
        }
    }

    @Override
    public void print() {
        System.out.println("TextDocument{" +
                "title='" + title + '\'' +
                '}');
    }
}
