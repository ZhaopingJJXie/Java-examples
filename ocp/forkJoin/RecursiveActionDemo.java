package ocp.forkJoin;

import java.util.concurrent.*;

public class RecursiveActionDemo extends RecursiveAction{
  private static final int THRESHOLD = 10000;
  private int[] data;
  private int start;
  private int end;

  public RecursiveActionDemo(int[] data, int start, int end){
    this.data = data;
    this.start = start;
    this.end = end;
  }

  public void compute(){
    if(end - start <= THRESHOLD){
      for(int i = start; i< end; i++){
        data[i] = ThreadLocalRandom.current().nextInt();
      }
    }else{
      int halfway = ((end - start) / 2 )+ start;
      RecursiveActionDemo a1 = new RecursiveActionDemo(data, start, halfway);
      a1.fork();//queue the left half of the array
      RecursiveActionDemo a2 = new RecursiveActionDemo(data, halfway, end);
      a2.compute(); //work on right half of the array
      a1.join();//wait for queued task to finish
    }

    //sometimes, you can see invokeAll(tasks...) to replace fork/compute/join combination
      // remove fork(), compute(), and join() and replace them with
       // invokeAll(a2, a1); it will compute the first task and queue the others
  }

  public static void main(String[] args){
    int[] data = new int[10_000_000];
    ForkJoinPool fjPool = new ForkJoinPool();
    RecursiveActionDemo action = new RecursiveActionDemo(data, 0, data.length);
    fjPool.invoke(action);
  }
}
