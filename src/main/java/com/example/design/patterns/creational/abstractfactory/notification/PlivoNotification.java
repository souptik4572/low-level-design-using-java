package com.example.design.patterns.creational.abstractfactory.notification;

public class PlivoNotification implements Notification {
    @Override
    public void send(String resourceId, String message) {
        System.out.println("SMS notification has been to sent to: " + resourceId + " by Plivo. Message is: " + message);
    }
}
