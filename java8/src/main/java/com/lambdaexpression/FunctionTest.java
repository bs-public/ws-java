package com.lambdaexpression;

import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FunctionTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(FunctionTest.class);

  public static void main(String[] args) {
    Function<String, Integer> f = s -> s.length();
    Integer length = f.apply("Java8");
    LOGGER.info("String Length: {}", length);
  }

}
