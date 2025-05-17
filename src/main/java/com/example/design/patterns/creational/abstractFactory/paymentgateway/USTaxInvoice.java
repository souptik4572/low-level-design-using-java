package com.example.design.patterns.creational.abstractFactory.paymentgateway;

public class USTaxInvoice implements Invoice {
    @Override
    public void generate() {
        System.out.println("Tax Invoice is being generated for US");
    }
}
