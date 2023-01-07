package com.logger.model;

import com.logger.enums.LoggerLevel;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class LoggerMessage {

    private String message;
    private LoggerLevel level;
    private LocalDate date;

}
