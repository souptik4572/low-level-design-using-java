package com.example.design.patterns.creational.abstractfactory.paymentgateway;

public interface RegionFactory {
    PaymentGatway resolvePaymentGateway(PaymentGatewayType paymentGatewayType);
    Invoice resolveInvoice();
}
