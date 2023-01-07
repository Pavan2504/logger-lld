package com.logger.subscriber;

import com.logger.model.LoggerMessage;
import com.logger.printer.LogMessagePrinter;

public class LoggerMessageSubscriber implements Subscriber<LoggerMessage> {
    private LogMessagePrinter logMessagePrinter;

    public LoggerMessageSubscriber(LogMessagePrinter logMessagePrinter) {
        this.logMessagePrinter = logMessagePrinter;
    }

    @Override
    public void subscribe(LoggerMessage message) {
        logMessagePrinter.printLogMessage(message);
    }

}
