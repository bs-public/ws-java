package com.lambdaexpression;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface HelloWorldInterface {
  public void hello();
}

public class HelloWorld {

  private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);

  public static void main(String[] args) {
    // The target type of this expression must be a functional interface
    HelloWorldInterface helloWorldInterface = () -> LOGGER.info("Hello, Java8");
    helloWorldInterface.hello();
  }

}


