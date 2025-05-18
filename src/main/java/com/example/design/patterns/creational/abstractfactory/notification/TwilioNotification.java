package com.example.design.patterns.creational.abstractfactory.notification;

public class TwilioNotification implements Notification {
    @Override
    public void send(String resourceId, String message) {
        System.out.println("SMS notification has been to sent to: " + resourceId + " by Twilio. Message is: " + message);
    }
}
