package com.lambdaexpression;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lambda expression (argument) -> (body)
 */
public class LambdaExample {

  private static final Logger LOGGER = LoggerFactory.getLogger(LambdaExample.class);

  public static void main(String[] args) {
    GreetInterface greetInterface = () -> {
      return "Welcome to Java8";
    };

    String msg = greetInterface.greeting();
    LOGGER.info("{}", msg);
  }

}


@FunctionalInterface
interface GreetInterface {
  String greeting();
}
