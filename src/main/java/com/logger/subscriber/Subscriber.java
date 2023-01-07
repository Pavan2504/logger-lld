package com.logger.subscriber;

import com.logger.model.LoggerMessage;

public interface Subscriber<T> {
    void subscribe(T message);
}
