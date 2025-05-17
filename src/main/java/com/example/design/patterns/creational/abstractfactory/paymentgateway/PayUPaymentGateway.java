package com.example.design.patterns.creational.abstractfactory.paymentgateway;

public class PayUPaymentGateway implements PaymentGatway {
    @Override
    public void processPayment(Long amount) {
        System.out.println("PayU payment gateway is making a payment of ₹" + amount + " in India");
    }
}
