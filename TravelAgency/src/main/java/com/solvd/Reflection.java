package com.solvd;

import java.lang.reflect.*;

import com.solvd.travelagency.Client;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Reflection {
    public static void main(String[] args) {

        final Logger LOGGER = LogManager.getLogger(Runner.class);

        Client obj = new Client();
        Class client = obj.getClass();

        try {
            Method method[] = client.getDeclaredMethods();

            for (int i = 0; i < method.length; i++) {
                LOGGER.info("Method " + method[i].toString());
            }
        } catch (Exception e) {
            LOGGER.info(e.toString());
        }
    }
}