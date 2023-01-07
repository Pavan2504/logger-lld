package com.logger.publisher;

import com.logger.enums.LoggerLevel;
import com.logger.model.LoggerMessage;
import com.logger.subscriber.Subscriber;

import java.util.*;
import java.util.function.Supplier;


public class LoggerMessagePublisher implements Publisher<LoggerLevel, Subscriber, LoggerMessage> {

    private Map<LoggerLevel, List<Subscriber>> subscribers;
    Supplier<LinkedList> printerList = () -> new LinkedList<>();

    public LoggerMessagePublisher() {
        this.subscribers = new HashMap<>();
    }

    public void subscribe(LoggerLevel level, Subscriber printer) {
        List<Subscriber> printers = subscribers.getOrDefault(level, printerList.get());
        printers.add(printer);
        subscribers.put(level, printers);
    }

    public void publish(LoggerMessage message) {
        subscribers.getOrDefault(message.getLevel(), Collections.emptyList())
                .stream()
                .forEach(printer -> printer.subscribe(message));
    }
}