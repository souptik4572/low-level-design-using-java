package com.example.design.patterns.creational.abstractfactory.paymentgateway;

public class USFactory implements RegionFactory {

    @Override
    public PaymentGatway resolvePaymentGateway(PaymentGatewayType paymentGatewayType) {
        switch (paymentGatewayType) {
            case STRIPE:
                return new StripePaymentGateway();
            case PAYPAL:
                return new PaypalPaymentGateway();
            default:
                throw new IllegalArgumentException("Payment gateway type - " + paymentGatewayType + " is not supported");
        }
    }

    @Override
    public Invoice resolveInvoice() {
        return new USTaxInvoice();
    }
}
