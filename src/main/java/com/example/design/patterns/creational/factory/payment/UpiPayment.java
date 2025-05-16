package com.example.design.patterns.creational.factory.payment;

public class UpiPayment implements Payment {
    @Override
    public void makePayment(String toPayUpiId, Long amount) {
        System.out.println("Making a UPI payment of Rs. " + amount + " to " + toPayUpiId);
    }
}
