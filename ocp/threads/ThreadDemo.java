package ocp.threads;

//create a second thread
class NewThread implements Runnable{
  Thread t;
  NewThread(){
    //create a new, seond thread
    t = new Thread(this, "Demo Thread");
    System.out.println("child thread: " + t);
  }
  //this is the entry point for the second thread
  public void run(){
    try{
      for (int i = 5; i > 0; i--){
        System.out.println("child thread: " + i);
        Thread.sleep(500);
      }
    }catch(InterruptedException e){
      System.out.println("child interrupted.");
    }
    System.out.println("Exiting child thread.");
  }
}

public class ThreadDemo{
  public static void main(String[] args){
    NewThread nt = new NewThread();
    nt.t.start();//start the thread
    try{
      for (int i = 5; i > 0; i--){
        System.out.println("main thread: " + i);
        Thread.sleep(1000);}
      }catch(InterruptedException e){
        System.out.println("main thread interrupted.");
      }
      System.out.println("main thread existing.");
    }
  }
