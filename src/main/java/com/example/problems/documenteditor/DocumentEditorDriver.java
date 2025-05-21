package com.example.problems.documenteditor;

import com.example.problems.documenteditor.v1.DocumentEditor;
import com.example.problems.documenteditor.v1.SaveToFile;

import java.io.IOException;

public class DocumentEditorDriver {
    public static void main(String[] args) throws IOException {
        DocumentEditor documentEditor = new DocumentEditor(new SaveToFile());

        documentEditor.addText("Hello World in LLD");
        documentEditor.addNewLine();
        documentEditor.addImage("example_lld.jpg");
        documentEditor.addTab();
        documentEditor.addText("- Need to save to Persistence");
        System.out.println(documentEditor.renderDocument());
        documentEditor.saveToFile();
    }
}
