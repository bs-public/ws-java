package com;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.spi.CachingProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Sample with Jcache(JSR-107) with Ehcache.
 */
public class App {

  private static final Logger logger = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    CachingProvider provider = Caching.getCachingProvider();
    CacheManager cacheManager = provider.getCacheManager();

    MutableConfiguration<String, User> configuration = new MutableConfiguration<String, User>();
    Cache<String, User> userCache = cacheManager.createCache("user-cache", configuration);

    String name = "Test";
    String email = "test@test.com";

    User user = new User();
    user.setName(name);
    user.setEmail(email);

    userCache.put(email, user);

    User cachedUser = userCache.get(email);
    logger.info("User: {}", cachedUser);
    cacheManager.close();
  }

}
