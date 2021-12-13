package com.example.console;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;

public class Main {

    public static void main(String[] args) throws Exception {
        ConfigurationSource config = new ConfigurationSource(Main.class.getResourceAsStream("./log4j2.xml"));
        Configurator.initialize(null, config);

        Logger logger = LogManager.getLogger(Main.class);
        logger.info("info msg");
        logger.warn("warn msg");
        logger.error("error msg error");
    }
}
