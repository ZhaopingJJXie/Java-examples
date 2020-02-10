package ocp.concurrent;

import java.util.concurrent.*;

public class CyclicBarrierDemo{

  private void removeAnimal(){System.out.println("Removing animals.");}
  private void cleanPen(){System.out.println("Cleaning the pen.");}
  private void addAnimal(){System.out.println("Adding animals.");}

  public void performTask(CyclicBarrier c1, CyclicBarrier c2){
    try{
      removeAnimal();
      c1.await();
      cleanPen();
      c2.await();
      addAnimal();
    }catch(InterruptedException | BrokenBarrierException e){
      System.out.println("exception caught: " + e);
    }
  }

  public static void main(String[] args){
    ExecutorService service = null;
    try{
      service = Executors.newFixedThreadPool(15);
      CyclicBarrierDemo manager = new CyclicBarrierDemo();
      CyclicBarrier c1 = new CyclicBarrier(5);
      CyclicBarrier c2 = new CyclicBarrier(5,
      () -> System.out.println("*** pen cleaned!"));
      for (int i =0; i < 15; i++){
        //there should be at least 4 threads, otherwise the program will hang indefinitely
        service.submit(() -> manager.performTask(c1, c2));
      }
      }finally{
        if(service != null) service.shutdown();
    }
  }
  service.shutdown(); 
}
