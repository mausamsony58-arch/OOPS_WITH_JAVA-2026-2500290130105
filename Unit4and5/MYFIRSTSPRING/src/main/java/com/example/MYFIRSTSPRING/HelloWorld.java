package com.example.MYFIRSTSPRING;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    public static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    public String display() {
        logger.info("Program run successfully");
        logger.warn("Give valid");
        logger.error("Error");
        return "Hello World";
    }
}