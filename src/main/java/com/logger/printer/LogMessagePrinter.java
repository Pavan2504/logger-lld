package com.logger.printer;

import com.logger.enums.PrinterType;
import com.logger.model.LoggerMessage;

public interface LogMessagePrinter {
    void printLogMessage(LoggerMessage message);

    PrinterType getPrinterType();
}
