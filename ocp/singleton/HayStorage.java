package ocp.singleton;

public class HayStorage{

  private int quantity = 0 ;
  private HayStorage(){}

  // private final static instance of the class
  private static final HayStorage instance = new HayStorage();
//using static initialization block
/*
  private static final HayStorge instance;
  static {
  instance = new HayStorge();
  //ALLOWS  to add additional steps to set up the singleton, also allow to
  handle exceptions thrown from the constructor
}
*/
//accessed by a single public static method
  public static HayStorage getInstance(){
    return instance;
  }
  public synchronized void addHay(int amount){
    quantity += amount;
  }
  public synchronized boolean removeHay(int amount){
    if(quantity < amount) return false;
    quantity -= amount;
    return true;
  }

  public synchronized int getHayQuantity(){
    return quantity;
  }
}
