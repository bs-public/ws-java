package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {

  private static final Logger log = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    App app = new App();
    log.info(app.getMessage());
  }

  public String getMessage() {
    return "Hello JUnit5";
  }

}
