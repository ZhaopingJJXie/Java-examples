package ocp.concurrent;

import java.util.*;
import java.util.concurrent.*;

public class CycBar {
  String[] dog1 = {"zookie", "darko", "kori"};
  String[] dog2 = {"diken", "tine", "jojo"};
  List<String> dogList = new ArrayList<>();
  final CyclicBarrier barrier;

  class ProcessingDogs implements Runnable{
    String[] dogs;
    public void run(){
      for (int i = 0; i < dogs.length; i++){
          String newDog = dogs[i].substring(0,1).toUpperCase() + dogs[i].substring(1);
          dogs[i] = newDog;
      }
      try{
        barrier.await();
      }catch(InterruptedException | BrokenBarrierException e){
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + " Done");
    }
    ProcessingDogs(String[] dogs){
      this.dogs = dogs;
    }
}
    public CycBar(){
      barrier = new CyclicBarrier(2, () -> {
        for(int i= 0; i < dog1.length; i++){
          dogList.add(dog1[i]);
        }
        for (int j = 0; j < dog2.length; j++){
          dogList.add(dog2[j]);
        }
        System.out.println(Thread.currentThread().getName() + " Result " + dogList);
      });
        Thread t1 = new Thread(new ProcessingDogs(dog1));
        Thread t2 = new Thread(new ProcessingDogs(dog2));
        t1.start();
        t2.start();
        System.out.println("main thread is done");
        // barrier.reset();
      }

  public static void main(String[] args){
    CycBar cb = new CycBar();
  }
}
