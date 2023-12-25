package com.interfacedefaultmethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * default methods in Interfaces
 * 
 * Traditionally interfaces used to have only abstract methods to achieve abstraction in Java.
 * Abstract methods are needed to be defined in the implemented classes. After Java 8 release,
 * default methods are added to interfaces to add extra features to current interfaces without
 * disrupting the current implementations. For example, stream() is a default method added to
 * Collection interface. Had stream() would have been added as an abstract method, all the classes
 * implementing Collection interface had to define stream() which would have irked developers. Since
 * stream() is a default method, all the classes implementing Collection interface inherit the
 * default implementation
 *
 */
@FunctionalInterface
interface DefaultMethodInterface {
  public static final Logger LOGGER = LoggerFactory.getLogger(DefaultMethodInterface.class);

  void abstractMethod();

  default void defaultMethod() {
    LOGGER.info("Default Method in interface");
  }
}


public class DefaultMethodTest implements DefaultMethodInterface {

  private static final Logger LOGGER = LoggerFactory.getLogger(DefaultMethodTest.class);

  @Override
  public void abstractMethod() {
    LOGGER.info("Abstract method implementation");
  }

  public static void main(String[] args) {
    DefaultMethodTest defaultMethodExample = new DefaultMethodTest();
    defaultMethodExample.abstractMethod();
    defaultMethodExample.defaultMethod();
  }

}


