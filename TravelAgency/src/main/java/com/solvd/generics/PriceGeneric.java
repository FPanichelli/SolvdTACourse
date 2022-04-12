package com.solvd.generics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PriceGeneric<T> {
    private static final Logger LOGGER = LogManager.getLogger(PriceGeneric.class);
    private T data;

    public void print() {
        LOGGER.info(data);
    }

    public void setData(T t) {
        this.data = t;
    }

    public T getData() {
        return this.data;
    }
}