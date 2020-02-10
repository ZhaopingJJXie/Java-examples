package ocp.executorService;

import java.util.concurrent.*;
import java.util.*;

class MyClass implements Callable<Integer>{
  @Override
  public Integer call(){
    int count = ThreadLocalRandom.current().nextInt(1, 11);
    for(int i = 1; i <= count; i++){
      System.out.println("Running..." + i);
    }
    return count;
  }
}
public class CallableDemo{
  public static void main(String[] args){
    Callable<Integer> c = new MyClass();
    ExecutorService ex =
                Executors.newCachedThreadPool();
    Future<Integer> f = ex.submit(c);
    try{
      Integer v = f.get();
      System.out.println("Ran: " + v);//not recommended to put I/O in the callable
    }catch(InterruptedException | ExecutionException e){
      System.out.println("failed");
    }
    ex.shutdown();
    try{
      boolean term = ex.awaitTermination(2, TimeUnit.SECONDS);
    }catch(InterruptedException ex1){
      //did not wait the full 2 seconds
    }finally{
      if(!ex.isTerminated()){
        List<Runnable> Unfinished = ex.shutdownNow();
        //attempts to stop all actively exeuting tasks, halt the processing of
      // waiting  tasks and return a list of waiting executions
          }
    }
  }
}
