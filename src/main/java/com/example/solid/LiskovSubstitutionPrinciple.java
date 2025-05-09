package com.example.solid;

class Notification {
    public void sendNotification() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification extends Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS Notification");
    }
}

class WhatsappNotification extends Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending Whatsapp Notification");
    }
}

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Notification emailNotification = new Notification();
        emailNotification.sendNotification();
        Notification smsNotification = new SMSNotification();
        smsNotification.sendNotification();
        Notification whatsappNotification = new WhatsappNotification();
        whatsappNotification.sendNotification();
    }
}
