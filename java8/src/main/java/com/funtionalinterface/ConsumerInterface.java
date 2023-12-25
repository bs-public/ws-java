package com.funtionalinterface;

import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ConsumerInterface {

  private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerInterface.class);

  public static void main(String[] args) {
    Integer[] x = {2, 5, 6, 3, 5, 7};
    Consumer<Integer> c = i -> LOGGER.info("{}", i);
    for (Integer num : x) {
      c.accept(num);
    }
  }

}
