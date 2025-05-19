package com.example.design.patterns.structural.adapter.paymentgateway;

public class PayUPaymentGateway implements PaymentGateway {
    @Override
    public void pay(String orderId, double amount) {
        System.out.println("PayU is initiating payment of Rs." + amount + " for Order Id: [" + orderId + "].");
    }
}
