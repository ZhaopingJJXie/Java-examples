package ocp.generics;

import java.util.*;

public class ReturnList{
  public static <E extends CharSequence> List<? super E> doIt(List<E> nums){
    return new ArrayList<E>();}
  public static <E extends Number> List<E> process(List<E> nums){
    // ArrayList<Integer> input = null;
    // ArrayList<Integer> output  = null;

    return new ArrayList<E>();
  }
  public static void main(String[] args){
    ArrayList<String> in = new ArrayList<>();
    List result;//there is no way to know the exact type stored in the List, so
    //the only way to accomplish is to put a raw type here
    result = doIt(in);
    // ArrayList<Integer> input = null;
    // ArrayList<Integer> output  = null;
    // output = process(input);
  }
}


 
