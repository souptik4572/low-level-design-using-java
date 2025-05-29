package com.example.design.patterns.behaivourial.observer.channel;

public interface IChannel {
    void addObserver(ISubscriber subscriber, String id);
    void removeObserver(String id);
    void sendNotification();
}
