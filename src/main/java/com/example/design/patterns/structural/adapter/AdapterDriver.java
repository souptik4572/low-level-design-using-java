package com.example.design.patterns.structural.adapter;

import com.example.design.patterns.structural.adapter.paymentgateway.*;

public class AdapterDriver {
    public static void main(String[] args) {
        CheckoutService payUCheckoutService = new CheckoutService(new PayUPaymentGateway());
        payUCheckoutService.makePayment("OD8998", 2000);

        RazorpayAdapter razorpayAdapter = new RazorpayAdapter(new RazorpayAPI(), "jibberish$577jjhfng");
        CheckoutService razorpayCheckoutService = new CheckoutService(razorpayAdapter);
        razorpayCheckoutService.makePayment("OD9009", 3000);
    }
}
