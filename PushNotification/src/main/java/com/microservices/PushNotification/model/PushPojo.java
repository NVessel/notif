package com.microservices.PushNotification.model;

public class PushPojo {
    String deviceId;
    String subject;
    String text;
    String link;

    public String getDeviceId() {
        return deviceId;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public String getLink() {
        return link;
    }
}
