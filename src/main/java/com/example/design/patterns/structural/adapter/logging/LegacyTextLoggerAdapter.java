package com.example.design.patterns.structural.adapter.logging;

import java.util.Map;

public class LegacyTextLoggerAdapter implements Logger {
    private LegacyTextLogger legacyTextLogger;

    public LegacyTextLoggerAdapter(LegacyTextLogger legacyTextLogger) {
        this.legacyTextLogger = legacyTextLogger;
    }

    @Override
    public void logInfo(String message) {
        legacyTextLogger.writeToLogFile(SeverityType.INFO, message);
    }

    @Override
    public void logError(String message, Exception e) {
        legacyTextLogger.writeToLogFile(SeverityType.ERROR, message + " - " + e.getMessage());
    }

    @Override
    public void logDebug(String message, Map<String, String> metadata) {
        legacyTextLogger.writeToLogFile(SeverityType.DEBUG, message + " - " + metadata.toString());
    }
}
