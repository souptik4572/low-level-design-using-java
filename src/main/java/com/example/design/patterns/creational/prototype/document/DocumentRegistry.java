package com.example.design.patterns.creational.prototype.document;

import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {
    private final static Map<String, Document> documentRegistry = new HashMap<>();

    static {
        documentRegistry.put("DOCUMENT", new TextDocument());
    }

    public static Document getDocument(String documentType) {
        return documentRegistry.get(documentType).clone();
    }
}
