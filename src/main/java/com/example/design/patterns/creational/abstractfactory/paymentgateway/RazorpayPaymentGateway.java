package com.example.design.patterns.creational.abstractfactory.paymentgateway;

public class RazorpayPaymentGateway implements PaymentGatway {
    @Override
    public void processPayment(Long amount) {
        System.out.println("Razorpay payment gateway is making a payment of ₹" + amount);
    }
}
