package ocp.enums;

enum Season{
  SUMMER, FALL, WINTER, SPRING
}

public class Switch{
  public static void main(String[] args) {
    Season s = Season.SUMMER;
    switch(s){
      // case Season.SUMMER: System.out.println("go swimming");SEason.SUMMER is wrong
      case SUMMER: System.out.println("go swimming");    }
  }
}
