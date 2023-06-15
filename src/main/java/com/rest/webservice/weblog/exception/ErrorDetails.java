package com.rest.webservice.weblog.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
    private LocalDateTime timestamp;
    private String massage;
    private String details;

    public ErrorDetails(LocalDateTime timestamp, String massage, String details) {
        this.timestamp = timestamp;
        this.massage = massage;
        this.details = details;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getMassage() {
        return massage;
    }

    public String getDetails() {
        return details;
    }
}
