package com.app;

import com.provider.GreetingsProvider;
import com.service.GreetingsService;

public class Main {

  public static void main(String... args) {
    GreetingsProvider provider = GreetingsProvider.getInstance();
    GreetingsService service = provider.serviceImpl();
    service.sayHello("World");
  }

}
