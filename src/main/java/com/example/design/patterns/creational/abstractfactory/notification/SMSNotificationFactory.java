package com.example.design.patterns.creational.abstractfactory.notification;

public class SMSNotificationFactory implements NotificationFactory {
    @Override
    public Notification resolveNotificationProvider(NotificationProviderType notificationProviderType) {
        switch (notificationProviderType) {
            case TWILIO:
                return new TwilioNotification();
            case PLIVO:
                return new PlivoNotification();
            default:
                throw new IllegalArgumentException("Notification provider type: " + notificationProviderType + "is not supported.");
        }
    }
}
