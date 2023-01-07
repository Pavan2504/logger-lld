package com.logger.factory;

import com.logger.enums.PrinterType;
import com.logger.printer.LogMessagePrinter;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LogMessagePrinterFactory implements Factory<LogMessagePrinter, PrinterType> {

    private Map<PrinterType, LogMessagePrinter> printersMapper;


    public LogMessagePrinterFactory(final List<LogMessagePrinter> printers) {
        printersMapper = Optional.ofNullable(printers)
                .orElse(Collections.emptyList())
                .stream()
                .collect(Collectors.toMap(LogMessagePrinter::getPrinterType, Function.identity()));
    }

    @Override
    public LogMessagePrinter get(PrinterType printerType) {
        printersMapper.computeIfAbsent(printerType, key -> {
            throw new RuntimeException(key + " not found");
        });

        return printersMapper.get(printerType);
    }
}

