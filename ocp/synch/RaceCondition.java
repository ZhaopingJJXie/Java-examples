package ocp.synch;

import java.util.*;

 class Show{
   // /create a singleton instance, make it volatile
  private static volatile Show INSTANCE;
  private Set<String> availableSeats;
  public synchronized static Show getInstance(){
    //synchronize the getInstance only one instance can exist
    if(INSTANCE == null){
      INSTANCE = new Show();
    }
    return INSTANCE;
  }
  private Show(){
    availableSeats = new HashSet<String>();
    availableSeats.add("1A");
    availableSeats.add("1B");
  }

  public synchronized boolean bookSet(String seat){//synchronize the book method 
  return availableSeats.remove(seat);
}
}

public class RaceCondition{
  public static void main(String[] args){
    RaceCondition rd= new RaceCondition();
    rd.go();
  }
  public void go(){
    //create  Thread1, which will try to book 1A and 1B
    Thread getSeat1 = new Thread(() -> {
      ticketAgentBooks("1A");
      ticketAgentBooks("1B");

    });
    //create Thread2, which will try to book 1A and 1B
    Thread getSeat2 = new Thread(() ->{
      ticketAgentBooks("1A");
      ticketAgentBooks("1B");

    });
    getSeat1.start();
    getSeat2.start();
}
    public void ticketAgentBooks(String seat){
        Show show = Show.getInstance();
        System.out.println(Thread.currentThread().getName() + " : " +
        show.bookSet(seat));
    }
  }
