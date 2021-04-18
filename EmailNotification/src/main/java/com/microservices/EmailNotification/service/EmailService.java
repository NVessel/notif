package com.microservices.EmailNotification.service;

import com.microservices.EmailNotification.model.EmailPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    public String sendEmail(EmailPojo emailPojo) {
        log.info("Email was sent from {} to {}, contains headers{}. Subject is {}, text is {}",
                emailPojo.getFrom(), emailPojo.getTo(), emailPojo.getHeaders(), emailPojo.getSubject(), emailPojo.getText());
        return "Email was sent with success";
    }
}
