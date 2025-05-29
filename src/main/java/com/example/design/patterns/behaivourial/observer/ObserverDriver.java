package com.example.design.patterns.behaivourial.observer;

import com.example.design.patterns.behaivourial.observer.channel.UserSubscriber;
import com.example.design.patterns.behaivourial.observer.channel.YoutubeChannel;

public class ObserverDriver {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();

        UserSubscriber adamAccount = new UserSubscriber("Adam", youtubeChannel);
        UserSubscriber jackAccount = new UserSubscriber("Jack", youtubeChannel);

        youtubeChannel.addObserver(adamAccount, "Adam");
        youtubeChannel.addObserver(jackAccount, "Jack");

        youtubeChannel.uploadVideo("Chemical Mishap");
        youtubeChannel.uploadVideo("Technological Mishap");

        youtubeChannel.removeObserver("Adam");

        youtubeChannel.uploadVideo("Physics Reality");
    }
}
