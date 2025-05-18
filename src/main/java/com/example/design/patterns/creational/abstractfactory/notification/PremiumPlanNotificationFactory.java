package com.example.design.patterns.creational.abstractfactory.notification;

public class PremiumPlanNotificationFactory implements NotificationPlanFactory {
    @Override
    public Notification resolveEmailNotificationPlan(NotificationProviderType notificationProviderType) {
        switch (notificationProviderType) {
            case SES:
                return new SESNotification();
            default:
                throw new IllegalArgumentException("Notification provider type: " + notificationProviderType + "is not supported.");
        }
    }

    @Override
    public Notification resolveSMSNotificationPlan(NotificationProviderType notificationProviderType) {
        switch (notificationProviderType) {
            case PLIVO:
                return new PlivoNotification();
            default:
                throw new IllegalArgumentException("Notification provider type: " + notificationProviderType + "is not supported.");
        }
    }

    @Override
    public Notification resolvePushNotificationPlan(NotificationProviderType notificationProviderType) {
        switch (notificationProviderType) {
            case ONESIGNAL:
                return new OneSignalNotification();
            default:
                throw new IllegalArgumentException("Notification provider type: " + notificationProviderType + "is not supported.");
        }
    }
}
