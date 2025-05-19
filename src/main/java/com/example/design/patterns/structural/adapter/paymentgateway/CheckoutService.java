package com.example.design.patterns.structural.adapter.paymentgateway;

public class CheckoutService {
    PaymentGateway paymentGateway;

    public CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void makePayment(String orderId, double amount) {
        this.paymentGateway.pay(orderId, amount);
    }
}
