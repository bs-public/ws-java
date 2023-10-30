package com.creational.singleton.lazyinitialization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lazy Initialization:
 *
 * <p>Create an instance only when getInstance() is called for the first time.
 */
class Singleton {
  private static Singleton instance;

  private Singleton() {}

  public static synchronized Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}

public class Main {
  private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    LOGGER.info("Singleton instance: {}", singleton);
  }
}
