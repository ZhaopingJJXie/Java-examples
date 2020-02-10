package ocp.instant;
import java.util.*;
import java.time.*;

public class InstantDemo{
  public static void main(String[] args){
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = LocalDateTime.now();
    ZoneId zoneId = ZoneId.systemDefault();
    ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
    long epochSeconds = 0;
    Instant instant1 = Instant.now();
    Instant instant2 = Instant.ofEpochSecond(epochSeconds);
    // Instant instant3 = dateTime.toInstant();//
    Instant instant4 = zonedDateTime.toInstant();

    System.out.println(instant1);
    System.out.println(instant2);
    System.out.println(instant4);
    Period p = Period.ofDays(40);
    System.out.println(p);//P40D
    instant4.plusDays(p);  

  }
}
