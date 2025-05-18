package com.example.design.patterns.creational.prototype.emailtemplate;

public class WelcomeEmailTemplate implements EmailTemplate {
    private String subject;
    private String content;

    @Override
    public EmailTemplate clone() {
        try {
            return (WelcomeEmailTemplate) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException("Cloning is not supported: " + exception.getMessage());
        }
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void send(String toEmail) {
        System.out.println("Sending to " + toEmail + ": [" + subject + "] " + content);
    }

    @Override
    public String toString() {
        return "WelcomeEmailTemplate{" +
                "subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
