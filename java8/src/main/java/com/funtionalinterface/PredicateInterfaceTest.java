package com.funtionalinterface;

import java.util.function.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PredicateInterfaceTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(BiFunctionInterfaceTest.class);

  public static void main(String[] args) {
    Integer[] x = {10, 70, 30, 87, 50};

    Predicate<Integer> p = i -> i > 50;
    LOGGER.info("Greater than 50:");

    for (Integer num : x) {
      if (p.test(num)) {
        LOGGER.info("{}", num);
      }
    }

  }

}
