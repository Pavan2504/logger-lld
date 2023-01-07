package com.logger;

import com.logger.context.LoggerMessageContext;
import com.logger.enums.LoggerLevel;
import com.logger.model.LoggerMessage;

import java.time.LocalDate;

public class Logger implements ILogger {

    private LoggerMessageContext loggerMessageContext;

    public void info(String message) {
        LoggerMessage loggerMessage = LoggerMessage.builder()
                .date(LocalDate.now())
                .level(LoggerLevel.INFO)
                .message(message)
                .build();
        loggerMessageContext.logMessage(loggerMessage);
    }

    public void error(String message) {
        LoggerMessage loggerMessage = LoggerMessage.builder()
                .date(LocalDate.now())
                .level(LoggerLevel.ERROR)
                .message(message)
                .build();
        loggerMessageContext.logMessage(loggerMessage);
    }

    public void warn(String message) {
        LoggerMessage loggerMessage = LoggerMessage.builder()
                .date(LocalDate.now())
                .level(LoggerLevel.WARN)
                .message(message)
                .build();
        loggerMessageContext.logMessage(loggerMessage);
    }


}
