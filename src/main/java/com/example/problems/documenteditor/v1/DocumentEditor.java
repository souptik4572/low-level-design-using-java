package com.example.problems.documenteditor.v1;

public class DocumentEditor {
    private final Document document;
    private final Persistence persistence;

    public DocumentEditor(Persistence persistence) {
        this.persistence = persistence;
        document = new Document();
    }

    public void addText(String text) {
        document.addElement(new TextElement(text));
    }

    public void addImage(String imagePath) {
        document.addElement(new ImageElement(imagePath));
    }

    public void addNewLine() {
        document.addElement(new NewLineElement());
    }

    public void addTab() {
        document.addElement(new TabSpaceElement());
    }

    public String renderDocument() {
        return document.getRenderedDocument();
    }

    public void saveToFile() {
        persistence.save(document.getRenderedDocument());
    }
}
