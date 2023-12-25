package com.lambdaexpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SortElements {

  private static final Logger LOGGER = LoggerFactory.getLogger(SortElements.class);

  public static void main(String[] args) {
    List<String> names = Arrays.asList("User2", "User1", "User3");
    // Before Java 8
    names.sort(new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return s1.compareTo(s2);
      }
    });
    LOGGER.info("{}", names);
    
    // using Java 8
    names = Arrays.asList("User2", "User1", "User3");
    names.sort((s1, s2) -> s1.compareTo(s2));
    LOGGER.info("{}", names);
    
    // or
    names = Arrays.asList("User2", "User1", "User3");
    names.sort(String::compareTo);
    LOGGER.info("{}", names);
  }

}
