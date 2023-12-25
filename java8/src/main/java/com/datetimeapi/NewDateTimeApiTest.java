package com.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewDateTimeApiTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(NewDateTimeApiTest.class);

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    LOGGER.info("localDate: {}", localDate);

    LocalTime localTime = LocalTime.now();
    LOGGER.info("localTime: {}", localTime);

    LocalDateTime localDateTime = LocalDateTime.now();
    LOGGER.info("localDateTime: {}", localDateTime);

    ZoneId zoneId = ZoneId.of("America/New_York");
    ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
    LOGGER.info("zonedDateTime: {}", zonedDateTime);

    Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
    LOGGER.info("allZoneIds: {}", allZoneIds);
  }

}
