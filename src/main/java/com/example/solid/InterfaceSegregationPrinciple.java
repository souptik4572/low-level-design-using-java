package com.example.solid;

/*
interface UberUser {
    void bookRide();
    void acceptRide();
    void driveRide();
    void endRide();
    void payForRide();
}

// Now the below specific classes Rider and Driver both of them would have to
// implement all the methods of the interface. Although Rider has no requirement
// of acceptRide(), driveRide() and endRide() methods

class Rider extends UberUser {

}

class Driver extends UberUser {

}
*/

// A better solution would be to define two separate interfaces
// 1. One for Rider
// 2. One for Driver
// which will only have necessary methods w.r.t the Rider or Driver

interface DriverInterface {
    void acceptRide();
    void driveRide();
    void endRide();
}

interface RiderInterface {
    void bookRide();
    void payForRide();
}

class Driver implements DriverInterface {
    @Override
    public void acceptRide() {
        System.out.println("Driver accepts a ride request");
    }
    @Override
    public void driveRide() {
        System.out.println("Driver drives to the destination");
    }
    @Override
    public void endRide() {
        System.out.println("Driver ends the ride");
    }
}

class Rider implements RiderInterface {
    @Override
    public void bookRide() {
        System.out.println("Rider books an available ride");
    }
    @Override
    public void payForRide() {
        System.out.println("Rider pays the price for a completed ride");
    }
}

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        RiderInterface rider = new Rider();
        DriverInterface driver = new Driver();

        rider.bookRide();
        driver.acceptRide();
        driver.driveRide();
        driver.endRide();
        rider.payForRide();
    }
}
