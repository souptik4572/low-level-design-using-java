package com.example.design.patterns.creational.factory.payment;

public class CardPayment implements Payment {
    @Override
    public void makePayment(String toPayResourceId, Long amount) {
        System.out.println("Making a card payment of Rs. " + amount + " to the resource: " + toPayResourceId);
    }
}
