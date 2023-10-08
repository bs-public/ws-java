package com.creational.singleton.eagerinitialization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Eager Initialization Approach:
 *
 * <p>Create an instance of the Singleton class at the time of class loading.
 */
class Singleton {
  private static final Singleton instance = new Singleton();

  private Singleton() {}

  public static Singleton getInstance() {
    return instance;
  }
}

public class SingletonTest {
  private static final Logger LOGGER = LoggerFactory.getLogger(SingletonTest.class);

  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    LOGGER.info("Singleton instance :{}", singleton);
  }
}
