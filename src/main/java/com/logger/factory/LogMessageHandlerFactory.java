package com.logger.factory;

import com.logger.enums.LoggerLevel;
import com.logger.handler.LogMessageHandler;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LogMessageHandlerFactory implements Factory<LogMessageHandler, LoggerLevel> {
    private Map<LoggerLevel, LogMessageHandler> handlerMapper;

    public LogMessageHandlerFactory(final List<LogMessageHandler> printers) {
        handlerMapper = Optional.ofNullable(printers)
                .orElse(Collections.emptyList())
                .stream()
                .collect(Collectors.toMap(LogMessageHandler::getLevel, Function.identity()));
    }

    @Override
    public LogMessageHandler get(LoggerLevel level) {
        handlerMapper.computeIfAbsent(level, key -> {
            throw new RuntimeException(key + " not found");
        });
        return handlerMapper.get(level);
    }
}
