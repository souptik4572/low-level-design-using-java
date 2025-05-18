package com.example.design.patterns.creational.abstractfactory.notification;

public class NotificationService {
    private NotificationProviderType notificationProviderType;
    private Notification notification;

    public NotificationService(NotificationFactory notificationFactory, NotificationProviderType notificationProviderType) {
        this.notificationProviderType = notificationProviderType;
        this.notification = notificationFactory.resolveNotificationProvider(notificationProviderType);
    }

    public void sendNotification(String resourceId, String message) {
        this.notification.send(resourceId, message);
    }
}
