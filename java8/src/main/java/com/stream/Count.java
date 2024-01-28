package com.stream;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Count {

  private static final Logger LOG = LoggerFactory.getLogger(Count.class);

  public static void main(String[] args) {
    // print the count of strings that have length greater than 2
    List<String> strings = Arrays.asList("AAA", "BB", "CCC");
    long count = strings.stream() //
        .filter(str -> str.length() > 2) //
        .count();
    LOG.info("Count: {}", count);
  }

}
