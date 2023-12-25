package com.funtionalinterface;

import java.util.function.BiFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * BiFunction<T, U, R> (T, U) -> R
 */
public class BiFunctionInterfaceTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(BiFunctionInterfaceTest.class);

  public static void main(String[] args) {
    BiFunction<Integer, Integer, String> biFunction = (n1, n2) -> {
      int sum = n1 + n2;
      return "sum = " + sum;
    };
    LOGGER.info(biFunction.apply(10, 20));
  }

}
