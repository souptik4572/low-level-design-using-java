package com.example.design.patterns.creational.prototype.emailtemplate;

import java.util.HashMap;
import java.util.Map;

public class EmailTemplateRegistry {
    private static final Map<EmailTemplateType, EmailTemplate> emailTemplateRegistry = new HashMap<>();

    static {
        emailTemplateRegistry.put(EmailTemplateType.WELCOME, new WelcomeEmailTemplate());
    }

    public static EmailTemplate getEmailTemplate(EmailTemplateType emailTemplateType) {
        return emailTemplateRegistry.get(emailTemplateType).clone();
    }

}
