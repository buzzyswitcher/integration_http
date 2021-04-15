package ru.volkov.integration.http;

import org.springframework.messaging.Message;

public class MessagePrinter {

    public void print(Message<?> message) {
        System.out.println(message);
    }

    public void printConsole(Message<?> message) {
        System.out.println("Message was passed to printConsole method");
        System.out.println(message);
    }
}
