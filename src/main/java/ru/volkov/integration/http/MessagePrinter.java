package ru.volkov.integration.http;

import org.springframework.messaging.Message;

public class MessagePrinter {

    public String print(Message<?> message) {
        System.out.println("Message printer is working the message");
        return "Message from inbound gateway";
    }

    public void printConsole(Message<?> message) {
        System.out.println("Message was passed to printConsole method");
        System.out.println(message);
    }
}
