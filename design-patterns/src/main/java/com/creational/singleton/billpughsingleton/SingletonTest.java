package com.creational.singleton.billpughsingleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Bill Pugh Singleton Approach:
 *
 * <p>The inner class is referenced no earlier (and therefore loaded no earlier by the class loader)
 * than the moment that getInstance() is called. Thus, this solution is thread-safe without
 * requiring special language constructs (i.e. volatile or synchronized).
 */
class Singleton {

  private Singleton() {}

  private static class SingletonHelper {
    private static final Singleton instance = new Singleton();
  }

  public static Singleton getInstance() {
    return SingletonHelper.instance;
  }
}

public class SingletonTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(SingletonTest.class);

  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    LOGGER.info("Singleton instance :{}", singleton);
  }
}
