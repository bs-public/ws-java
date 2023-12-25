package com.lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LambdaOperations {

  private static final Logger LOGGER = LoggerFactory.getLogger(LambdaOperations.class);

  public static void main(String[] args) {

    // prior to java 8
    List<Integer> numbers = Arrays.asList(1, 4, 2, 3, 5);

    Comparator<Integer> comparator = new Comparator<Integer>() {
      @Override
      public int compare(Integer i1, Integer i2) {
        return i1 - i2;
      }
    };

    Collections.sort(numbers, comparator);
    LOGGER.info("{}", numbers);

    // with java 8
    List<Integer> nums = Arrays.asList(1, 4, 2, 3, 5);
    // Comparator<Integer> comp = (Integer i1,Integer i2) -> i1 - i2;
    Comparator<Integer> comp = (i1, i2) -> i1 - i2;
    Collections.sort(nums, comp);
    LOGGER.info("{}", nums);
  }

}
