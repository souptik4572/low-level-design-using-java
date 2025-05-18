package com.example.design.patterns.creational.abstractfactory.notification;

public interface NotificationFactory {
    Notification resolveNotificationProvider(NotificationProviderType notificationProviderType);
}
