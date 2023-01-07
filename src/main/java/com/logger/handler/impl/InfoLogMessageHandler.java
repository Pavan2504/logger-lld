package com.logger.handler.impl;

import com.logger.enums.LoggerLevel;
import com.logger.handler.LogMessageHandler;
import com.logger.model.LoggerMessage;
import com.logger.publisher.LoggerMessagePublisher;

public class InfoLogMessageHandler implements LogMessageHandler {
    private LoggerMessagePublisher publisher;

    @Override
    public void handle(LoggerMessage message) {
        publisher.publish(message);
    }

    public LoggerLevel getLevel() {
        return LoggerLevel.INFO;
    }

}
