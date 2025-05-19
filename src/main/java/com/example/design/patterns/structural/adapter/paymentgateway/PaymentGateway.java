package com.example.design.patterns.structural.adapter.paymentgateway;

public interface PaymentGateway {
    void pay(String orderId, double amount);
}
