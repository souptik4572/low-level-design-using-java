package com.example.design.patterns.creational.abstractfactory.notification;

public class NotificationPlanService {
    private Notification emailNotification;
    private Notification smsNotification;
    private Notification pushNotification;

    public NotificationPlanService(NotificationPlanFactory notificationPlanFactory,
                                   NotificationProviderType emailNotificationType,
                                   NotificationProviderType smsNotificationType,
                                   NotificationProviderType pushNotificationType
    ) {
        this.emailNotification = notificationPlanFactory.resolveEmailNotificationPlan(emailNotificationType);
        this.smsNotification = notificationPlanFactory.resolveSMSNotificationPlan(smsNotificationType);
        this.pushNotification = notificationPlanFactory.resolvePushNotificationPlan(pushNotificationType);
    }

    public void sendEmailNotification(String resourceId, String message) {
        this.emailNotification.send(resourceId, message);
    }

    public void sendSMSNotification(String resourceId, String message) {
        this.smsNotification.send(resourceId, message);
    }

    public void sendPushNotification(String resourceId, String message) {
        this.pushNotification.send(resourceId, message);
    }
}
