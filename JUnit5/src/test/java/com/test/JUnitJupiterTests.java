package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JUnitJupiterTests {

  private static final Logger log = LoggerFactory.getLogger(JUnitJupiterTests.class);

  @BeforeAll
  static void setup() {
    log.info("@BeforeAll - executes once before all test methods in this class");
  }

  @BeforeEach
  void init() {
    log.info("@BeforeEach - executes before each test method in this class");
  }

  @DisplayName("Single test successful")
  @Test
  void testSingleSuccessTest() {
    log.info("Success");
  }

  @Test
  @Disabled("Not implemented yet")
  void testShowSomething() {}

  @AfterEach
  void tearDown() {
    log.info("@AfterEach - executed after each test method.");
  }

  @AfterAll
  static void done() {
    log.info("@AfterAll - executed after all test methods.");
  }

  @Test
  void lambdaExpressions() {
    assertTrue(Stream.of(1, 2, 3).mapToInt(i -> i).sum() > 5, () -> "Sum should be greater than 5");
  }

  @Test
  void trueAssumption() {
    assumeTrue(5 > 1);
    assertEquals(5 + 2, 7);
  }

  @Test
  void falseAssumption() {
    assumeFalse(5 < 1);
    assertEquals(5 + 2, 7);
  }

  @Test
  void assumptionThat() {
    String someString = "Just a string";
    assumingThat(someString.equals("Just a string"), () -> assertEquals(2 + 2, 4));
  }

  @Test
  void shouldThrowException() {
    Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
      throw new UnsupportedOperationException("Not supported");
    });
    assertEquals(exception.getMessage(), "Not supported");
  }

  @Test
  void assertThrowsException() {
    String str = null;
    assertThrows(IllegalArgumentException.class, () -> {
      Integer.valueOf(str);
    });
  }

}
