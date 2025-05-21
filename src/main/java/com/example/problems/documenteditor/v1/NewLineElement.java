package com.example.problems.documenteditor.v1;

public class NewLineElement implements Element {
    @Override
    public String render() {
        return "\n";
    }
}
