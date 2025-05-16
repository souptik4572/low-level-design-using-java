package com.example.design.patterns.creational.factory.notification;

public class NotificationFactory {
    public static Notification getNotification(NotificationMode notificationMode) {
        switch (notificationMode) {
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            default:
                return new PushNotification();
        }
    }
}
