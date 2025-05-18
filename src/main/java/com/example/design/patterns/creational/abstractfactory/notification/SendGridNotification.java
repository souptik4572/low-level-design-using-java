package com.example.design.patterns.creational.abstractfactory.notification;

public class SendGridNotification implements Notification {
    @Override
    public void send(String resourceId, String message) {
        System.out.println("Email notification has been to sent to: " + resourceId + " by SendGrid. Message is: " + message);
    }
}
