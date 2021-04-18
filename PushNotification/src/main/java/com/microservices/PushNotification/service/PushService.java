package com.microservices.PushNotification.service;

import com.microservices.PushNotification.model.PushPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PushService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    public String sendPush(PushPojo pushPojo) {
        log.info("Push was sent to {}, contains link{}. Subject is {}, text is {}",
                pushPojo.getDeviceId(), pushPojo.getLink(), pushPojo.getSubject(), pushPojo.getText());
        return "Push was sent with success";
    }
}
