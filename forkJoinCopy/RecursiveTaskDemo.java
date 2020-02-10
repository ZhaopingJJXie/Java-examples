package ocp.forkJoin;

import java.util.*;
import java.util.concurrent.*;

public class RecursiveTaskDemo extends RecursiveTask<Double>{
  private int start;
  private int end;
  private Double[] weights;
  public RecursiveTaskDemo(Double[] weights, int start, int end){
    this.start = start;
    this.end = end;
    this.weights = weights;
  }
  protected Double compute(){
    if(end - start <= 30){
      double sum = 0;
      for(int i = start; i< end; i++){
        weights[i] = (double) new Random().nextInt(100);
        // System.out.println("Animal weighed: " + i);
        sum += weights[i];
      }
      return sum;
    }else{
      int middle = start + (end - start)/2;
      // System.out.println("[start="+start+", middle= " + middle + ", end= "+ end +"]" );
      RecursiveTask<Double> otherTask = new RecursiveTaskDemo(weights,start, middle);
      otherTask.fork();
      return new RecursiveTaskDemo(weights, middle, end).compute() + otherTask.join();
    }
  }
  public static void main(String[] args){
    long startTime = System.currentTimeMillis();
    Double[] weights = new Double[1000];
    ForkJoinTask<Double> task = new RecursiveTaskDemo(weights,0, weights.length);
    ForkJoinPool pool = new ForkJoinPool();
    Double sum = pool.invoke(task);
    // Arrays.asList(weights).stream().forEach(
    // d -> System.out.println(d.intValue() + " "));
    System.out.println("Sum: "+ sum);
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
    System.out.println("time costs: " + duration);
  }
}
