package com.logger.printer.impl;

import com.logger.enums.PrinterType;
import com.logger.model.LoggerMessage;
import com.logger.printer.LogMessagePrinter;

public class DBLogMessagePrinter implements LogMessagePrinter {

    @Override
    public void printLogMessage(LoggerMessage message) {

    }

    @Override
    public PrinterType getPrinterType() {
        return PrinterType.DB;
    }
}
