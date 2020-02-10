package ocp.singleton;

public class VisitorTicketTracker{
  private static VisitorTicketTracker instance;//can not be mark as final here
  private static VisitorTicketTracker(){
    //if it is declared as synchronized, it is safe, but it is costly
    if(instance == null){
      instance = new VisitorTicketTracker();//not thread-safe
    }
    return instance;
  }
}
