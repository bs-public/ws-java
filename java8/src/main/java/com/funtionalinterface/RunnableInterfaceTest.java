package com.funtionalinterface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunnableInterfaceTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(RunnableInterfaceTest.class);

  public static void main(String[] args) {
    Runnable r = () -> {
      for (int i = 0; i < 100; i++) {
        LOGGER.info("Other Thread");
      }
    };

    Thread t = new Thread(r);
    t.start();

    for (int i = 0; i < 100; i++) {
      LOGGER.info("Main Thread");
    }
  }

}
