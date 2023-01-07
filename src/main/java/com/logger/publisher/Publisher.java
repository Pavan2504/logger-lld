package com.logger.publisher;

public interface Publisher<A, B, C> {

    void subscribe(A loggerLevel, B subscriber);

    void publish(C loggerMessage);

}
