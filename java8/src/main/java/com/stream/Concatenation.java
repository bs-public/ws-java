package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Concatenation {

  private static final Logger LOG = LoggerFactory.getLogger(Concatenation.class);

  public static void main(String[] args) {
    List<String> strings = Arrays.asList("AAA", "BBB", "CCC");

    String str = strings.stream().collect(Collectors.joining());

    LOG.info("Output: {}", str);
  }

}
