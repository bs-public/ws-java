package com.creational.singleton.enumsingleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Enum Singleton approach:
 *
 * <p>This approach is inherently thread-safe and handles serialization and reflection issues out of
 * the box.
 *
 * <p>The Enum Singleton approach is inherently thread-safe and handles serialization and reflection
 * issues out of the box.
 *
 * <p>The Enum Singleton is highly recommended due to its simplicity, built-in thread safety, and
 * resistance to serialization and reflection attacks.
 *
 * <p>The instance has a lazy initialization. The Singleton instance will be created when the Enum
 * is referenced for the first time. The Java Enum is thread-safe by default. The Enum provides
 * built-in serialization, ensuring that duplicate instances are not created as a result of
 * deserialization. Reflection can't be used to destroy the Singleton property of the Enum.
 */
enum Singleton {
  INSTANCE;

  private Map<String, String> props;

  Singleton() {
    props = new HashMap<>();
    props.put("Key1", "Value1");
  }

  public String get(String key) {
    return props.get(key);
  }
}

public class Main {
  private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    Singleton singleton = Singleton.INSTANCE;

    String value = singleton.get("Key1");
    LOGGER.info("Value: {}", value);
  }
}
