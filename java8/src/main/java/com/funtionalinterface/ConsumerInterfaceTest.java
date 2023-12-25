package com.funtionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * forEach() method required consumer as its parameter.
 */
class ConsumerImpl implements Consumer<Integer> {

  private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerImpl.class);

  @Override
  public void accept(Integer t) {
    LOGGER.info("{}", t);
  }

}


public class ConsumerInterfaceTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerInterfaceTest.class);

  public static void main(String[] args) {
    List<Integer> values = Arrays.asList(2, 3, 1);

    Consumer<Integer> consumer = new ConsumerImpl();
    values.forEach(consumer);

    consumer = i -> LOGGER.info("{}", i);
    values.forEach(consumer);

    // above can also be done as
    LOGGER.info("using lambda expression");
    values.forEach(i -> LOGGER.info("{}", i));
  }

}
