package com.example.design.patterns.structural.adapter.logging;

public class LegacyTextLogger {
    void writeToLogFile(SeverityType severity, String text) {
        // Logs to file in format: [SEVERITY] - message
        System.out.println("[" + severity + "] - " + text);
    }
}
