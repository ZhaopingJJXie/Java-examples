package ocp.enums;
enum OnlyONce{
  ONCE(true),
  TWICE(true);
  private OnlyONce(boolean bool){
    System.out.println("constructing");
  }
}
public class TestEnum {

  public static int ataA = 10 ;
  public static void main(String[] arags){
      // enum Color{RED, YELLOW, BLUE}//enum types must be local,
      // no enum inside method
    Season s1 = Season.valueOf("SUMMER");
    // Season s2 = Season.valueOf("summer");//IllegalArgumentException
    Season2.SUMMER.printExpectedVisitors();
    OnlyONce firstCall = OnlyONce.ONCE;//print constructing
  //  OnlyONce secondCall = OnlyONce.ONCE;//doesnot print constructing
    Season3.SUMMER.printHours();
    Season4.FALL.printHours();

  }
}
