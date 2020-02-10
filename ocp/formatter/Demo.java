package ocp.formatter;

import java.time.*;
import java.time.format.*;

public class Demo{
  public static void main(String[] args) {
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM dd yyyy")``;
    LocalDate date1 = LocalDate.parse("01 02 2015", f1);
    System.out.println(date1);
  }

}
