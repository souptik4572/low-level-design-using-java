package com.example.design.patterns.creational.abstractfactory.paymentgateway;

public class StripePaymentGateway implements PaymentGatway {
    @Override
    public void processPayment(Long amount) {
        System.out.println("Stripe payment gateway is making a payment of $" + amount + " in US");
    }
}
