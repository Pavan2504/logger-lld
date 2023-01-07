package com.logger.context;

import com.logger.factory.LogMessageHandlerFactory;
import com.logger.handler.LogMessageHandler;
import com.logger.model.LoggerMessage;

public class LoggerMessageContext {
    private LogMessageHandlerFactory messageHandlerFactory;

    public void logMessage(LoggerMessage message) {
        final LogMessageHandler messageHandler = messageHandlerFactory.get(message.getLevel());
        messageHandler.handle(message);
    }


}
