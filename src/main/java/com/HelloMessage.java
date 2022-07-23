package com;

public class HelloMessage {
    private String message;

    public HelloMessage(String message) {
        this.message = message;
    }

    public HelloMessage() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}
