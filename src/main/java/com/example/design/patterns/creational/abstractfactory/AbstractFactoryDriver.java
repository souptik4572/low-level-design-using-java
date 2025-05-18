package com.example.design.patterns.creational.abstractfactory;

import com.example.design.patterns.creational.abstractfactory.notification.*;
import com.example.design.patterns.creational.abstractfactory.paymentgateway.CheckoutService;
import com.example.design.patterns.creational.abstractfactory.paymentgateway.IndiaFactory;
import com.example.design.patterns.creational.abstractfactory.paymentgateway.PaymentGatewayType;
import com.example.design.patterns.creational.abstractfactory.paymentgateway.USFactory;

public class AbstractFactoryDriver {
    public static void main(String[] args) {
        CheckoutService checkoutServiceIndiaPayU = new CheckoutService(new IndiaFactory(), PaymentGatewayType.PAYU);
        checkoutServiceIndiaPayU.completeOrder(200L);
        CheckoutService checkoutServiceIndiaRazorpay = new CheckoutService(new IndiaFactory(), PaymentGatewayType.RAZORPAY);
        checkoutServiceIndiaRazorpay.completeOrder(900L);

        System.out.println();

        CheckoutService checkoutServiceUSStripe = new CheckoutService(new USFactory(), PaymentGatewayType.STRIPE);
        checkoutServiceUSStripe.completeOrder(40L);
        CheckoutService checkoutServiceUSPaypal = new CheckoutService(new USFactory(), PaymentGatewayType.PAYPAL);
        checkoutServiceUSPaypal.completeOrder(90L);

        System.out.println();

        NotificationService emailNotificationServiceSendGrid = new NotificationService(
                new EmailNotificationFactory(),
                NotificationProviderType.SENDGRID
        );
        emailNotificationServiceSendGrid.sendNotification("abc@gmail.com", "Check Inbox");

        NotificationService emailNotificationServiceSES = new NotificationService(
                new EmailNotificationFactory(),
                NotificationProviderType.SES
        );
        emailNotificationServiceSES.sendNotification("def@gmail.com", "Check Inbox");

        NotificationService smsNotificationServiceTwilio = new NotificationService(
                new SMSNotificationFactory(),
                NotificationProviderType.TWILIO
        );
        smsNotificationServiceTwilio.sendNotification("897654321", "Check Phone Texts");

        NotificationService smsNotificationServicePlivo = new NotificationService(
                new SMSNotificationFactory(),
                NotificationProviderType.PLIVO
        );
        smsNotificationServicePlivo.sendNotification("789654321", "Check Phone Texts");

        NotificationService pushNotificationServiceFirebase = new NotificationService(
                new PushNotificationFactory(),
                NotificationProviderType.FIREBASE
        );
        pushNotificationServiceFirebase.sendNotification("Android 13", "Check Notifications");

        NotificationService pushNotificationServiceOneSignal = new NotificationService(
                new PushNotificationFactory(),
                NotificationProviderType.ONESIGNAL
        );
        pushNotificationServiceOneSignal.sendNotification("Android 16", "Check Notifications");

        System.out.println();

        NotificationPlanService fremiumNotificationPlanService = new NotificationPlanService(
                new FreemiumPlanNotificationFactory(),
                NotificationProviderType.SENDGRID,
                NotificationProviderType.TWILIO,
                NotificationProviderType.FIREBASE
        );
        fremiumNotificationPlanService.sendEmailNotification("ghi@gmail.com", "Check Email Inbox");
        fremiumNotificationPlanService.sendSMSNotification("678954321", "Check Phone Texts");
        fremiumNotificationPlanService.sendPushNotification("Android 14", "Check Android App Notifications");

        NotificationPlanService premiumNotificationPlanService = new NotificationPlanService(
                new PremiumPlanNotificationFactory(),
                NotificationProviderType.SES,
                NotificationProviderType.PLIVO,
                NotificationProviderType.ONESIGNAL
        );
        premiumNotificationPlanService.sendEmailNotification("ghi@gmail.com", "Check Email Inbox");
        premiumNotificationPlanService.sendSMSNotification("678954321", "Check Phone Texts");
        premiumNotificationPlanService.sendPushNotification("Android 14", "Check Android App Notifications");
    }
}
