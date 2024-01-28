package com.stream;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SumOfEvenNumbers {

  private static final Logger LOG = LoggerFactory.getLogger(SumOfEvenNumbers.class);

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    int sum = numbers.stream() //
        .filter(n -> n % 2 == 0) //
        .mapToInt(Integer::intValue) //
        .sum();
    LOG.info("Sum: {}", sum);
  }

}
