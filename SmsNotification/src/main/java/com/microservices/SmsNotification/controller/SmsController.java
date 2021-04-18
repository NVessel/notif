package com.microservices.SmsNotification.controller;

import com.microservices.SmsNotification.model.SmsPojo;
import com.microservices.SmsNotification.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {

    @Autowired
    private SmsService smsService;

    @PostMapping("/send")
    public String sendSms(@RequestBody SmsPojo smsPojo) {
        return smsService.sendSms(smsPojo);
    }
}
