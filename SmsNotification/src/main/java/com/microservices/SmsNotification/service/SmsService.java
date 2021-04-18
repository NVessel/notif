package com.microservices.SmsNotification.service;

import com.microservices.SmsNotification.model.SmsPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SmsService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    public String sendSms(SmsPojo smsPojo) {
        log.info("Sms was sent from {} to {}, contains {}", smsPojo.getFrom(), smsPojo.getTo(), smsPojo.getText());
        return "Sms was sent with success";
    }
}
