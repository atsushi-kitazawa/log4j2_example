package com.example.lookup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;

public class Main {
    public static void main(String[] args) throws Exception {
        ConfigurationSource config = new ConfigurationSource(Main.class.getResourceAsStream("./log4j2.xml"));
        Configurator.initialize(null, config);

        Logger logger = LogManager.getLogger(Main.class); 
        // Java Lookup
        logger.info("${java:version}");
        logger.info("${java:runtime}");
        logger.info("${java:vm}");

        // Event lookup
        logger.info("${event:Level}");
        logger.info("${event:Logger}");
        logger.info("${event:ThreadName}");
    }
}
