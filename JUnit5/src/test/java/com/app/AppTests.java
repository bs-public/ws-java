package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.App;

public class AppTests {

  @Test
  void getMessageTest() {
    String message = "Hello JUnit5";
    App appTest = new App();
    assertEquals(message, appTest.getMessage());
  }

}
