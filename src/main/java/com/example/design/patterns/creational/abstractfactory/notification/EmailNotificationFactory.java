package com.example.design.patterns.creational.abstractfactory.notification;

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification resolveNotificationProvider(NotificationProviderType notificationProviderType) {
        switch (notificationProviderType) {
            case SENDGRID:
                return new SendGridNotification();
            case SES:
                return new SESNotification();
            default:
                throw new IllegalArgumentException("Notification provider type: " + notificationProviderType + "is not supported.");
        }
    }
}
