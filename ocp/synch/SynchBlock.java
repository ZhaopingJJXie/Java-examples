package ocp.synch;
//this program uses synchronized block
class Callme{
 void call(String msg){
    System.out.print("[ " + msg);
    try{
      Thread.sleep(1000);
    }catch(InterruptedException e){
      System.out.println("interrupted");
    }
    System.out.println(" ]");
  }
}

class Caller implements Runnable{
  String msg;
  Callme target;
  Thread t;

  public Caller(Callme targ, String s){
    target = targ;
    msg = s;
    t = new Thread(this);
  }
  //sychronize calls to call()
  public void run(){
    synchronized(target){//synhronized block
    target.call(msg);
  }
  }
}

public class SynchBlock{
  public static void main(String[] args){
    Callme target = new Callme();
    Caller ob1 = new Caller(target, "Hello");
    Caller ob2 = new Caller(target, "Synchronized");
    Caller ob3 = new Caller(target, "World");
    //start the threads
    ob1.t.start();
    ob2.t.start();
    ob3.t.start();
    //wait for the threads to end
    try{
      ob1.t.join();
      ob2.t.join();
      ob3.t.join();
    }catch(InterruptedException e){
      System.out.println("interrupted");
    }
  }
}
