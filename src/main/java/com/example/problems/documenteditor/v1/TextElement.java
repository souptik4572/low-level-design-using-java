package com.example.problems.documenteditor.v1;

public class TextElement implements Element {
    private final String content;

    public TextElement(String content) {
        this.content = content;
    }

    @Override
    public String render() {
        return this.content;
    }
}
