package com.example.design.patterns.structural.adapter.paymentgateway;

public class RazorpayAPI {
    public void performPayment(String orderId, String token, long amount) {
        System.out.println("Razorpay is initiating a payment of Rs." + amount +
                " for Order Id: [" + orderId + "]. The unique token is: " + token);
    }
}
