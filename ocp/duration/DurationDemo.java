package ocp.duration;
import java.time.*;
import java.time.temporal.*;//for ChronoUnit

//Duration has time units, hour, minute and seconds, can only deal with time object
public class DurationDemo{
  public static void main(String[] args){
    Duration daily1 = Duration.ofDays(1);
    Duration hourly = Duration.ofHours(1);
    Duration everyMinute = Duration.ofMinutes(1);
    Duration everyMilliMinute = Duration.ofMillis(1);
    Duration everyNanoSecond = Duration.ofNanos(1);

    Duration daily2 = Duration.of(1, ChronoUnit.DAYS);
    Duration daily = Duration.of(1, ChronoUnit.DAYS);
    LocalDate date = LocalDate.of(2015, 5, 25);
    Duration days = Duration.ofDays(1);
    Period period = Period.ofDays(1);
    System.out.println(date.plus(period));
    // System.out.println(date.plus(days));//UnsupportedTemporalTypeException: Unsupported unit: Seconds

    LocalTime one = LocalTime.of(5, 15);
    LocalTime two = LocalTime.of(6, 30);
    LocalDate date = LocalDate.of(2016, 1, 20);
    System.out.println(ChronoUnit.HOURS.between(one, two)); //1
    System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
    System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException

  }
}
