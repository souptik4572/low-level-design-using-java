package com.example.design.patterns.creational.factory.notification;

public class NotificationService {
    public void send(String resourceId, NotificationMode notificationMode) {
        Notification notification = NotificationFactory.getNotification(notificationMode);
        notification.send(resourceId);
    }
}
