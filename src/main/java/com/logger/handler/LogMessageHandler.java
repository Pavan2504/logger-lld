package com.logger.handler;

import com.logger.enums.LoggerLevel;
import com.logger.model.LoggerMessage;


public interface LogMessageHandler {
    void handle(LoggerMessage message);

    LoggerLevel getLevel();

}
