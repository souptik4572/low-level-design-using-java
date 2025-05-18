package com.example.design.patterns.creational.abstractfactory.notification;

public interface NotificationPlanFactory {
    Notification resolveEmailNotificationPlan(NotificationProviderType notificationProviderType);
    Notification resolveSMSNotificationPlan(NotificationProviderType notificationProviderType);
    Notification resolvePushNotificationPlan(NotificationProviderType notificationProviderType);
}
