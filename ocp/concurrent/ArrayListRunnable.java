package ocp.concurrent;

import java.util.*;
// thread unsafe code
// to make it safe, you can use
// Collections.synchronizedList(new ArrayList())
public class ArrayListRunnable implements Runnable{
  //shared by all threads
  private List<Integer> list = new ArrayList<>();

  public ArrayListRunnable(){
    ///add some elements
    for (int i = 0; i <  10000; i++){
      list.add(i);
    }
  }
  //might run concurrently, you can not be sure
  // to be safe you must assume it does
  public void run(){
    String tName = Thread.currentThread().getName();
    while(!list.isEmpty()){
      System.out.println(tName + " removed " + list.remove(0));
    }
  }

  public static void main(String[] args)
  {
    ArrayListRunnable alr = new ArrayListRunnable();
    Thread t1 = new Thread(alr);
    Thread t2 = new Thread(alr);
    t1.start();
    t2.start();
  }
}
