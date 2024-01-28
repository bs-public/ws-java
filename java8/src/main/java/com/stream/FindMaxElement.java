package com.stream;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FindMaxElement {

  private static final Logger LOG = LoggerFactory.getLogger(FindMaxElement.class);

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 5, 30, 15, 25);

    int max = numbers.stream() //
        .mapToInt(Integer::intValue) //
        .max() //
        .getAsInt();
    LOG.info("Max Element: {}", max);
  }

}
