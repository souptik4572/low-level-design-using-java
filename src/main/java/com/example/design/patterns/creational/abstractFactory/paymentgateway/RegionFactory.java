package com.example.design.patterns.creational.abstractFactory.paymentgateway;

public interface RegionFactory {
    PaymentGatway resolvePaymentGateway(PaymentGatewayType paymentGatewayType);
    Invoice resolveInvoice();
}
