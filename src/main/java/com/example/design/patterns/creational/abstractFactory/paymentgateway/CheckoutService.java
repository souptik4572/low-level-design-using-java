package com.example.design.patterns.creational.abstractFactory.paymentgateway;

public class CheckoutService {
    private PaymentGatway paymentGatway;
    private PaymentGatewayType paymentGatewayType;
    private Invoice invoice;

    public CheckoutService(RegionFactory regionFactory, PaymentGatewayType paymentGatewayType) {
        this.paymentGatewayType = paymentGatewayType;
        this.paymentGatway = regionFactory.resolvePaymentGateway(paymentGatewayType);
        this.invoice = regionFactory.resolveInvoice();
    }

    public void completeOrder(long amount) {
        paymentGatway.processPayment(amount);
        invoice.generate();
    }
}
