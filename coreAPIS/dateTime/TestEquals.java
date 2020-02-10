/**
docuemntation comment here
*/
package coreAPIS.dateTime;
//this is a comment
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import static java.lang.System.out;//static import

public class TestEquals{
  public static void main(String args[]){
      Myclass mc = new Myclass();
      LocalDate ld1 = LocalDate.of(2019, 10, 12);
      LocalDate ld2 = LocalDate.of(2019, 10, 12);
      out.println(ld1.equals(ld2));//true
      out.println(ld1.isEqual(ld2));//true
      LocalTime badTime = LocalTime.parse("12:30:15");//DateTimeParseException
    }
  }
