package ocp.enums;

public enum Season4{
  WINTER{
    public void printHours(){
      System.out.println("9am - 3pm");
    }
  },
  WUMMER{
    public void printHours(){
      System.out.println("9am - 7pm");
    }
  },SPRING, FALL;//semi-colon is neede here
  // SPRING and FALL get default implementation
  public void printHours(){
    System.out.println("9am - 5am");
  }
}
