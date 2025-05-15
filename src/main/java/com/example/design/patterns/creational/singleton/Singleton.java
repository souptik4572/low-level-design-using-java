package com.example.design.patterns.creational.singleton;

// Singleton Example - Eager Loading
// This is Thread - Safe
class JudgeAnalyticsEagerLoading {
    private final static JudgeAnalyticsEagerLoading instance = new JudgeAnalyticsEagerLoading();

    private JudgeAnalyticsEagerLoading() {}

    public static JudgeAnalyticsEagerLoading getInstance() {
        return instance;
    }
}

// Singleton Example - Lazy Loading
// This is Not Thread - Safe
class JudgeAnalyticsLazyLoading {
    private static JudgeAnalyticsLazyLoading instance;

    private JudgeAnalyticsLazyLoading() {}

    public static JudgeAnalyticsLazyLoading getInstance() {
        if(instance == null) {
            instance = new JudgeAnalyticsLazyLoading();
        }
        return instance;
    }

}

public class Singleton {
    public static void main(String[] args) {
        JudgeAnalyticsEagerLoading judgeAnalyticsEagerLoadingOne = JudgeAnalyticsEagerLoading.getInstance();
        JudgeAnalyticsEagerLoading judgeAnalyticsEagerLoadingTwo = JudgeAnalyticsEagerLoading.getInstance();
        System.out.println(judgeAnalyticsEagerLoadingOne);
        System.out.println(judgeAnalyticsEagerLoadingTwo);

        JudgeAnalyticsLazyLoading judgeAnalyticsLazyLoadingOne = JudgeAnalyticsLazyLoading.getInstance();
        JudgeAnalyticsLazyLoading judgeAnalyticsLazyLoadingTwo = JudgeAnalyticsLazyLoading.getInstance();
        System.out.println(judgeAnalyticsLazyLoadingOne);
        System.out.println(judgeAnalyticsLazyLoadingTwo);
    }
}
