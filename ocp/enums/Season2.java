package ocp.enums;

public enum Season2{
  WINTER("Low"), SPRING("medium"), SUMMER("High"), FALL("medium");//; is mandatory
  private String prefix = "java";
  private  final String expectedVisitors;//final value not initialized
  private Season2(String expectedVisitors){//private or package private
    this.expectedVisitors = expectedVisitors + prefix;
  }
  public void printExpectedVisitors(){
    System.out.println(expectedVisitors);
  }
}
