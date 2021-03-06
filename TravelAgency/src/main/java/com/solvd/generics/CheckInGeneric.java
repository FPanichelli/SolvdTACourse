package com.solvd.generics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

public class CheckInGeneric<T, U> {

    private T data1;
    private U data2;

    private static final Logger LOGGER = LogManager.getLogger(CheckInGeneric.class);

    public void print() {
        LOGGER.info(data1 + ", " + data2);
    }

    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public U getData2() {
        return data2;
    }

    public void setData2(U data2) {
        this.data2 = data2;
    }
}
