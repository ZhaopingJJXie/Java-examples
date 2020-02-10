package ocp.synch;

import java.util.stream.*;
import java.util.* ;
public class StatefulOperations{
  public static void main(String[] args){
    List<Integer> data =Collections.synchronizedList(new ArrayList<>());
    Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream()
      .map(i -> {data.add(i); return i;})//avoid stateful lambda expressions
      .forEach(i -> System.out.print( i + " "));

      System.out.println();
      for (Integer e : data){
        System.out.print(e + " ");
      }
      System.out.println();
      Arrays.asList("kangaroo","jackal","lemur") .parallelStream()
      .map(s -> {System.out.println(s); return s.toUpperCase();})
      .forEachOrdered(System.out::println);
  }
}
