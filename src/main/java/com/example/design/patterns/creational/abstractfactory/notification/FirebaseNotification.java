package com.example.design.patterns.creational.abstractfactory.notification;

public class FirebaseNotification implements Notification {
    @Override
    public void send(String resourceId, String message) {
        System.out.println("Push notification has been to sent to: " + resourceId + " by Firebase. Message is: " + message);
    }
}
