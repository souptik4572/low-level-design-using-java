package com.example.design.patterns.creational.factory;

import com.example.design.patterns.creational.factory.logictics.LogisticService;
import com.example.design.patterns.creational.factory.logictics.TransportMode;
import com.example.design.patterns.creational.factory.notification.NotificationMode;
import com.example.design.patterns.creational.factory.notification.NotificationService;
import com.example.design.patterns.creational.factory.payment.PaymentMode;
import com.example.design.patterns.creational.factory.payment.PaymentService;

public class FactoryDriver {
    public static void main(String[] args) {
        LogisticService logisticService = new LogisticService();
        logisticService.send(TransportMode.AIR);
        logisticService.send(TransportMode.ROAD);

        System.out.println();

        NotificationService notificationService = new NotificationService();
        notificationService.send("abc@gmail.com", NotificationMode.EMAIL);
        notificationService.send("9087654321", NotificationMode.SMS);
        notificationService.send("Android 14", NotificationMode.PUSH);

        System.out.println();

        PaymentService paymentService = new PaymentService();
        paymentService.completePayment("UPI_ID@upi.com", 500L, PaymentMode.UPI);
        paymentService.completePayment("Card_Vendor", 2500L, PaymentMode.UPI);
    }
}
