package com.logger.manager;

import com.logger.config.LoggerConfiger;
import com.logger.enums.LoggerLevel;
import com.logger.printer.LogMessagePrinter;
import com.logger.publisher.LoggerMessagePublisher;
import com.logger.subscriber.LoggerMessageSubscriber;
import com.logger.subscriber.Subscriber;

import java.util.List;
import java.util.Map;

public class LoggerManager implements Manager {

    private LoggerConfiger loggerConfiger;
    private LoggerMessagePublisher publisher;


    public void manage() {
        final Map<LoggerLevel, List<LogMessagePrinter>> mapper = loggerConfiger.getMapper();
        for (Map.Entry<LoggerLevel, List<LogMessagePrinter>> entry : mapper.entrySet())
            for (LogMessagePrinter printer : entry.getValue()) {
                Subscriber subscriber = new LoggerMessageSubscriber(printer);
                publisher.subscribe(entry.getKey(), subscriber);
            }
    }
}
