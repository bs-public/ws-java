package com.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.service.GreetingsService;

public class GreetingsServiceImpl implements GreetingsService {

  private static final Logger logger = LoggerFactory.getLogger(GreetingsServiceImpl.class);

  public void sayHello(String name) {
    logger.info("Hello " + name);
  }

}
