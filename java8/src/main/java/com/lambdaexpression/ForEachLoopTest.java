package com.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForEachLoopTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(ForEachLoopTest.class);

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 3, 2, 9, 8, 5);

    LOGGER.info("iterate using simple external for loop");
    for (int i = 0; i < list.size(); i++) {
      LOGGER.info("{}", list.get(i));
    }

    LOGGER.info("iterate using advanced external for loop");
    for (Integer i : list) {
      LOGGER.info("{}", i);
    }

    LOGGER.info("iterate using internal loop in java 8");
    list.forEach(i -> LOGGER.info("{}", i));
  }

}

