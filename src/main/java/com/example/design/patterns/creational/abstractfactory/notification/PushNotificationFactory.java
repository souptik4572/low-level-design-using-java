package com.example.design.patterns.creational.abstractfactory.notification;

public class PushNotificationFactory implements NotificationFactory {
    @Override
    public Notification resolveNotificationProvider(NotificationProviderType notificationProviderType) {
        switch (notificationProviderType) {
            case FIREBASE:
                return new FirebaseNotification();
            case ONESIGNAL:
                return new OneSignalNotification();
            default:
                throw new IllegalArgumentException("Notification provider type: " + notificationProviderType + "is not supported.");
        }
    }
}
