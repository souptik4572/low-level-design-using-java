package com.example.design.patterns.behaivourial.observer.channel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YoutubeChannel implements IChannel {
    private Map<String, ISubscriber> observers;
    private final List<String> videos;

    public YoutubeChannel() {
        videos = new ArrayList<>();
        observers = new HashMap<>();
    }

    @Override
    public void addObserver(ISubscriber subscriber, String id) {
        observers.put(id, subscriber);
    }

    @Override
    public void removeObserver(String id) {
        observers.remove(id);
    }

    @Override
    public void sendNotification() {
        for(String key: observers.keySet()) {
            observers.get(key).update();
        }
    }

    public void uploadVideo(String videoName) {
        videos.add(videoName);
        System.out.println("New video has been uploaded : sending notification to all observers");
        sendNotification();
    }

    public String getLatestVideo() {
        return videos.get(videos.size() - 1);
    }
}
