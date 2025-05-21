package com.example.problems.documenteditor.v1;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private final List<Element> documentElements;

    public Document() {
        this.documentElements = new ArrayList<>();
    }

    public void addElement(Element element) {
        documentElements.add(element);
    }

    public String getRenderedDocument() {
        StringBuilder result = new StringBuilder();
        for(Element element: documentElements) {
            result.append(element.render());
        }
        return result.toString();
    }
}
