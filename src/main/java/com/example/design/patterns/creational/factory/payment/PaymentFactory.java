package com.example.design.patterns.creational.factory.payment;

public class PaymentFactory {
    public static Payment getPaymentInstance(PaymentMode paymentMode) {
        if(paymentMode == PaymentMode.CARD) {
            return new CardPayment();
        }
        return new UpiPayment();
    }
}
