package com.logger.config;

import com.logger.enums.LoggerLevel;
import com.logger.printer.LogMessagePrinter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LoggerConfiger {

    private Map<LoggerLevel, List<LogMessagePrinter>> mapper = new HashMap<>();
    private LoggerLevel level;

    public void mapLevelToSink(LoggerLevel level, LogMessagePrinter logMessagePrinter) {
        final List<LogMessagePrinter> logMessagePrinters = mapper.getOrDefault(level, new LinkedList<>());
        logMessagePrinters.add(logMessagePrinter);
        mapper.put(level, logMessagePrinters);
    }

    public void setLevel(LoggerLevel level) {
        this.level = level;
    }

    public LoggerLevel getLevel() {
        return this.level;
    }


    public Map<LoggerLevel, List<LogMessagePrinter>> getMapper() {
        return mapper;
    }
}
