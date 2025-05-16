package com.example.design.patterns.creational.factory.payment;

public interface Payment {
    void makePayment(String toPayResourceId, Long amount);
}
