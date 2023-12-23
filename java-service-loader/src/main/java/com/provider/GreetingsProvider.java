package com.provider;

import java.util.NoSuchElementException;
import java.util.ServiceLoader;
import com.service.GreetingsService;

public class GreetingsProvider {

  private static GreetingsProvider provider;
  private ServiceLoader<GreetingsService> loader;

  private GreetingsProvider() {
    loader = ServiceLoader.load(GreetingsService.class);
  }

  public static GreetingsProvider getInstance() {
    if (provider == null) {
      provider = new GreetingsProvider();
    }
    return provider;
  }

  public GreetingsService serviceImpl() {
    GreetingsService service = loader.iterator().next();
    if (service != null) {
      return service;
    } else {
      throw new NoSuchElementException("No implementation for GreetingsProvider");
    }
  }

}
