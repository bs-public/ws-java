package com.funtionalinterface;

import java.util.function.BiPredicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * BiPredicate<L, R> (L, R) -> boolean
 */
public class BiPredicateInterfaceTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(BiFunctionInterfaceTest.class);

  public static void main(String[] args) {
    BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equalsIgnoreCase(s2);

    boolean output1 = biPredicate.test("abc", "xyz");
    LOGGER.info("Output1: {}", output1);

    boolean output2 = biPredicate.test("abc", "abc");
    LOGGER.info("Output2: {}", output2);
  }

}
