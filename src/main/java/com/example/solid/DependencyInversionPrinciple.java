package com.example.solid;

interface RecommendationStrategy {
    void recommend();
}

class TrendingBasedRecommendation implements RecommendationStrategy {
    @Override
    public void recommend() {
        System.out.println("Trending titles will be recommended");
    }
}

class GenreBasedRecommendation implements  RecommendationStrategy {
    @Override
    public void recommend() {
        System.out.println("Genre liked titles will be recommended");
    }
}

class AiBasedRecommendation implements RecommendationStrategy {
    @Override
    public void recommend() {
        System.out.println("AI researched topics will be recommended");
    }
}

class RecommendationAlgorithm {
    private RecommendationStrategy recommendationStrategy;
    public RecommendationAlgorithm(RecommendationStrategy recommendationStrategy) {
        this.recommendationStrategy = recommendationStrategy;
    }
    public void setRecommendationStrategy(RecommendationStrategy recommendationStrategy) {
        this.recommendationStrategy = recommendationStrategy;
    }
    public void recommendTitle() {
        recommendationStrategy.recommend();
    }
}

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        RecommendationStrategy trendingRecommendation = new TrendingBasedRecommendation();
        RecommendationStrategy genreRecommendation = new GenreBasedRecommendation();
        RecommendationStrategy aiRecommendation = new AiBasedRecommendation();
        RecommendationAlgorithm recommendationAlgorithm = new RecommendationAlgorithm(trendingRecommendation);
        recommendationAlgorithm.recommendTitle();
        recommendationAlgorithm.setRecommendationStrategy(genreRecommendation);
        recommendationAlgorithm.recommendTitle();
        recommendationAlgorithm.setRecommendationStrategy(aiRecommendation);
        recommendationAlgorithm.recommendTitle();
    }
}
