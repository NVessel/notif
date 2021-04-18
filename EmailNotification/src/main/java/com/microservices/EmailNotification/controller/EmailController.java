package com.microservices.EmailNotification.controller;

import com.microservices.EmailNotification.model.EmailPojo;
import com.microservices.EmailNotification.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public String sendEmail(@RequestBody EmailPojo emailPojo) {
        return emailService.sendEmail(emailPojo);
    }
}
