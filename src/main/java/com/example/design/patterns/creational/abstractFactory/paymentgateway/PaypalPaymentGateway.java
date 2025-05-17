package com.example.design.patterns.creational.abstractFactory.paymentgateway;

public class PaypalPaymentGateway implements PaymentGatway {
    @Override
    public void processPayment(Long amount) {
        System.out.println("Paypal payment gateway is making a payment of $" + amount + " in US");
    }
}
