package com.example.design.patterns.creational.singleton;

// Singleton Example - Lazy Loading But Thread Safe
// This is Thread - Safe

public class JudgeAnalyticsLazyLoadingThreadSafe {

    private JudgeAnalyticsLazyLoadingThreadSafe() {}

    private static final class InstanceHolder {
        private static final JudgeAnalyticsLazyLoadingThreadSafe instance = new JudgeAnalyticsLazyLoadingThreadSafe();
    }

    public static JudgeAnalyticsLazyLoadingThreadSafe getInstance() {
        return InstanceHolder.instance;
    }
}
