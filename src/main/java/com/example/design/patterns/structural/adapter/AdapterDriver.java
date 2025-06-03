package com.example.design.patterns.structural.adapter;

import com.example.design.patterns.structural.adapter.logging.LegacyTextLogger;
import com.example.design.patterns.structural.adapter.logging.LegacyTextLoggerAdapter;
import com.example.design.patterns.structural.adapter.paymentgateway.*;
import com.example.design.patterns.structural.adapter.reports.XmlReportProvider;
import com.example.design.patterns.structural.adapter.reports.Reports;
import com.example.design.patterns.structural.adapter.reports.XmlReportProviderAdapter;

import java.util.HashMap;
import java.util.Map;

public class AdapterDriver {
    public static void main(String[] args) throws Exception {
        CheckoutService payUCheckoutService = new CheckoutService(new PayUPaymentGateway());
        payUCheckoutService.makePayment("OD8998", 2000);

        RazorpayAdapter razorpayAdapter = new RazorpayAdapter(new RazorpayAPI(), "jibberish$577jjhfng");
        CheckoutService razorpayCheckoutService = new CheckoutService(razorpayAdapter);
        razorpayCheckoutService.makePayment("OD9009", 3000);

        System.out.println();

        LegacyTextLoggerAdapter legacyTextLoggerAdapter = new LegacyTextLoggerAdapter(new LegacyTextLogger());
        legacyTextLoggerAdapter.logInfo("Logging is successful");
        Map<String, String> debugMap = new HashMap<>();
        debugMap.put("miniature", "Singularity");
        legacyTextLoggerAdapter.logDebug("Logging will be successful", debugMap);
        legacyTextLoggerAdapter.logError("Encountered an error while logging",
                new IllegalAccessException("Accessing wrong logging data"));

        System.out.println();

        XmlReportProvider personXmlDataReport = new XmlReportProvider("person");
        System.out.println("The XML data is: " + personXmlDataReport.getXmlData("firstname:Johan;lastname:Liebert;age:22"));

        Reports jsonReports = new XmlReportProviderAdapter(personXmlDataReport);
        System.out.println("The JSON data is: " + jsonReports.getJsonData("firstname:Johan;lastname:Liebert;age:22"));
    }
}
