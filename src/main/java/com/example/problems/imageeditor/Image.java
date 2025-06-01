package com.example.problems.imageeditor;

public class Image {
    private String name;
    private String metadata;
    private String content;

    public Image(String name, String metadata, String content) {
        this.name = name;
        this.metadata = metadata;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
