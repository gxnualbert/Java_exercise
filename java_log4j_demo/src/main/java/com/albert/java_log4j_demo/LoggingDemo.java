package com.albert.java_log4j_demo;


import java.util.logging.ConsoleHandler;
import  java.util.logging.Logger;
import java.util.logging.Level;
public class LoggingDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("LoggingDemo");

        //显示所有等级的信息
        logger.setLevel(Level.ALL);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        //显示所有等级的信息
        consoleHandler.setLevel(Level.ALL);
        //设定Handler为!ConsoleHandler
        logger.addHandler(consoleHandler);
        logger.severe("logger.severe 严重信息");
        logger.warning("logger.warning 警示信息");
        logger.info("logger.info 一般信息");
        logger.config("logger.config 设定方面的信息");
        logger.fine("logger.fine 细微的信息");
        logger.finer("logger.finer 更细微的信息");
        logger.finest("logger.finest 最细微的信息");
    }
}
