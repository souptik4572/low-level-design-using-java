package com.example.design.patterns.behaivourial.observer.channel;

public class UserSubscriber implements ISubscriber {
    private final String id;
    private final YoutubeChannel youtubeChannel;

    public UserSubscriber(String id, IChannel youtubeChannel) {
        this.youtubeChannel = (YoutubeChannel) youtubeChannel;
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void update() {
        System.out.println("Sending notification to : " + id + " New Uploaded Video is : " + youtubeChannel.getLatestVideo());
    }
}
