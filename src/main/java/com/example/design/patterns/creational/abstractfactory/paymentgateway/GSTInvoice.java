package com.example.design.patterns.creational.abstractfactory.paymentgateway;

public class GSTInvoice implements Invoice {
    @Override
    public void generate() {
        System.out.println("GST Invoice is being generated for India");
    }
}
