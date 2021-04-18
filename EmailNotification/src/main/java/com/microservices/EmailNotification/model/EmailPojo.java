package com.microservices.EmailNotification.model;

public class EmailPojo {
    String to;
    String from;
    String subject;
    String headers;
    String text;

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getSubject() {
        return subject;
    }

    public String getHeaders() {
        return headers;
    }

    public String getText() {
        return text;
    }
}
