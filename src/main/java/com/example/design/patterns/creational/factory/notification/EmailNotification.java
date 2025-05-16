package com.example.design.patterns.creational.factory.notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String resourceId) {
        System.out.println("Notification will be sent to the email id: " + resourceId);
    }
}
