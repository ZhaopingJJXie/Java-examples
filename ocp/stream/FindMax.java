package ocp.stream;

import java.util.stream.*;
import java.util.*;
//if you use reduce(), max(), min(), average(), you retuen an OptionalDouble,
public class FindMax{
  public static void main(String[] args){
    double[] darr = {12.3, 9.8, 10.5, 11.2, 13.6, 16.7, 19.0, 32.7, 22.8, 25.0};
    OptionalDouble opdMax1 = Arrays.stream(darr)//create a DoubleStream
                              .reduce((r1, r2) -> {if(r1 >= r2) return r1; else return r2;});

   OptionalDouble opdMax2 = Arrays.stream(darr)
                    .max();
//average is not associative
  OptionalDouble opdAve1 = Arrays.stream(darr)
                    .filter(r -> r >= 10.0 && r<= 20.0)
                    .reduce((r1, r2) -> (r1 + r2)/2);
  OptionalDouble opdAve2 = Arrays.stream(darr)
                  .filter(r -> r >= 10.0 && r<= 20.0)
                  .average();

if(opdMax1.isPresent()){
  double d1 = opdMax1.getAsDouble();
  System.out.println("max from reduce() is: " + d1);
}else {System.out.println("max mot found from reduce()");}


if(opdMax2.isPresent()){
  double d2 = opdMax2.getAsDouble();
  System.out.println("max from max() is:" + d2);
}else{System.out.println("max not found from max()");}

if(opdAve1.isPresent()){
  double d3 = opdAve1.getAsDouble();
  System.out.println("average from reduce() is: " + d3);
}else {System.out.println("average not found from reduce()");}

if(opdAve2.isPresent()){
  double d4 = opdAve2.getAsDouble();
  System.out.println("average from average() is: " + d4);
}else {System.out.println("average not found from average()");}
  }
}
