package com.example.design.patterns.creational.factory.notification;

public class SMSNotification implements Notification {
    @Override
    public void send(String resourceId) {
        System.out.println("Notification will be sent via SMS to the number: " + resourceId);
    }
}
