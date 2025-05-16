package com.example.design.patterns.creational.factory.payment;

public class PaymentService {
    public void completePayment(String toResourceId, Long amount, PaymentMode paymentMode) {
        Payment payment = PaymentFactory.getPaymentInstance(paymentMode);
        payment.makePayment(toResourceId, amount);
    }
}
