package com.creational.singleton.doublechecklocking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Double-Checked Locking Approach:
 *
 * <p>With this approach we can minimize the overhead of the synchronized keyword by checking twice
 * if the instance is null.
 *
 * <p>Memory writes that happen in one thread can "leak through" and be seen by another thread, but
 * this is by no means guaranteed. Without explicit communication, you can't guarantee which writes
 * get seen by other threads, or even the order in which they get seen.
 *
 * <p>The Java volatile modifier is an example of a special mechanism to guarantee that
 * communication happens between threads. When one thread writes to a volatile variable, and another
 * thread sees that write, the first thread is telling the second about all of the contents of
 * memory up until it performed the write to that volatile variable
 */
class Singleton {

  private static volatile Singleton instance;

  private Singleton() {}

  public static Singleton getInstance() {
    if (instance == null) {
      synchronized (Singleton.class) {
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }
    return instance;
  }
}

public class Main {

  private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    LOGGER.info("Singleton: {}", singleton);
  }
}
