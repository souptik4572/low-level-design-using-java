package com.example.design.patterns.creational.abstractfactory.notification;

public class FreemiumPlanNotificationFactory implements NotificationPlanFactory {
    @Override
    public Notification resolveEmailNotificationPlan(NotificationProviderType notificationProviderType) {
        switch (notificationProviderType) {
            case SENDGRID:
                return new SendGridNotification();
            default:
                throw new IllegalArgumentException("Notification provider type: " + notificationProviderType + "is not supported.");
        }
    }

    @Override
    public Notification resolveSMSNotificationPlan(NotificationProviderType notificationProviderType) {
        switch (notificationProviderType) {
            case TWILIO:
                return new TwilioNotification();
            default:
                throw new IllegalArgumentException("Notification provider type: " + notificationProviderType + "is not supported.");
        }
    }

    @Override
    public Notification resolvePushNotificationPlan(NotificationProviderType notificationProviderType) {
        switch (notificationProviderType) {
            case FIREBASE:
                return new FirebaseNotification();
            default:
                throw new IllegalArgumentException("Notification provider type: " + notificationProviderType + "is not supported.");
        }
    }
}
