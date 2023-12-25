package com.funtionalinterface;

import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Supplier Interface : function which does not take in any argument but produces a value of type T.
 * The Supplier interface consists of only one function: get()
 */
public class SupplierInterfaceTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(SupplierInterfaceTest.class);

  public static void main(String[] args) {
    Supplier<Double> supplier = () -> Math.random();
    LOGGER.info("{}", supplier.get());
  }

}
