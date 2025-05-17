package com.example.design.patterns.creational.abstractfactory;

import com.example.design.patterns.creational.abstractfactory.paymentgateway.CheckoutService;
import com.example.design.patterns.creational.abstractfactory.paymentgateway.IndiaFactory;
import com.example.design.patterns.creational.abstractfactory.paymentgateway.PaymentGatewayType;
import com.example.design.patterns.creational.abstractfactory.paymentgateway.USFactory;

public class AbstractFactoryDriver {
    public static void main(String[] args) {
        CheckoutService checkoutServiceIndiaPayU = new CheckoutService(new IndiaFactory(), PaymentGatewayType.PAYU);
        checkoutServiceIndiaPayU.completeOrder(200L);
        CheckoutService checkoutServiceIndiaRazorpay = new CheckoutService(new IndiaFactory(), PaymentGatewayType.RAZORPAY);
        checkoutServiceIndiaRazorpay.completeOrder(900L);

        System.out.println();

        CheckoutService checkoutServiceUSStripe = new CheckoutService(new USFactory(), PaymentGatewayType.STRIPE);
        checkoutServiceUSStripe.completeOrder(40L);
        CheckoutService checkoutServiceUSPaypal = new CheckoutService(new USFactory(), PaymentGatewayType.PAYPAL);
        checkoutServiceUSPaypal.completeOrder(90L);
    }
}
