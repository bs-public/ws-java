package com.funtionalinterface;

import java.util.function.BiConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * BiConsumer<T, U> (T, U) -> void
 */
public class BiConsumerInterfaceTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(BiConsumerInterfaceTest.class);

  public static void main(String[] args) {
    BiConsumer<String, String> biConsumer = (s1, s2) -> {
      LOGGER.info("Message: {}, {} ", s1, s2);
    };
    biConsumer.accept("Welcome", "Test");
  }

}
