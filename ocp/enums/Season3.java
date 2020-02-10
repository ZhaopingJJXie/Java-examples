package ocp.enums;

public enum Season3{
  WINTER{
    public void printHours(){
      System.out.println("9am - 3pm");
    }
  },//this is a comma,
  SPRING{
    public void printHours(){
      System.out.println("9am - 5pm");
    }
  },
  SUMMER{
    public void printHours(){
      System.out.println("9am - 7pm");
    }
  },
  FALL{
    public void printHours(){
      System.out.println("9am - 5pm");
    }
  };//this is a semicolon
  //printHours should be implemented in every value
  public abstract void printHours();
}
