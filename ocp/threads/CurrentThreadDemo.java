package ocp.threads;
//controlling the main thread

public class CurrentThreadDemo{
  public static void main(String[] args){
    Thread t = Thread.currentThread();
    System.out.println("current thread: " + t);
    //change the name of thread
    t.setName("My thread");
    System.out.println("After name change: " + t);
    try{
      for (int n = 5; n > 0; n--){
        System.out.println(n);
        Thread.sleep(3000);}
      }catch(InterruptedException e){
        System.out.println("main thread interrupted");
      }
    }
  }
