package ocp.synch;

//an incorrect implementation of producer and consumer
class Q{
  int n;
  boolean valueSet = false;
  synchronized int get(){
    while(!valueSet){
      try{
        wait();
      }catch(InterruptedException e){
        System.out.println("Interrupted");
      }
    }
    System.out.println("got: " + n);
    valueSet = false;
    notify();
    return n;
  }
  synchronized void put(int n){
    while(valueSet){
      try{
        wait();  
      }catch(InterruptedException e){
        System.out.println("Interrupted");
      }
    }
    this.n = n ;
    valueSet = true;
    System.out.println("put: " + n);
    notify();
  }
}

class Producer implements Runnable{
  Q q;
  Thread t;

  Producer(Q q){
    this.q = q;
    t = new Thread(this, "producer");
  }
    public void run(){
    int i =0;
    while(true){
      q.put(i++);
    }
  }
}

class Consumer implements Runnable{
  Q q;
  Thread t;

  Consumer(Q q){
    this.q = q;
    t = new Thread(this, "consumer");
  }

  public void run(){
    while(true){
      q.get();
    }
  }
}

public class WaitTech{
  public static void main(String[] args){
    Q q = new Q();
    Producer p = new Producer(q);
    Consumer c = new Consumer(q);
    //start the threads;
    p.t.start();
    c.t.start();

    System.out.println("press control-c to stop");
  }
}
