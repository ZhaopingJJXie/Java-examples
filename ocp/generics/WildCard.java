package  ocp.generics;

import java.util.*;

public class WildCard{
  public static <E> void get1(List<E> list){
    // if(list instanceof ArrayList<Integer>){//illegal generic type for instanceof
      System.out.println("true");
      
  }


  public static void get2(List<?> list){
    if(list instanceof ArrayList<?>){
      System.out.println("true");
    }
  }

  public static void main(String[] args) {
    List<Integer> l1 = new ArrayList<Integer>();
    List<Integer> l2 = new ArrayList<Integer>();
    // get1(l1);
    get2(l2);

  }
}
