package com.example.design.patterns.creational.prototype;

import com.example.design.patterns.creational.prototype.document.Document;
import com.example.design.patterns.creational.prototype.document.DocumentRegistry;
import com.example.design.patterns.creational.prototype.emailtemplate.EmailTemplate;
import com.example.design.patterns.creational.prototype.emailtemplate.EmailTemplateRegistry;
import com.example.design.patterns.creational.prototype.emailtemplate.EmailTemplateType;

public class PrototypeDriver {
    public static void main(String[] args) {
        EmailTemplate welcomeEmailTemplateTUF = EmailTemplateRegistry.getEmailTemplate(EmailTemplateType.WELCOME);
        welcomeEmailTemplateTUF.setContent("Welcome to TUF");
        EmailTemplate welcomeEmailTemplateTUFPlus = EmailTemplateRegistry.getEmailTemplate(EmailTemplateType.WELCOME);
        welcomeEmailTemplateTUFPlus.setContent("Welcome to TUF+");
        System.out.println(welcomeEmailTemplateTUF);
        System.out.println(welcomeEmailTemplateTUFPlus);
        System.out.println(welcomeEmailTemplateTUF);

        Document textDocument = DocumentRegistry.getDocument("DOCUMENT");
        System.out.println(textDocument);
    }
}
