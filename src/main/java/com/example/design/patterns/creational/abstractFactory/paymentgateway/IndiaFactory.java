package com.example.design.patterns.creational.abstractFactory.paymentgateway;

public class IndiaFactory implements RegionFactory {
    @Override
    public PaymentGatway resolvePaymentGateway(PaymentGatewayType paymentGatewayType) {
        switch (paymentGatewayType) {
            case PAYU:
                return new PayUPaymentGateway();
            case RAZORPAY:
                return new RazorpayPaymentGateway();
            default:
                throw new IllegalArgumentException("Payment gateway type - " + paymentGatewayType + " is not supported");
        }
    }

    @Override
    public Invoice resolveInvoice() {
        return new GSTInvoice();
    }
}
