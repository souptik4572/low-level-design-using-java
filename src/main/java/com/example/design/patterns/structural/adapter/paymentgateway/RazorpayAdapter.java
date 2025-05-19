package com.example.design.patterns.structural.adapter.paymentgateway;

public class RazorpayAdapter implements PaymentGateway {
    private RazorpayAPI razorpayAPI;
    private String razorpayToken;

    public RazorpayAdapter(RazorpayAPI razorpayAPI, String razorpayToken) {
        this.razorpayAPI = razorpayAPI;
        this.razorpayToken = razorpayToken;
    }

    @Override
    public void pay(String orderId, double amount) {
        razorpayAPI.performPayment(orderId, razorpayToken, (long) amount);
    }
}
