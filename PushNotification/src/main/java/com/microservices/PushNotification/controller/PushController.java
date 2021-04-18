package com.microservices.PushNotification.controller;

import com.microservices.PushNotification.model.PushPojo;
import com.microservices.PushNotification.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PushController {

    @Autowired
    private PushService pushService;

    @RequestMapping("/send")
    public String sendPush(@RequestBody PushPojo pushPojo) {
        return pushService.sendPush(pushPojo);
    }
}
