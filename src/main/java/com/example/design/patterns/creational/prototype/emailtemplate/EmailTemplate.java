package com.example.design.patterns.creational.prototype.emailtemplate;

public interface EmailTemplate extends Cloneable {
    EmailTemplate clone();
    void setContent(String content);
    void send(String toEmail);
}
