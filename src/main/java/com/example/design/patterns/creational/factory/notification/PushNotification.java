package com.example.design.patterns.creational.factory.notification;

public class PushNotification implements Notification {
    @Override
    public void send(String resourceId) {
        System.out.println("Pushed notification will be triggered to: " + resourceId);
    }
}
