package com.example.design.patterns.structural.adapter.logging;

import java.util.Map;

public interface Logger {
    void logInfo(String message);
    void logError(String message, Exception e);
    void logDebug(String message, Map<String, String> metadata);
}
