package ocp.threads;

//create a second thread by extending Thread class
class NewThread extends Thread{
  NewThread(){
    super("demo thread");
    System.out.println("child thread " + this);
  }

  //this is the entry point for the second thread
  public void run(){
    try{
      for(int i = 5; i > 0; i--){
        System.out.println("child thread: "  + i );
        Thread.sleep(500);
      }
    }catch(InterruptedException e){
      System.out.println("Child thread interrupted");
    }
    System.out.println("exiting child thread");
  }
}

public class ExtendThread{
  public static void main(String[] args){
    NewThread nt = new NewThread();
    nt.start();//start the thread
    try{
      for(int i = 5; i> 0; i--){
        System.out.println("main thread: " + i);
        Thread.sleep(1000);
      }
    }catch(InterruptedException e){
      System.out.println("main thread interrupted");
    }
    System.out.println("main thread exiting");
  }
}
