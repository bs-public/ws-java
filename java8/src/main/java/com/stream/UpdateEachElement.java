package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateEachElement {

  private static final Logger LOG = LoggerFactory.getLogger(UpdateEachElement.class);

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    List<Integer> squares = numbers.stream() //
        .map(n -> n * n) //
        .collect(Collectors.toList()); //
    LOG.info("Output: {}", squares);
  }

}
