package com.funtionalinterface;

import java.util.function.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PredicateTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(PredicateTest.class);

  public static void main(String[] args) {
    Integer[] x = {4, 2, 5, 3, 7, 8};

    Predicate<Integer> p1 = i -> i > 5;
    Predicate<Integer> p2 = i -> i % 2 == 0;

    LOGGER.info("Greater than 5:");
    show(p1, x);

    LOGGER.info("Even numbers:");
    show(p2, x);

    LOGGER.info("Odd numbers:");
    show(p2.negate(), x);

    LOGGER.info("Even/Odd numbers:");
    show(p2.or(p2.negate()), x);

    LOGGER.info("Either Even or Greater than 5, numbers:");
    show(p2.or(p1), x);

    LOGGER.info("Even and Greater than 5, numbers:");
    show(p2.and(p1), x);
  }

  private static void show(Predicate<Integer> p1, Integer[] x) {
    for (Integer num : x) {
      if (p1.test(num)) {
        LOGGER.info("{}", num);
      }
    }
  }

}
