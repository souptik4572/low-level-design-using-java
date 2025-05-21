package com.example.problems.documenteditor.v1;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile implements Persistence {
    @Override
    public void save(String content) {
        try {
            FileWriter myWriter = new FileWriter("document.txt");
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException exception) {
            System.out.println("An error occurred while saving data to document - " + exception.getMessage());
            exception.printStackTrace();
        }
    }
}
