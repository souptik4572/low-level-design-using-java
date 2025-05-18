package com.example.design.patterns.creational.abstractfactory.notification;

public class OneSignalNotification implements Notification {
    @Override
    public void send(String resourceId, String message) {
        System.out.println("Push notification has been to sent to: " + resourceId + " by OneSignal. Message is: " + message);
    }
}
