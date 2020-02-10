package ocp.duration;
import java.time.*;
import java.time.temporal.*;

public class Dura{
  public static void main(String[] args){
    String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();
    String m2 = Duration.ofMinutes(1).toString();
    String s = Duration.of(60, ChronoUnit.SECONDS).toString();//PT1M
    String d = Duration.ofDays(1).toString();
    String p = Period.ofDays(1).toString();
    System.out.println(m1);
    System.out.println(s);
    System.out.println(m1.equals(s));
  }
}
