package ocp.forkJoin;

import java.util.*;

public class SingleThread{
  public static void main(String[] args){
    long startTime = System.currentTimeMillis();
    Double[] weights = new Double[1000];
    double sum = 0.0;
    for(int i = 0 ; i < weights.length; i++){
      weights[i] = (double)new Random().nextInt(100);
      // System.out.println("Animal weighed: " + i);
      sum += weights[i];
    }
    System.out.println("Sum: "+ sum);
    // Arrays.asList(weights).stream()
    // .forEach(d -> System.out.println(d.intValue() + " "));
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
    System.out.println("time costs: " + duration);

  }
}
