package com.example.solid;

// Definition: As per OCP, Software entities (classes, modules, functions, etc.)
// should be open for extension, but closed for modification.
// This explains that a class should always be extended before making any
// additional changes to the existing flow. Thereby reducing the chances to
// break the existing flow.

// The below example includes a Tax Calculator where we are calculating the
// tax based on the geoRegion data received. Now if a new tax percentage to be considered
// we need to add another conditional

//class TaxCalculator {
//    public double getAmountAfterTax(double amount, String geoRegion) {
//        double TAX = 0;
//        if(geoRegion.equals("INDIA")) {
//            TAX = 18;
//        }
//        else if(geoRegion.equals("US")) {
//            TAX = 10;
//        }
//        else if(geoRegion.equals("EU")) {
//            TAX = 25;
//        }
//        return amount * (1 + TAX / 100);
//    }
//}

interface TaxCalculator {
    double getAmountAfterTax(double amount);
}

class IndiaTaxCalculator implements TaxCalculator {
    public double getAmountAfterTax(double amount) {
        double TAX = 18;
        return amount * (1 + TAX / 100);
    }
}

class USTaxCalculator implements TaxCalculator {
    public double getAmountAfterTax(double amount) {
        double TAX = 10;
        return amount * (1 + TAX / 100);
    }
}

class EUTaxCalculator implements TaxCalculator {
    public double getAmountAfterTax(double amount) {
        double TAX = 25;
        return amount * (1 + TAX / 100);
    }
}

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        TaxCalculator indiaTaxCalculator = new IndiaTaxCalculator();
        System.out.println("Amount after Tax calculation in India: " + indiaTaxCalculator.getAmountAfterTax(100));
        TaxCalculator usTaxCalculator = new USTaxCalculator();
        System.out.println("Amount after Tax calculation in US: " + usTaxCalculator.getAmountAfterTax(100));
        TaxCalculator euTaxCalculator = new EUTaxCalculator();
        System.out.println("Amount after Tax calculation in EU: " + euTaxCalculator.getAmountAfterTax(100));
    }
}
